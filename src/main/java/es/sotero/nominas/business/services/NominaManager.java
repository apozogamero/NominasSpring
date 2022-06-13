package es.sotero.nominas.business.services;

import java.util.List;

import es.sotero.nominas.business.entities.Nomina;

public interface NominaManager {
    
    public List<Nomina> getNominaAll();
    
    public Nomina getNomina(String dni);

}
