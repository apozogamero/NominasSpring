package es.sotero.nominas.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.nominas.business.entities.Nomina;
import es.sotero.nominas.business.repositories.NominaRepository;

@Service
public class JPANominaManager implements NominaManager {

	@Autowired
	private NominaRepository nomRepository;

	@Override
	public List<Nomina> getNominaAll() {
		return (List<Nomina>) nomRepository.findAll();
	}

	@Override
	public Nomina getNomina(String dni) {
		return nomRepository.findByDni(dni);
	}
	
	
}
