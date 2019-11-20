
import { FacturaDTO } from '../dto/factura.dto';
import { ComicDTO } from '../dto/comic.dto';
/**
 * @description Clase DetalleDTO que contiene la informacion de la factura_detalle
 * 
 * @author Luisa Micolta
 */
export class DetalleDTO {

    /**
     * Indicador de resultado.
     */

    public id: number;
    /**
    * Indicador de resultado.
    */
    public comic: ComicDTO;
    /**
    * Indicador de resultado.
    */
    public cantidad: number;
    /**
    * Indicador de resultado.
    */
    private preciounitario: number;
    /**
    * Indicador de resultado.
    */
    private factura: FacturaDTO;

}