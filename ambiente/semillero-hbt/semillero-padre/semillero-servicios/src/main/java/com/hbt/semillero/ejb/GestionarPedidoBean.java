/**
 * GestionarPedidoBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;


import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;

import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.EstadoPedido;
import com.hbt.semillero.entidad.Factura;


/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarPedidoBean {

	@PersistenceContext
	private EntityManager em;

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearFactura(FacturaDTO facturaDTO) {
		// Entidad nueva
		// Se almacena la informacion y se maneja la enidad Factura
		if(realizarPedido()==true){
			Factura factura = convertirFacturaDTOToFactura(facturaDTO);
			em.persist(factura);

		}
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void ModificarFactura(Long idfactura, Long cantComics, String nomProveedor, FacturaDTO facturaDTO) {
		Factura facturaModificar ;
		if(facturaDTO==null) {
			// Entidad a modificar
			facturaModificar = em.find(Factura.class, idfactura);
		}else {
			facturaModificar = convertirFacturaDTOToFactura(facturaDTO);
		}
		//facturaModificar.;
		//em.merge(comicModificar);

	}
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void cambiarEstadoFactura(Long idfactura, FacturaDTO facturaDTO) {
		Factura facturaModificar ;

		if(facturaDTO==null) {
			// Entidad a modificar
			facturaModificar = em.find(Factura.class, idfactura);
		}else {
			facturaModificar = convertirFacturaDTOToFactura(facturaDTO);
		}

		if(realizarPedido()==true){
			facturaModificar.setEstado(EstadoPedido.SOLICITADO);
			em.merge(facturaModificar);
		}

		else{
			facturaModificar.setEstado(EstadoPedido.PENDIENTE);
			em.merge(facturaModificar);
		}
	}
	

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<FacturaDTO> consultarFacturas() {
		List<FacturaDTO> resultadosFacturaDTO = new ArrayList<FacturaDTO>();
		List<Factura> resultados = em.createQuery("select c from TC_FACTURA c").getResultList();
		for (Factura factura:resultados) {
			resultadosFacturaDTO.add(convertirFacturaToFacturaDTO(factura));
		}
		return resultadosFacturaDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un comic a un comicDTO
	 * 
	 * @param comic
	 * @return
	 */
	private FacturaDTO convertirFacturaToFacturaDTO(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		if(factura.getId()!=null) {
			facturaDTO.setId(factura.getId());
		}
		
		//facturaDTO.setEstado(factura.getEstado());
		return facturaDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un comicDTO a un comic
	 * 
	 * @param comic
	 * @return
	 */
	private Factura convertirFacturaDTOToFactura(FacturaDTO facturaDTO) {
		Factura factura = new Factura();

		if(facturaDTO.getId()!=null) {
			factura.setId(facturaDTO.getId());
		}
		factura.setTipo((facturaDTO.getTipo()));
		//facturaDTO.setEstado(factura.getEstado());


		return factura;
	}

	/**
	 * 
	 * Metodo encargado de validar si se puede hacer el pedido
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @return
	 */

	public boolean realizarPedido() {
		try{

			Factura factura = new Factura();

			if(factura.calcularTotal()<250000.0)
				return true;
		}
		catch(Exception e) {
			System.out.println("No se puede realizar pedido porque excede los 250000"+e.getMessage());
		}

		return false;
	}

	


}
