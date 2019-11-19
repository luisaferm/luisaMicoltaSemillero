/**
 * EstadoPedido.java
 */
package com.hbt.semillero.entidad;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public enum EstadoPedido {
	SOLICITADO("enum.estadopedido.solicitado"), 
	PENDIENTE("enum.estadopedido.pendiente"),
	ENTREGADO("enum.estadopedido.entregado");




	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion
	 */
	private String codigoMensaje;


	EstadoPedido(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo codigoMensaje
	 * @return El codigoMensaje asociado a la clase
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo codigoMensaje
	 * @param codigoMensaje El nuevo codigoMensaje a modificar.
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}



}
