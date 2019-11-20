/**
 * FacturaDTO.java
 */
package com.hbt.semillero.dto;

import java.math.BigDecimal;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.EstadoEnum;
import com.hbt.semillero.entidad.EstadoPedido;
import com.hbt.semillero.entidad.Factura;
import com.hbt.semillero.entidad.Persona;
import com.hbt.semillero.entidad.Proveedor;
import com.hbt.semillero.entidad.TipoEnum;


/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public class FacturaDTO {

	private static final long serialVersionUID = 1L;

	private Long id;
	private double iva ;
	private double total;
	private TipoEnum tipo;
	private EstadoPedido estado;
	private Persona Cliente;


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
	public FacturaDTO(Long id, double iva, double total, TipoEnum tipo, EstadoPedido estado, Persona cliente) {
		super();
		this.id = id;
		this.iva = iva;
		this.total = total;
		this.tipo = tipo;
		this.estado = estado;
		Cliente = cliente;
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
	public double getIva() {
		return iva;
	}




	/**
	 * Metodo encargado de modificar el valor del atributo iva
	 * @param iva El nuevo iva a modificar.
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}




	/**
	 * Metodo encargado de retornar el valor del atributo total
	 * @return El total asociado a la clase
	 */
	public double getTotal() {
		return total;
	}




	/**
	 * Metodo encargado de modificar el valor del atributo total
	 * @param total El nuevo total a modificar.
	 */
	public void setTotal(double total) {
		this.total = total;
	}




	/**
	 * Metodo encargado de retornar el valor del atributo tipo
	 * @return El tipo asociado a la clase
	 */
	public TipoEnum getTipo() {
		return tipo;
	}




	/**
	 * Metodo encargado de modificar el valor del atributo tipo
	 * @param tipo El nuevo tipo a modificar.
	 */
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}




	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
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




	/**
	 * Metodo encargado de retornar el valor del atributo Cliente
	 * @return El cliente asociado a la clase
	 */
	public Persona getCliente() {
		return Cliente;
	}




	/**
	 * Metodo encargado de modificar el valor del atributo Cliente
	 * @param cliente El nuevo cliente a modificar.
	 */
	public void setCliente(Persona cliente) {
		Cliente = cliente;
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
		private Comic comic;
		private Long cantidad;
		private double preciounitario;
		private Factura factura;



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
		 * @param comic
		 * @param cantidad
		 * @param preciounitario
		 * @param proveedor
		 * @param factura
		 */
		public DetalleDTO(Long id, Comic comic, Long cantidad, double preciounitario,
				Factura factura) {
			super();
			this.id = id;
			this.comic = comic;
			this.cantidad = cantidad;
			this.preciounitario = preciounitario;			
			this.factura = factura;
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
		 * Metodo encargado de retornar el valor del atributo comic
		 * @return El comic asociado a la clase
		 */
		public Comic getComic() {
			return comic;
		}



		/**
		 * Metodo encargado de modificar el valor del atributo comic
		 * @param comic El nuevo comic a modificar.
		 */
		public void setComic(Comic comic) {
			this.comic = comic;
		}



		/**
		 * Metodo encargado de retornar el valor del atributo cantidad
		 * @return El cantidad asociado a la clase
		 */
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
		 * Metodo encargado de retornar el valor del atributo preciounitario
		 * @return El preciounitario asociado a la clase
		 */
		public double getPreciounitario() {
			return preciounitario;
		}



		/**
		 * Metodo encargado de modificar el valor del atributo preciounitario
		 * @param preciounitario El nuevo preciounitario a modificar.
		 */
		public void setPreciounitario(double preciounitario) {
			this.preciounitario = preciounitario;
		}



		/**
		 * Metodo encargado de retornar el valor del atributo factura
		 * @return El factura asociado a la clase
		 */
		public Factura getFactura() {
			return factura;
		}



		/**
		 * Metodo encargado de modificar el valor del atributo factura
		 * @param factura El nuevo factura a modificar.
		 */
		public void setFactura(Factura factura) {
			this.factura = factura;
		}




	}


}
