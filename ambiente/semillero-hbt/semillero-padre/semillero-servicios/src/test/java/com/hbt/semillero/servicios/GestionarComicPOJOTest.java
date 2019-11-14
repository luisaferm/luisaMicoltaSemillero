/**
 * GestionarComicPOJOTest.java
 */
package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Family
 * @version 
 */
public class GestionarComicPOJOTest {


	@Test(enabled = false)
	public void crearComicDTOTest() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.crearComicDTO();

		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size()!=0);
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());

	}

	/**
	 * 
	 * Metodo encargado de agregar comic
	 * <b>Caso de Uso</b>
	 * @author Family
	 *
	 */
	@Test(enabled = false)
	public void crearComicDTOTest2() {


		GestionarComicPOJO gestionarComicPOJO= new GestionarComicPOJO();
		ComicDTO comicDTO = gestionarComicPOJO.crearComicDTO("101", "Captain America Corps 1-5 USA","Panini Comics", TematicaEnum.FANTASTICO,"BIBLIOTECA MARVEL", 128, new BigDecimal(5000),"Phillippe Briones, Roger Stern", Boolean.TRUE, LocalDate.now(), EstadoEnum.ACTIVO, 5L);
		gestionarComicPOJO.agregarComicDTOlista(comicDTO);

		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size()== 1);

		comicDTO = new ComicDTO();

		comicDTO.setId("102");
		comicDTO.setNombre("Panini Comics");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
		comicDTO.setColeccion("MARVEL COMICS");
		comicDTO.setNumeroPaginas(208);
		comicDTO.setPrecio(new BigDecimal(6225));
		comicDTO.setAutores("Straczynski,Deodato Jr.,Barnes,Eaton");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.INACTIVO);
		comicDTO.setCantidad(0L);
		gestionarComicPOJO.agregarComicDTOlista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size()== 2);
	}
	
	@Test(enabled = false)
	public void agregarComicDTOlistaTest() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.crearComicDTO();

	}
	/**
	 * 
	 * Metodo encargado de Probar el metodo de modificar nombre de comic
	 * <b>Caso de Uso</b>
	 * @author Family
	 *
	 */
	@Test(enabled = false)
	public void modificarComicDTOTest(){
		
		GestionarComicPOJO gestionarComicPOJO= new GestionarComicPOJO();	
		
		ComicDTO comicDTO = new ComicDTO();

		comicDTO.setId("101");
		comicDTO.setNombre("Panini Comics");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
		comicDTO.setColeccion("MARVEL COMICS");
		comicDTO.setNumeroPaginas(208);
		comicDTO.setPrecio(new BigDecimal(6225));
		comicDTO.setAutores("Straczynski,Deodato Jr.,Barnes,Eaton");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.INACTIVO);
		comicDTO.setCantidad(0L);
		gestionarComicPOJO.agregarComicDTOlista(comicDTO);
		
		
		ComicDTO comicDTO1 = new ComicDTO();
		comicDTO1.setId("102");
		comicDTO1.setNombre("Dragon Ball Yamcha'");
		comicDTO1.setEditorial("Planeta Cómic");
		comicDTO1.setTematicaEnum(TematicaEnum.AVENTURAS);
		comicDTO1.setColeccion("Manga Shonen");
		comicDTO1.setNumeroPaginas(144);
		comicDTO1.setPrecio(new BigDecimal(2100));
		comicDTO1.setAutores("Dragon Garow Lee");
		comicDTO1.setColor(Boolean.FALSE);
		comicDTO1.setFechaVenta(LocalDate.now());
		comicDTO1.setEstadoEnum(EstadoEnum.ACTIVO);
		comicDTO1.setCantidad(20L);		
		gestionarComicPOJO.agregarComicDTOlista(comicDTO1);
		
		gestionarComicPOJO.modificarComicDTO("102", "Dragon Ball");
		
		Assert.assertEquals(comicDTO1.getNombre(), "Dragon Ball");
		
		
	}
	/**
	 * 
	 * Metodo encargado de Probar el metodo Eliminar ComicDTO.
	 * <b>Caso de Uso</b>
	 * @author Family
	 *
	 */
	@Test(enabled = false)
	public void eliminarComicDTOTest(){
		
		GestionarComicPOJO gestionarComicPOJO= new GestionarComicPOJO();	
			
		ComicDTO comicDTO = new ComicDTO();

		comicDTO.setId("100");
		comicDTO.setNombre("Panini Comics");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
		comicDTO.setColeccion("MARVEL COMICS");
		comicDTO.setNumeroPaginas(208);
		comicDTO.setPrecio(new BigDecimal(6225));
		comicDTO.setAutores("Straczynski,Deodato Jr.,Barnes,Eaton");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.INACTIVO);
		comicDTO.setCantidad(0L);
		gestionarComicPOJO.agregarComicDTOlista(comicDTO);
		
		
		ComicDTO comicDTO1 = new ComicDTO();
		comicDTO1.setId("101");
		comicDTO1.setNombre("Dragon Ball Yamcha'");
		comicDTO1.setEditorial("Planeta Cómic");
		comicDTO1.setTematicaEnum(TematicaEnum.AVENTURAS);
		comicDTO1.setColeccion("Manga Shonen");
		comicDTO1.setNumeroPaginas(144);
		comicDTO1.setPrecio(new BigDecimal(2100));
		comicDTO1.setAutores("Dragon Garow Lee");
		comicDTO1.setColor(Boolean.FALSE);
		comicDTO1.setFechaVenta(LocalDate.now());
		comicDTO1.setEstadoEnum(EstadoEnum.ACTIVO);
		comicDTO1.setCantidad(20L);		
		gestionarComicPOJO.agregarComicDTOlista(comicDTO1);
		
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size()==2);
		
		System.out.println("---------------------------------------------------------------------");		
		System.out.println("\nMUESTRA EL CONTENIDO DEL ARREGLO ANTES DE ELIMINAR");
		System.out.println("---------------------------------------------------------------------");
		
		for (ComicDTO comicDTO2 : gestionarComicPOJO.getListaComics()) {

			System.out.println(comicDTO2.toString()+ "\n");
		}
		
		// Eliminar el Comic de Codigo 101
		gestionarComicPOJO.eliminarComicDTO("101"); 
		
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("\nMUESTRA EL CONTENIDO DEL ARREGLO LUEGO DE ELIMINAR EL COMIC CON 101");
		System.out.println("---------------------------------------------------------------------");
		for (ComicDTO comicDTO2 : gestionarComicPOJO.getListaComics()) {

			System.out.println( comicDTO2.toString().toString()+"\n");
		}
		
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size()== 1);
		//Assert.assertNull(gestionarComicPOJO.getListaComics()));
		
	}
	

}
