package es.sotero.nominas.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import es.sotero.nominas.business.entities.*;

public class SimpleNominaManager implements NominaManager {

    private List<Nomina> listaNom;
    private Nomina nom;

    public List<Nomina> getNominaAll() {
        return listaNom; 
    }
	
    public void setNominaAll(List<Nomina> listaNom) {
        this.listaNom = listaNom;
    }

	public Nomina getNomina(String dni) {
		return nom;
	}
}