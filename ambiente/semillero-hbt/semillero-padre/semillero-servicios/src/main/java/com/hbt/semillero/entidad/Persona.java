/**
 * Persona.java
 */
package com.hbt.semillero.entidad;

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
@Table(name = "TC_PERSONA")
public class Persona {
	
	private Long id;
	private String nonbre;
	private String identificacion;
	/**
	 * Constructor de la clase.
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nonbre
	 * @param identificacion
	 */
	public Persona(Long id, String nonbre, String identificacion) {
		super();
		this.id = id;
		this.nonbre = nonbre;
		this.identificacion = identificacion;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TC_PERSONA_SPID_GENERATOR", sequenceName = "SEQ_PERSONA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_PERSONA_SPID_GENERATOR")
	@Column(name = "SPID")
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
	 * Metodo encargado de retornar el valor del atributo nonbre
	 * @return El nonbre asociado a la clase
	 */
	public String getNonbre() {
		return nonbre;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nonbre
	 * @param nonbre El nuevo nonbre a modificar.
	 */
	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo identificacion
	 * @return El identificacion asociado a la clase
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo identificacion
	 * @param identificacion El nuevo identificacion a modificar.
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	

	
}
