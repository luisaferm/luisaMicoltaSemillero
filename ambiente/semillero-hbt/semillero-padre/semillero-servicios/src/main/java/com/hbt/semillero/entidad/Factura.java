/**
 * Factura.java
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

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
@Entity
@Table(name = "TC_FACTURA")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	final double IVA = 0.17;
	private double total;
	private String tipo;
	private EstadoPedido estado;
	private Usuario Cliente;
	private Factura_Detalle detalle;
	private List<Factura_Detalle>detalles;


	/**
	 * Constructor de la clase.
	 */
	public Factura() {
		detalle = new Factura_Detalle();
		detalles = new ArrayList<Factura_Detalle>();

	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TC_FACTURA_SCID_GENERATOR", sequenceName = "SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_FACTURA_SCID_GENERATOR")
	@Column(name = "SFID")
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
	 * Metodo encargado de retornar el valor del atributo total
	 * @return El total asociado a la clase
	 */
	@Column(name = "SFTOTAL")
	public double getTotal() {


		total= detalle.subtotal();

		return total;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo IVA
	 * @return El iVA asociado a la clase
	 */
	@Column(name = "SFIVA")
	public double getIVA() {
		return IVA;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo tipo
	 * @return El tipo asociado a la clase
	 */
	@Column(name = "SFTIPO")
	public String getTipo() {
		return tipo;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo tipo
	 * @param tipo El nuevo tipo a modificar.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	@Column(name = "SFESTADO")
	public EstadoPedido getEstado() {
		return estado;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * @param estado El nuevo estado a modificar.
	 */
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	public class Detalle{

	}

	//	public double calcularTotal(){
	//
	//		return 
	//				
	//	}














}
