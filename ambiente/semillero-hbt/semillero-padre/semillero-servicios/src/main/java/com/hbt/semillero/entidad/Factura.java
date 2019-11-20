/**
 * Factura.java
 */
package com.hbt.semillero.entidad;

import java.io.IOException;
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
import javax.xml.ws.FaultAction;

/**
 * <b>Descripción:<b> Clase entidad de Factura
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
@Entity
@Table(name = "TC_FACTURA")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private double iva ;
	private double total;
	private TipoEnum tipo;
	private EstadoPedido estado;
	private Persona Cliente;
	private Proveedor proveedor;

	private List<Factura_Detalle>detalles;


	/**
	 * Constructor de la clase.
	 */
	public Factura() {
		
		detalles = new ArrayList<Factura_Detalle>();
		proveedor = new Proveedor();

	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TC_FACTURA_SFID_GENERATOR", sequenceName = "SEQ_FACTURA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_FACTURA_SFID_GENERATOR")
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


		total= calcularTotal();

		return total;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo proveedor
	 * @return El proveedor asociado a la clase
	 */
	@Column(name = "SFPROVEEDOR")
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
	 * Metodo encargado de retornar el valor del atributo iva
	 * @return El iva asociado a la clase
	 */
	@Column(name = "SFIVA")
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
	 * Metodo encargado de retornar el valor del atributo Cliente
	 * @return El cliente asociado a la clase
	 */
	@Column(name = "SFCLIENTE")
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

	/**
	 * Metodo encargado de modificar el valor del atributo total
	 * @param total El nuevo total a modificar.
	 */
	public void setTotal(double total) {
		this.total = total;
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
	 * Metodo encargado de retornar el valor del atributo tipo
	 * @return El tipo asociado a la clase
	 */
	@Column(name = "SFTIPO")	
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
	 * Metodo encargado de retornar el valor del atributo detalles
	 * @return El detalles asociado a la clase
	 */
	public List<Factura_Detalle> getDetalles() {
		return detalles;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo detalles
	 * @param detalles El nuevo detalles a modificar.
	 */
	public void setDetalles(List<Factura_Detalle> detalles) {
		this.detalles = detalles;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * @param estado El nuevo estado a modificar.
	 */
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

/**
 * 
 * 
 * Metodo encargado de agregar el detalle en arreglo 
 * <b>Caso de Uso</b>
 * @author Family
 * 
 * @param comic
 * @param cant
 * @param precio
 */
	public void agregarDetalle( Comic comic, long cant, double precio){

		Factura_Detalle detalle = new Factura_Detalle();
		detalle.setComic(comic);
		detalle.setPreciounitario(precio);
		detalle.setCantidad(cant);
		detalles.add(detalle);



	}

	/**
	 * 
	 * Metodo encargado de calcular el total de Factura
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @return
	 */

	public double calcularTotal() {

		if( detalles.size() >0){
			double suma=0.0;

			for (Factura_Detalle detalle: detalles){

				suma+=detalle.calcularSubtotal();
			}


			return suma;
		}
		return 0.0;

	}


	/**
	 * <b>Descripción:<b> Clase que describe el Detalle de Factura
	 * <b>Caso de Uso:<b> 
	 * @author Family
	 * @version 
	 */

	@Table(name = "TC_FACTURA_DETALLE")
	public class Factura_Detalle implements Serializable {

		private static final long serialVersionUID = 1L;
		private Long id;
		private Comic comic;
		private Long cantidad;
		private double preciounitario;
		private Factura factura;






		/**
		 * Constructor de la clase.
		 */
		public Factura_Detalle() {
			
			factura = new Factura();
		}


		
		/**
		 * Metodo encargado de retornar el valor del atributo id
		 * @return El id asociado a la clase
		 */
		@Id
		@SequenceGenerator(allocationSize = 1, name = "TC_FACTURA_DETALLE", sequenceName = "SEQ_DETALLE")
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
		 * Metodo encargado de retornar el valor del atributo preciounitario
		 * @return El preciounitario asociado a la clase
		 */
		@Column(name = "SDPRECIO_UNITARIO") 
		public double getPreciounitario() {
			return preciounitario;
		}



		/**
		 * Metodo encargado de retornar el valor del atributo comic
		 * @return El comic asociado a la clase
		 */

		@Column(name = "SDCOMIC_ID")
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
			return "Factura_Detalle [id=" + id + ", comic=" + comic + ", cantidad=" + cantidad + ", preciounitario="
					+ preciounitario + ", proveedor=" + proveedor + "]";
		}


/**
 * 
 * Metodo encargado de cslcular el subtotal restandole el porcentaje del IVA
 * <b>Caso de Uso</b>
 * @author Family
 * 
 * @return
 */

		public double calcularSubtotal(){
			try{
				if(cantidad<5){
					double subtotal = cantidad * preciounitario;
					double iva = subtotal*0.17;
					factura.setIva(iva);
					return subtotal+iva;

				}
			}catch (Exception e) {
				System.out.println("El pedido excede los 5 articulos"+e.getMessage());
			}

			return 0.0;
		}


	}



}

