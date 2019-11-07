/**
 * GestionarComicRest.java
 */
package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */

@Path("/GestionarComic")
public class GestionarComicRest {
	
@EJB
private IGestionarComicLocal gestionarComicEJB;


@GET // Tipo de envio
@Path("/saludo") // Dar una ruta de acceso unica al nuestro recurso
@Produces // Define el tipo de recurso que se va a producri
public String primerRest(){
	return "HOLA MUNDO";
	
}
@GET
@Path("/consultarComic")
@Produces(MediaType.APPLICATION_JSON)
public ComicDTO consultarComic(Long idComic){
	if(idComic!=null){
		return gestionarComicEJB.consultarComic(idComic.toString());
	}
	return null;
}




}
