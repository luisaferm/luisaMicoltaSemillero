/**
 * GestionarFacturaRest.java
 */
package com.hbt.semillero.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.GestionarPedidoBean;

/**
 * <b>Descripción:<b>  Clase que determina el servicio rest que permite gestionar
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
@Path("/GestionarFactura")
public class GestionarFacturaRest {

	private GestionarPedidoBean gestionarPedidoBean;



	@POST
	@Path("/crearFactura")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearFactura(FacturaDTO facturaDTO) {
		gestionarPedidoBean.crearFactura(facturaDTO);
		
		ResultadoDTO resultadoDTO = new ResultadoDTO(Boolean.TRUE, "Factura creada exitosamente");
		return resultadoDTO;

	}
	/**
	 * 
	 * Metodo encargado de traer la informacion de un comic determiando
	 * http://localhost:8085/semillero-servicios/rest/GestionarFacturaRest/consultarFacturas
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/consultarFacturas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDTO> consultarFacturas() {
		return gestionarPedidoBean.consultarFacturas();

	}
}
