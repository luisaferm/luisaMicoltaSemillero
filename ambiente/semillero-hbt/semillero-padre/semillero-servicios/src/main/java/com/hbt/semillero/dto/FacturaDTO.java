/**
 * FacturaDTO.java
 */
package com.hbt.semillero.dto;

import java.math.BigDecimal;

import com.hbt.semillero.entidad.EstadoEnum;


/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public class FacturaDTO {

	private static final long serialVersionUID = 1L;

	private Long id;
	private BigDecimal iva;
	private BigDecimal total;
	private String tipo;
	private EstadoEnum estado;
	private Long cliente;




	/**
	 * Constructor de la clase.
	 */
	public FacturaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor de la clase.
	 * @param id
	 * @param iva
	 * @param total
	 * @param tipo
	 * @param estado
	 * @param cliente
	 */
	public FacturaDTO(Long id, BigDecimal iva, BigDecimal total, String tipo, EstadoEnum estado, Long cliente) {
		super();
		this.id = id;
		this.iva = iva;
		this.total = total;
		this.tipo = tipo;
		this.estado = estado;
		this.cliente = cliente;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo cliente
	 * @return El cliente asociado a la clase
	 */
	public Long getCliente() {
		return cliente;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cliente
	 * @param cliente El nuevo cliente a modificar.
	 */
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
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
	 * Metodo encargado de retornar el valor del atributo iva
	 * @return El iva asociado a la clase
	 */
	public BigDecimal getIva() {
		return iva;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo iva
	 * @param iva El nuevo iva a modificar.
	 */
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo total
	 * @return El total asociado a la clase
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo total
	 * @param total El nuevo total a modificar.
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tipo
	 * @return El tipo asociado a la clase
	 */
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

	public static FacturaDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, FacturaDTO.class);
	}

	/**
	 * Método encargado de convertir los datos recibidos en ComicDTO al JSON
	 * esperado
	 * 
	 * @param dto DTO
	 * 
	 * @return Json
	 */
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}


	/**
	 * <b>Descripción:<b> Clase que determina
	 * <b>Caso de Uso:<b> 
	 * @author Family
	 * @version 
	 */
	public class DetalleDTO {

		private static final long serialVersionUID = 1L;
		private Long id;
		private Long idfactura;
		private Long idcomic;
		private Long Cantidad;
		private BigDecimal preciounitario;



		/**
		 * Constructor de la clase.
		 */
		public DetalleDTO() {
			super();
			// TODO Auto-generated constructor stub
		}



		/**
		 * Constructor de la clase.
		 * @param id
		 * @param idfactura
		 * @param idcomic
		 * @param cantidad
		 * @param preciounitario
		 */
		public DetalleDTO(Long id, Long idfactura, Long idcomic, Long cantidad, BigDecimal preciounitario) {
			super();
			this.id = id;
			this.idfactura = idfactura;
			this.idcomic = idcomic;
			Cantidad = cantidad;
			this.preciounitario = preciounitario;
		}



		/**
		 * Metodo encargado de retornar el valor del atributo id
		 * @return El id asociado a la clase
		 */
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
		 * Metodo encargado de retornar el valor del atributo idfactura
		 * @return El idfactura asociado a la clase
		 */
		public Long getIdfactura() {
			return idfactura;
		}



		/**
		 * Metodo encargado de modificar el valor del atributo idfactura
		 * @param idfactura El nuevo idfactura a modificar.
		 */
		public void setIdfactura(Long idfactura) {
			this.idfactura = idfactura;
		}



		/**
		 * Metodo encargado de retornar el valor del atributo idcomic
		 * @return El idcomic asociado a la clase
		 */
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
		public Long getCantidad() {
			return Cantidad;
		}



		/**
		 * Metodo encargado de modificar el valor del atributo Cantidad
		 * @param cantidad El nuevo cantidad a modificar.
		 */
		public void setCantidad(Long cantidad) {
			Cantidad = cantidad;
		}



		/**
		 * Metodo encargado de retornar el valor del atributo preciounitario
		 * @return El preciounitario asociado a la clase
		 */
		public BigDecimal getPreciounitario() {
			return preciounitario;
		}



		/**
		 * Metodo encargado de modificar el valor del atributo preciounitario
		 * @param preciounitario El nuevo preciounitario a modificar.
		 */
		public void setPreciounitario(BigDecimal preciounitario) {
			this.preciounitario = preciounitario;
		}

	}


}
