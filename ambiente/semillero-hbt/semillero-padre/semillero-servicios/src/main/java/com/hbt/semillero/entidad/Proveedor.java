/**
 * Proveedor.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;

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
@Table(name = "TC_PROVEEDOR")
public class Proveedor implements Serializable {

	private Long id;

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TC_PROVEEDOR_SCID_GENERATOR", sequenceName = "SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_PROVEEDOR_SCID_GENERATOR")
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
	
	
	
	
}
