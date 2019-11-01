/**
 * GestionarComicPOJO.java
 */
package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public class GestionarComicPOJO {

	private List<ComicDTO> listaComics = null;
	/**
	 * 
	 * Metodo encargado de crear comic
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematicaEnum
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param estadoEnum
	 * @param cantidad
	 * @return
	 */

	public ComicDTO crearComicDTO(String id, String nombre, String editorial, TematicaEnum tematicaEnum, String coleccion,
			Integer numeroPaginas, BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta,
			EstadoEnum estadoEnum, Long cantidad){
		
		ComicDTO comicDTO = new ComicDTO(id, nombre, editorial, tematicaEnum, coleccion, numeroPaginas, precio, autores, color, fechaVenta, estadoEnum, cantidad);
		
		
		return comicDTO;

		
	}
	
	/**
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 */
	public void agregarComicDTOlista(ComicDTO comicDTO) {	
		
		if (listaComics== null){

			listaComics = new ArrayList<>();
		}
	
		listaComics.add(comicDTO);

	}
	/**
	 * 
	 * Metodo encargado de modificar el campo Nombre del Comic
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @param id
	 * @param nombre
	 */
	
	public void modificarComicDTO(String id, String nombre){
		
		for(int i = 0 ; i<= listaComics.size();i ++){
		if(listaComics.get(i).getId().equals(id)){
			listaComics.get(i).setNombre(nombre);
			
			return;
		}
		
		}	
		
	}
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @param id
	 
	 */
	 public void eliminarComicDTO(String id ){
		 
		 int i=0;
		 while( i <listaComics.size()){
			 
			 if(listaComics.get(i).getId().equals(id)){
				 listaComics.remove(i);

					return;
			 }
			 

			 i++;
		 }
		 
	 }
	

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Family
	 *
	 */

	public void crearComicDTO(){

		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId("100");
		comicDTO.setNombre("Dragon Ball Yamcha'");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum(TematicaEnum.AVENTURAS);
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(144);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.ACTIVO);
		comicDTO.setCantidad(20L);


		if (listaComics== null){

			listaComics = new ArrayList<>();
		}
		listaComics.add(comicDTO);

	}


	/**
	 * Metodo encargado de retornar el valor del atributo listaComics
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo listaComics
	 * @param listaComics El nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}




}
