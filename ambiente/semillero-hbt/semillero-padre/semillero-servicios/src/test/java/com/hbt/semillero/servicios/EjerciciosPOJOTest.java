/**
 * EjerciciosPOJOTest.java
 */
package com.hbt.semillero.servicios;

import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.pojo.EjerciciosPOJO;

/**
 * <b>Descripción:<b> Clase que se utiliza para probar el los metodos 
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public class EjerciciosPOJOTest {

	@Test(enabled = false)
	public void ejercicio1Test() {

		// Este indentificador es valido ya que empieza en Letra.
		String A$B;

		// Este identificador es valido ya que empieza en letra y no es una palabra reservada.

		String _helloWorld;

		// True = Este identificador no es valido ya que es una pablabra reservada.


	}

	@Test(enabled = false)
	public void ejercicio2Test(){

		EjerciciosPOJO ejerciciosPOJO;


	}

	@Test(enabled = false)
	public void ejercicio3Test(){

		EjerciciosPOJO ejerciciosPOJO = new EjerciciosPOJO();
		int numero1=5;
		int numero2=222;
		int numero3=0;

		Assert.assertEquals(true, ejerciciosPOJO.ejercicio3(numero1));
		Assert.assertEquals(false, ejerciciosPOJO.ejercicio3(numero2));
		//Assert.assertEquals(true, ejerciciosPOJO.ejercicio3(numero3));
	}

	@Test
	public void ejercicio4Test(){

		EjerciciosPOJO ejerciciosPOJO = new EjerciciosPOJO();
		LocalDate fechaNacimiento= LocalDate.of(1993,05, 04);
		int hoy = LocalDate.now().getYear();


		Assert.assertEquals(hoy,ejerciciosPOJO.ejercicio4(fechaNacimiento, 26));

	}

	@Test
	public void ejercicio8Test(){
		EjerciciosPOJO ejerciciosPOJO = new EjerciciosPOJO();
		int valor = 5550;
		System.out.println("Hola");

		System.out.println(" EL CAMBIO DE " + valor +" es :"+ ejerciciosPOJO.ejercicio8(valor));


	}
}
