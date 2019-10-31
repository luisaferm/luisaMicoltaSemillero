import { Component, OnInit } from '@angular/core';

/**
 * @description Componente Primer Ejercicio, el cual contiene mi nombre
 * 
 * @author Luisa Micolta Espitia <luisafer.micolta@gmail.com>
 */
@Component({
  selector: 'primer-component',
  templateUrl: './primer-component.html',
  styleUrls: ['./primer-componente.css']
})
export class PrimerComponent {

  public nombre : String = 'Luisa Micolta Espitia';
  public separador : String = '-';
  public ciudad : String = 'Tunja'

}