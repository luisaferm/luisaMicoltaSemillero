/**
 * GestionarPedidoBean.java
 */
package com.hbt.semillero.ejb;

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
import com.hbt.semillero.entidad.Factura;
import com.hbt.semillero.entidad.Factura_Detalle;

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
		
		Factura factura = convertirFacturaDTOToFactura(facturaDTO);
		em.persist(factura);
		

	}

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
		facturaDTO.setTipo((factura.getTipo()));
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



}
