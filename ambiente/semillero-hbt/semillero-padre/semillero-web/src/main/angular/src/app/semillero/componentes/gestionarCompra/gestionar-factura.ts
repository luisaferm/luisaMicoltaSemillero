
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

    /**
     * Atributo que contendra la informacion del comic
     */
    public factura: FacturaDTO;
    public detalle: DetalleDTO;
    public comic: ComicDTO;


    /**
     * Atributo que contendra la lista de comics creados
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
        private gestionarComicService: GestionarFacturaService) {
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
                /*

   
    public comic: ComicDTO;
   
    public cantidad: number;
    
    private preciounitario: number;
    
    private factura: FacturaDTO;

    factura

    public id: number;
      public iva: number ;
       public total: number;
        private tipo: string;
          private  estado: string;
           private cliente: string;

                */
            });

        //  this.listaComics = new Array<ComicDTO>();
        // this.comic = new ComicDTO();
    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Luisa Micolta
     */
    ngOnInit(): void {
        console.log("Ingreso al al evento oninit");
        this.consultarComics();

    }

    /**
    * @description Metodo encargado de consultar los comics existentes
    * @author Luisa Micolta
    */
    public consultarComics(): void {
        //this.gestionarComicService.consultarComics().subscribe(listaComics => {
        //  this.listaComics = listaComics;
        //}, error => {
        //   console.log(error);
        //});
    }
    /**
     * @description Metodo que permite validar el formulario y crear o actulizar un comic
     */
    public crearActualizarComic(): void {
        this.submitted = true;
        if (this.gestionarFacturaForm.invalid) {
            return;
        }
        let actulizar: Boolean = this.gestionarFacturaForm.controls.editar.value;
        let index: number = this.gestionarFacturaForm.controls.index.value;

        this.factura = new FacturaDTO();
        this.detalle = new DetalleDTO();


        this.detalle.comic = this.gestionarFacturaForm.controls.nombre.value;

    
        /*
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

public comic: ComicDTO;

public cantidad: number;

private preciounitario: number;

private factura: FacturaDTO;

factura

public id: number;
public iva: number ;
public total: number;
private tipo: string;
  private  estado: string;
   private cliente: string;


                                    this.factura. = this.gestionarComicForm.controls.nombre.value;
        this.comic.editorial = this.gestionarComicForm.controls.editorial.value;
        this.comic.tematica = this.gestionarComicForm.controls.tematica.value;
        this.comic.coleccion = this.gestionarComicForm.controls.coleccion.value;
        this.comic.numeroPaginas = this.gestionarComicForm.controls.numeroPaginas.value;
        this.comic.precio = this.gestionarComicForm.controls.precio.value;
        this.comic.autores = this.gestionarComicForm.controls.autores.value;
        this.comic.color = this.gestionarComicForm.controls.color.value;
        this.comic.cantidad = 12;

        this.gestionarComicService.crearComic(this.comic).subscribe(resultadoDTO => {
            if (resultadoDTO.exitoso) {
                this.consultarComics();
                this.limpiarFormulario();
            }
        }, error => {
            console.log(error);
        });

        if (actulizar) {
            this.comic.id = this.gestionarComicForm.controls.id.value;
            this.listaComics.splice(index, 1, this.comic);
        }
        else {
            this.idComic++;
            this.comic.id = this.idComic + "";
            this.listaComics.push(this.comic);
        }
        this.limpiarFormulario();

    }

    /**
     * Metodo que permite consultar un comic de la tabla y sus detalles e inhabilitar el formulario
     * @param posicion en la lista del comic seleccionado
     */
    /*
    public consultarComic(posicion : number) : void {
        let comic = this.listaComics[posicion];
        this.gestionarComicForm.controls.nombre.setValue(comic.nombre);
        this.gestionarComicForm.controls.editorial.setValue(comic.editorial);
        this.gestionarComicForm.controls.tematica.setValue(comic.tematica);
        this.gestionarComicForm.controls.coleccion.setValue(comic.coleccion);
        this.gestionarComicForm.controls.numeroPaginas.setValue(comic.numeroPaginas);
        this.gestionarComicForm.controls.precio.setValue(comic.precio);
        this.gestionarComicForm.controls.autores.setValue(comic.autores);
        this.gestionarComicForm.controls.color.setValue(comic.color);
        this.gestionarComicForm.controls.nombre.disable();
        this.gestionarComicForm.controls.editorial.disable();
        this.gestionarComicForm.controls.tematica.disable();
        this.gestionarComicForm.controls.coleccion.disable();
        this.gestionarComicForm.controls.numeroPaginas.disable();
        this.gestionarComicForm.controls.precio.disable();
        this.gestionarComicForm.controls.autores.disable();
        this.gestionarComicForm.controls.color.disable();
//        this.gestionarComicForm.controls.color.enable(); para habilitar el campo
 
    }
 
    //public editarComic(comic : any) : void {
    //    this.router.navigate(['bienvenida',comic]);
    //}
 
    /**
     * Metodo que permite consultar un comic de la tabla y sus detalles e inhabilitar el formulario
     * @param posicion en la lista del comic seleccionado
     */
    /*
    public editarComic(posicion: number): void {
        let comic = this.listaComics[posicion];
 
        this.gestionarComicForm.controls.editar.setValue(true);
        this.gestionarComicForm.controls.index.setValue(posicion);
 
        this.gestionarComicForm.controls.nombre.setValue(comic.nombre);
        this.gestionarComicForm.controls.editorial.setValue(comic.editorial);
        this.gestionarComicForm.controls.tematica.setValue(comic.tematica);
        this.gestionarComicForm.controls.coleccion.setValue(comic.coleccion);
        this.gestionarComicForm.controls.numeroPaginas.setValue(comic.numeroPaginas);
        this.gestionarComicForm.controls.precio.setValue(comic.precio);
        this.gestionarComicForm.controls.autores.setValue(comic.autores);
        this.gestionarComicForm.controls.color.setValue(comic.color);
        this.gestionarComicForm.controls.id.setValue(comic.id);
 
        //        this.gestionarComicForm.controls.color.enable(); para habilitar el campo
 
    }
 
    //  public navComic(comic: any): void {
    //    this.router.navigate(['bienvenida', comic]);
    // }
 
    public eliminarComic(posicion: number): void {
        this.listaComics.splice(posicion, 1);
    }
 
    private limpiarFormulario() : void {
        this.submitted = false;
        this.gestionarComicForm.controls.nombre.setValue(null);
        this.gestionarComicForm.controls.editorial.setValue(null);
        this.gestionarComicForm.controls.tematica.setValue(null);
        this.gestionarComicForm.controls.coleccion.setValue(null);
        this.gestionarComicForm.controls.numeroPaginas.setValue(null);
        this.gestionarComicForm.controls.precio.setValue(null);
        this.gestionarComicForm.controls.autores.setValue(null);
        this.gestionarComicForm.controls.color.setValue(null);
    }
 
    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Diego Fernando Alvarez Silva
     */
    /*
    get f() { 
        return this.gestionarComicForm.controls;
    }*/
}
}