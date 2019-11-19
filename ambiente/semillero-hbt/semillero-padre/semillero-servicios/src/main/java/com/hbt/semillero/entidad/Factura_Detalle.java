/**
 * Factura_Detalle.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.JsonUtils;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
@Entity
@Table(name = "TC_FACTURA_DETALLE")
public class Factura_Detalle implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;

	private Long idcomic;
	private Long cantidad;
	private double preciounitario;
	private Proveedor proveedor;
	//private List<Factura_Detalle>detalles;





	/**
	 * Constructor de la clase.
	 */
	public Factura_Detalle() {
		proveedor = new Proveedor();
		//detalles = new ArrayList<Factura_Detalle>();
	}















	/**
	 * Constructor de la clase.
	 * @param id
	 * @param idcomic
	 * @param cantidad
	 * @param preciounitario
	 * @param proveedor
	 */
	public Factura_Detalle(Long id, Long idcomic, Long cantidad, double preciounitario, Proveedor proveedor) {
		super();
		this.id = id;
		this.idcomic = idcomic;
		this.cantidad = cantidad;
		this.preciounitario = preciounitario;
		this.proveedor = proveedor;
	}















	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TC_FACTURA_DETALLE", sequenceName = "SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_FACTURA_DETALLE")
	@Column(name = "SDID")
	public Long getId() {
		return id;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}






	/**
	 * Metodo encargado de retornar el valor del atributo proveedor
	 * @return El proveedor asociado a la clase
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo proveedor
	 * @param proveedor El nuevo proveedor a modificar.
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo idcomic
	 * @return El idcomic asociado a la clase
	 */
	@Column(name = "SDCOMIC_ID")
	public Long getIdcomic() {
		return idcomic;
	}






	/**
	 * Metodo encargado de modificar el valor del atributo idcomic
	 * @param idcomic El nuevo idcomic a modificar.
	 */
	public void setIdcomic(Long idcomic) {
		this.idcomic = idcomic;
	}






	/**
	 * Metodo encargado de retornar el valor del atributo Cantidad
	 * @return El cantidad asociado a la clase
	 */







	/**
	 * Metodo encargado de retornar el valor del atributo preciounitario
	 * @return El preciounitario asociado a la clase
	 */
	@Column(name = "SDPRECIO_UNITARIO") 
	public double getPreciounitario() {
		return preciounitario;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	@Column(name = "SDCANTIDAD")
	public Long getCantidad() {
		return cantidad;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo preciounitario
	 * @param preciounitario El nuevo preciounitario a modificar.
	 */
	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}





	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Factura_Detalle [id=" + id + ", idcomic=" + idcomic + ", cantidad=" + cantidad + ", preciounitario="
				+ preciounitario + ", proveedor=" + proveedor + "]";
	}















	public double subtotal(){

		return cantidad * preciounitario;




	}
















}
