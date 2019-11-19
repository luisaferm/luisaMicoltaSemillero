/**
 * Pedido.java
 */
package com.hbt.semillero.dto;

import com.hbt.semillero.dto.FacturaDTO.DetalleDTO;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public class Pedido {

	private FacturaDTO 	FacturaDTO;
	private FacturaDTO.DetalleDTO detalleDTO;
	private ComicDTO comicDTO;








	/**
	 * Constructor de la clase.
	 * @param facturaDTO
	 * @param detalleDTO
	 * @param comicDTO
	 */
	public Pedido(com.hbt.semillero.dto.FacturaDTO facturaDTO, DetalleDTO detalleDTO, ComicDTO comicDTO) {
		super();
		FacturaDTO = facturaDTO;
		this.detalleDTO = detalleDTO;
		this.comicDTO = comicDTO;
	}




	/**
	 * Constructor de la clase.
	 */
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void crearPedido(){



	}




}
