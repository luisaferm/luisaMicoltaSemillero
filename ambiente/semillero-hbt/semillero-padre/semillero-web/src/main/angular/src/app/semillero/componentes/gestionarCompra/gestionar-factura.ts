
import { FacturaDTO } from '../../dto/factura.dto';
import { DetalleDTO } from '../../dto/detalle.dto';
import { ComicDTO } from '../../dto/comic.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { GestionarFacturaService } from '../../servicios/gestionar.factura.service';


/**
 * @description Componenete gestionar factura, el cual contiene la logica CRUD
 * 
 * @author Luisa Micolta
 */
@Component({
    selector: 'gestionar-factura',
    templateUrl: './gestionar-factura.html',
    styleUrls: ['./gestionar-factura.css']
})
export class GestionarFacturaComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarFacturaForm: FormGroup;

    public factura: FacturaDTO;
    public detalle: DetalleDTO;
    public comic: ComicDTO;


    /**
     * Atributo que contendra la lista de facturas creadas
     */
    public listaFacturas: Array<FacturaDTO>;

    public idFactura: number = 0;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted: boolean;

    /**
     * @description Este es el constructor del componente GestionarComicComponent
     * @author Luisa Micolta
     */
    constructor(private fb: FormBuilder,
        private router: Router,
        private GestionarFacturaService: GestionarFacturaService) {
        this.gestionarFacturaForm =
            this.fb.group({
                id: [null],
                comic: [null, Validators.required],
                cantidad: [null],
                preciounitario: [null],
                iva: [null],
                estado: [null],
                tipo: [null],
                cliente: [null],                
                total: [null],
                index: [null]
                
            });

    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Luisa Micolta
     */
    ngOnInit(): void {
        console.log("Ingreso al al evento oninit");
        this.consultarFacturas();

    }

    /**
    * @description Metodo encargado de consultar los facturas existentes
    * @author Luisa Micolta
    */
    public consultarFacturas(): void {
        this.GestionarFacturaService.consultarFacturas().subscribe(listafacturas => {
          this.listaFacturas = listafacturas;
        }, error => {
           console.log(error);
        });
    }
    /**
     * @description Metodo que permite validar el formulario y crear o actulizar 
     */
    public crearActualizarFactura(): void {
        this.submitted = true;
        if (this.gestionarFacturaForm.invalid) {
            return;
        }
        let actulizar: Boolean = this.gestionarFacturaForm.controls.editar.value;
        let index: number = this.gestionarFacturaForm.controls.index.value;

        this.factura = new FacturaDTO();
        this.detalle = new DetalleDTO();


        this.detalle.comic = this.gestionarFacturaForm.controls.nombre.value;

    
    }
    

   /**
    * 
    */
    public consultarComic(posicion : number) : void {

 
    }
 
    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Diego Fernando Alvarez Silva
     */
    
    get f() { 
        return this.gestionarFacturaForm.controls;
    }
}
