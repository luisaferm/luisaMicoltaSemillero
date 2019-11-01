/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */

@Stateless
public class GestionarComicBean {

	@PersistenceContext
	private EntityManager em;


	@TransactionAttribute(TransactionAttributeType.REQUIRED) // le dice al metodo que necesita una transaccion 

	public void crearComic (ComicDTO comicDTO){
		Comic comic = new Comic();
		comic.setId(comicDTO.getId());
		comic.setNombre(comicDTO.getNombre());

		// TERMINAR DE LLENAR LOS CAMPOS

		em.persist(comic);
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarComic(ComicDTO comicModificar){
		Comic comic = new Comic();
		comic.setId(comicModificar.getId());


		em.merge(comicModificar);

	}
	/*
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ComicDTO consultarComic(String idComic){
		Comic comic = em.find(Comic.class, idComic);
		ComicDTO comicDTO = new ComicDTO(comic.getId(), comic.getNombre());

		return comicDTO;

	}*/

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarTodos(){

		List<Comic> resultados =(List<Comic>) em.createQuery("SELECT C FROM COMIC").getResultList();

		return null;


	}

}
