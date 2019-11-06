import { Component } from '@angular/core';

/**
 * @description La clase CrearPersonaComponent  permite crear persona
 * @author Luisa Micolta Espitia <luisafer.micolta@gmail.com>
 */

@Component({
  selector: 'crear-persona',
  templateUrl: './crear-persona-component.html',
  styleUrls: ['./crear-persona-component.css']
})


export class CrearPersonaComponent {
  private varibleGlobal: string;
  /**public miVariable : any [];  ----  De esta forma miVariable se esta declarando de forma Global */
  public listaApellidos: Array<any> = new Array<any>(); /** <string> <ComicDTO> */
  public listaNombres = []; // tamien se puede inicializar con [] 

  ngOninit(): void {


    let nombreVariableLocal = "Luisa Fernanda";
    let apellidoVariableLocal: string = "Micolta Espitia";
    console.log(nombreVariableLocal);
    console.log(apellidoVariableLocal);

    let miVariable: any = { /** De esta forma miVariable se esta declarando de forma Local*/
      id: 1,
      nombre: "Carlos",
      direccion: "Carrera 21",
      colores: [1, 2, 3, 4, 5]

    };
    miVariable.genero = " Masculino ";
    this.listaApellidos.push(miVariable);
    alert("Longitud de la lista:" + this.listaApellidos.length);
    alert("Longitud de la lista:" + this.listaNombres.length);

    let variableNumero: number = 100.23; /** El tipo number permite numeros enteros y decimales*/
    let variableString: string = "semillero";
    let mivariableBolean : boolean = true;
  }


  

  publicinicializarComponente() : Array < string > {
    let retorno: any;
    let objeto=undefined;
    if(objeto!== null && objeto !== undefined) {
    alert("No es nulo")
  } else {
    alert("Si es nulo");
  }

  //console.log(1 == 1); true
  //console.log("1" == 1); true cuanfo se pine 2 iguales solo valida el valor
  //console.log(1 === 1); true
  //console.log("1" === 1); false "===" aca valida si es igual tanto el tipo como el valor 
  return retorno;
}


}