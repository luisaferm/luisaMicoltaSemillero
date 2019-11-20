/**
 * Usuario.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
@Entity
@Table(name = "TC_USUARIO")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	private LocalDate fechaCreacion;
	private EstadoEnum estado;
	private Persona persona;
	
	
	
	/**
	 * Constructor de la clase.
	 */
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 * @param fechaCreacion
	 * @param estado
	 */
	public Usuario(Long id, String nombre, LocalDate fechaCreacion, EstadoEnum estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TC_USUARIO_SUID_GENERATOR", sequenceName = "SEQ_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_USUARIO_SUID_GENERATOR")
	@Column(name = "SUID")
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
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	@Column(name = "SUNOMBRE")
	public String getNombre() {
		return nombre;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo fechaCreacion
	 * @return El fechaCreacion asociado a la clase
	 */
	@Column(name = "SUFECHA_CREACION")
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo fechaCreacion
	 * @param fechaCreacion El nuevo fechaCreacion a modificar.
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	@Column(name = "SUESTADO")
	public EstadoEnum getEstado() {
		return estado;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * @param estado El nuevo estado a modificar.
	 */
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo persona
	 * @return El persona asociado a la clase
	 */
	@Column(name = "SUIDPERSONA")
	//@ForeignKey(name = "SUIDPERSONA")
	public Persona getPersona() {
		return persona;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo persona
	 * @param persona El nuevo persona a modificar.
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	

	
	
	
	

}
