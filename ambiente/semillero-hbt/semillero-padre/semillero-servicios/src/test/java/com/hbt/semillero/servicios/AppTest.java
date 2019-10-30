package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.entidades.EstadoEnum;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}

	@Test
	public void primeraPU() {
		Long resultadoEsperado = 150L;
		Long sumando1 = 100L;
		Long sumando2 = 50L;
		Long resultado = sumando1 + sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
		resultadoEsperado = 200L;
		Assert.assertNotEquals(resultado, resultadoEsperado);

	}

	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		return cadenaInvertida;
	}

	@Test
	public void segundaPU() {
		String cadena = "Luisa Micolta";
		String cadenaInvertida = invertirCadena(cadena);
		String cadenaEsperada = "atlociM asiuL";

		Assert.assertEquals(cadenaInvertida, cadenaEsperada);
		Assert.assertNotEquals(cadena, cadenaInvertida);
		Assert.assertTrue(cadenaEsperada.equals(cadenaInvertida));

	}

	@Test
	public void terceraPU() {

		EstadoEnum estadoEnumActivo = EstadoEnum.ACTIVO;
		EstadoEnum estadoEnumInactivo = EstadoEnum.INACTIVO;


		/**
		 * Assert que valida que el valor de estadoEnumActivo es ACTIVO
		 */
		Assert.assertNotSame(estadoEnumActivo, "ACTIVO", "El estado es ACTIVO");
		System.out.println("\nNombre de la constante = " + estadoEnumActivo);


		/**
		 *  Assert valida la posicion de las variables Enum
		 */
		Assert.assertEquals(estadoEnumInactivo.ordinal(), 1);
		System.out.println("\nLa posicion del Enum ACTIVO ES = " + estadoEnumActivo.ordinal());
		System.out.println("La posicion del Enum INACTIVO ES = " + estadoEnumInactivo.ordinal() + "\n");



		/**
		 * Recorre el arreglo estadoEnum y muestra sus valores
		 */
		
		for (EstadoEnum estadoEnum : EstadoEnum.values()) {

			System.out.println("Valor arreglo ENUM =" + estadoEnum);
		}

	}
}
