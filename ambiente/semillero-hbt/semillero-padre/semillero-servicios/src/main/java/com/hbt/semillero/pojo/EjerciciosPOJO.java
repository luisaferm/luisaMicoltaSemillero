/**
 * EjerciciosPOJO.java
 */
package com.hbt.semillero.pojo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;

/**
 * <b>Descripción:<b> Clase para realizar ejercicos de Logica
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */

/*
 * 
 */
public class EjerciciosPOJO {

	private static String brand;
	private static boolean empty;
	List<Long> numeros = new ArrayList<>();




	/**
	 * Constructor de la clase.
	 */
	public EjerciciosPOJO() {
		numeros = new ArrayList<>();
	}

	public static void ejercicio2(){


		System.out.println("Empty =" + empty);
		System.out.println(",Brand ="+ brand);
	}

	public static boolean ejercicio3(int numero){

		int aux =0;

		for(int i =1; i<(numero+1); i++){

			if(numero%i==0 )

				if(aux !=2){
					System.out.println("No es primo");
					return false;
				}
				else
					System.out.println("es primo");
			return true;


		}
		return false;

	}


	public int ejercicio4(LocalDate fechaNacimiento,int edad ){

		int fecharesultado = fechaNacimiento.getYear() +edad;

		return fecharesultado;


	}
	/*
	 * Metodo que sirve para agregar los numeros
	 */

	public  void agregarNumeros(Long numero) {
		numeros.add(numero);


	}

	/*
	 * Metodo que ordena los numeros de la lista
	 */

	public void ordenarnumeros(List<Long> numeros){
		Collections.sort(numeros);
	}


	public String  ejercicio8 (int valor){

		int monedas[]= {1000,500,200,100,50};
		int i=0;
		int nmonedas=0;


		while(i <=5){

			if(valor>=monedas[i]){
				nmonedas = valor/monedas[i]-((valor%monedas[i])/monedas[i]);
				valor= valor-(nmonedas*monedas[i]);
			}
			i++;
			return nmonedas+" monedas de "+monedas[i] ;
		}
		return null;

	}
/**
 * 
 * Metodo encargado de validar el ejercicio 9
 * <b>Caso de Uso</b>
 * @author Family
 * 
 * @throws Exception
 */
	public void ejercicio9() throws Exception{
		throw new Exception();

	}
}
