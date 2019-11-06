import { Component, OnInit } from '@angular/core';
import { ComicEjercicio } from '../../clases_ejercicios/comic-ejercicio';
/**
 * @description Componente Primer Ejercicio, el cual contiene los ejercicios de la Segnda Sesion
 * 
 * @author Luisa Micolta Espitia <luisafer.micolta@gmail.com>
 */
@Component({
  selector: 'primer-component',
  templateUrl: './primer-component.html',
  styleUrls: ['./primer-componente.css']
})
export class PrimerComponent {

  // public nombre : String = 'Luisa Micolta Espitia';
  //public separador : String = '-';
  //public ciudad : String = 'Tunja'
  public listaComics = [];


  ngOnInit(): void {


    this.instanciaObjeto();
  }

  public instanciaObjeto(): void {



    // OBJETO 1

    let comic1 = new ComicEjercicio();
    comic1.id = 1;
    comic1.nombre = "Batman";
    comic1.editorial = "DC";
    comic1.tematica = "Accion";
    comic1.numeroPaginas = 50;
    comic1.precio = 60, 500.99;
    comic1.autores = "Pedrito Barrera";
    comic1.aColor = true;
    comic1.fechaVenta = new Date(10 / 10 / 2019);
    comic1.estado = "Activo";
    this.listaComics.push(comic1);

    // OBJETO 2
    let comic2 = new ComicEjercicio();

    comic2.id = 2;
    comic2.nombre = "Capitan America";
    comic2.editorial = "Marvel";
    comic2.tematica = "Accion";
    comic2.numeroPaginas = 456;
    comic2.precio = 86, 523.99;
    comic2.autores = "Chris Evans.";
    comic2.aColor = false;
    comic2.fechaVenta = new Date(6 / 12 / 2015);
    comic2.estado = "Activo";
    this.listaComics.push(comic2);

    // OBJETO 3
    let comic3 = new ComicEjercicio();

    comic3.id = 3;
    comic3.nombre = "DEATHSTROKE: ARKHAM";
    comic3.editorial = "ECC Ediciones";
    comic3.tematica = "Accion";
    comic3.numeroPaginas = 264;
    comic3.precio = 86, 938.89;
    comic3.autores = "Adam Glass, Bernard Chang, Carlo Pagulayan, Christopher Priest, Ed Benes, Fernando Pasarín ";
    comic3.aColor = false;
    comic3.fechaVenta = new Date(6 / 12 / 2015);
    comic3.estado = "Activo";
    this.listaComics.push(comic3);

    // OBJETO 4
    let comic4 = new ComicEjercicio();

    comic4.id = 4;
    comic4.nombre = "SUPERMAN Y BATMAN: GENERACIONES (Edición integral)";
    comic4.editorial = "ECC Ediciones";
    comic4.tematica = "Accion";
    comic4.numeroPaginas = 456;
    comic4.precio = 86, 523.99;
    comic4.autores = "John Byrne";
    comic4.aColor = true;
    comic4.fechaVenta = new Date(29 / 10 / 2019);
    comic4.estado = "Activo";
    this.listaComics.push(comic4);

    // OBJETO 5
    let comic5 = new ComicEjercicio();

    comic5.id = 5;
    comic5.nombre = "FLASH";
    comic5.editorial = "ECC Ediciones";
    comic5.tematica = "Accion";
    comic5.numeroPaginas = 234;
    comic5.precio = 12, 215.79;
    comic5.autores = "Joshua Williamson, Scott Kolins ";
    comic5.aColor = true;
    comic5.fechaVenta = new Date(29 / 10 / 2019);
    comic5.estado = "Activo";
    this.listaComics.push(comic5);

    let lista = this.listaComics;
    for (let i = 0; i < lista.length; i++) {
      const element = lista[i];
      console.log(element);
      console.log(JSON.stringify({ element }));

    }

  }

  public eliminarComic() : void{
    let lista = this.listaComics;
    //let comic = new ComicEjercicio();
    let mostarMensaje : string ;

    if(lista.length >= 3 ){
      
      mostarMensaje ="Se ha eliminado el Comic: "+ lista[2].nombre;
      lista.splice(2,1);
      console.log(JSON.stringify({ mostarMensaje }));
     // return mostarMensaje;
    }
    else{
      mostarMensaje="Ya no hay Comics en la Posicion 3 para eliminar"
      console.log(JSON.stringify({ mostarMensaje }));
      //return mostarMensaje;
    }
    
    
  }

}