import { Injectable } from '@angular/core';
import { Injector } from "@angular/core";
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { FacturaDTO } from '../dto/factura.dto';
import { AbstractService } from '../services/template.service';

/**
 * @description Servicio encargado de llamar a los servicios REST de gestionar Factura
 * @author Luisa Micolta
 */
@Injectable({
  providedIn: 'root'
})
export class GestionarFacturaService extends AbstractService {

  /**
   * Constructor de la clase
   */
  constructor(injector: Injector, private httpClient : HttpClient) {
    super(injector);
  }
  
  public consultarFacturas(): Observable<any> {
    return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/GestionarFactura/consultarFacturas');
  }
  
}