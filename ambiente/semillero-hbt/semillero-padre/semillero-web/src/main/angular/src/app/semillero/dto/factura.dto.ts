/**
 * @description Clase FacturaDTO que contiene la informacion de la factura
 * 
 * @author Luisa Micolta
 */

export class FacturaDTO {
        /**
    * Indicador de resultado.
    */
    public id: number;
    /**
    * Indicador de resultado.
    */
    public iva: number ;
    /**
    * Indicador de resultado.
    */
    public total: number;
    /**
    * Indicador de resultado.
    */
    private tipo: string;
    /**
    * Indicador de resultado.
    */
    private  estado: string;
    
    /**
    * Indicador de resultado.
    */
   private cliente: string;

    
}