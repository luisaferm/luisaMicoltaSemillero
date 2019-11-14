import { ComicDTO } from '../../../dto/comic.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: 'consultar-comic',
    templateUrl: './consultar-comic.html'
})

export class ConsultarComicComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     * @author Luisa Fernanda Micolta Espitia <luisafer.micolta@gmail.com>
     */
    public consultarComic : FormGroup;


    /**
     * @description Este es el constructor del componente GestionarComicComponent
     * @author Luisa Fernanda Micolta Espitia <luisafer.micolta@gmail.com>
     */
    constructor(private fb : FormBuilder,private router : Router,private activatedRoute: ActivatedRoute) { 

        let data = this.activatedRoute.snapshot.params;
        
        this.consultarComic = this.fb.group({
            nombre : [{value: data.nombre, disabled: true}],
            editorial : [{value: data.editorial, disabled: true}],
            tematica : [{value: data.tematica, disabled: true}],
            coleccion : [{value: data.coleccion, disabled: true}],
            numeroPaginas : [{value: data.numeroPaginas, disabled: true}],
            precio : [{value: data.precio, disabled: true}],
            autores : [{value: data.autores, disabled: true}],
            color : [{value: data.color, disabled: true}]
        });
    }   

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Luisa Fernanda Micolta Espitia <luisafer.micolta@gmail.com>
     */
    ngOnInit(): void {
        
    }    

    /**
     * @description Evento encargado de direccionar a gestionar comic
     * @author Luisa Fernanda Micolta Espitia <luisafer.micolta@gmail.com>
     */
    public regresar() : void {
        this.router.navigate(['gestionar-comic']);
    }
}