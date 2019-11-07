/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * <b>Descripción:<b> Clase que se utiliza para la capa de presentacion
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */

@Stateless
public class GestionarComicBean implements IGestionarComicLocal {

	@PersistenceContext
	private EntityManager em;

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#crearComic(com.hbt.semillero.dto.ComicDTO)
	 */

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW) // le dice al metodo que necesita una transaccion -- Tengo una convesacion activa? no o si 

	public void crearComic (ComicDTO comicDTO){

		Comic comic = convertirComicDTOToComic(comicDTO);
		em.persist(comic);
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @param comicModificar
	 */

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarComic(ComicDTO comicModificar){
		Comic comic = new Comic();
		//comic.setId(comicModificar.getId());
		em.merge(comicModificar);

	}
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @return
	 */

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarTodos(){

		List<Comic> resultados =(List<Comic>) em.createQuery("SELECT C FROM COMIC").getResultList();

		return null;


	}

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#modificarComic(java.lang.Long, java.lang.String, com.hbt.semillero.dto.ComicDTO)
	 */

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	//TODO CUAL ES EL RESULTADO DE LLAMAR A ModificarComic
	public void modificarComic(Long id, String nombre, ComicDTO comicNuevo) {

		Comic comicModificar ;
		if(comicNuevo==null){
			// Manejar la entidad, si esta manejada el entity manager puede manejarla
			comicModificar = em.find(Comic.class, id); //internanmente hace un SELECT *FROM COMIC

		}else{
			comicModificar= convertirComicDTOToComic(comicNuevo);
		}
		// TODO queda pendiente validar si el comic a modificar llego con datos
		comicModificar.setNombre(nombre);
		em.merge(comicModificar);

	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#eliminarComic(java.lang.Long)
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarComic(Long idComic) {

		Comic comicEliminar = em.find(Comic.class, idComic);
		if(comicEliminar!=null){
			em.remove(comicEliminar);
			return;	
		}

	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#consultarComic(java.lang.String)
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ComicDTO consultarComic(String idComic) {
		Comic comic = em.find(Comic.class, idComic);
		ComicDTO comicDTO  = convertirComicToComicDTO(comic);
		return comicDTO;

	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#consultarComics()
	 */

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	//todo esta lista de resultados sea nula y ver que pasa con el resultdo
	public List<ComicDTO> consultarComics() {
		List<ComicDTO> resultadosComicDTO= new ArrayList<>();
		List<Comic> resultados = em.createQuery("SELECT C FROM COMIC C").getResultList();
		for(Comic comic : resultados){
			resultadosComicDTO.add(convertirComicToComicDTO(comic));
		}
		return resultadosComicDTO;
	}

	/**
	 * 
	 * Metodo encargado de  transpasar informacin de un lado a otro, no incluye manipulacion de datos por ende no necesita anotacion de transaccion 
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @param comicDTO
	 * @return
	 */

	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		if(comicDTO.getId()!=null) {
			comic.setId(Long.parseLong(comicDTO.getId()));
		}
		comic.setNombre(comicDTO.getNombre());
		comic.setEditorial(comicDTO.getEditorial());
		comic.setTematicaEnum(comicDTO.getTematicaEnum());
		comic.setColeccion(comicDTO.getColeccion());
		comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
		comic.setPrecio(comicDTO.getPrecio());
		comic.setAutores(comicDTO.getAutores());
		comic.setColor(comicDTO.getColor());
		comic.setFechaVenta(comicDTO.getFechaVenta());
		comic.setEstadoEnum(comicDTO.getEstadoEnum());
		comic.setCantidad(comicDTO.getCantidad());
		return comic;

	}

	/**
	 *
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Family
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
		ComicDTO comicDTO = new ComicDTO();
		if(comic.getId()!=null) {
			comicDTO.setId(comic.getId().toString());
		}
		comicDTO.setNombre(comic.getNombre());
		comicDTO.setEditorial(comic.getEditorial());
		comicDTO.setTematicaEnum(comic.getTematicaEnum());
		comicDTO.setColeccion(comic.getColeccion());
		comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
		comicDTO.setPrecio(comic.getPrecio());
		comicDTO.setAutores(comic.getAutores());
		comicDTO.setColor(comic.getColor());
		comicDTO.setFechaVenta(comic.getFechaVenta());
		comicDTO.setEstadoEnum(comic.getEstadoEnum());
		comicDTO.setCantidad(comic.getCantidad());
		return comicDTO;
	}

}
