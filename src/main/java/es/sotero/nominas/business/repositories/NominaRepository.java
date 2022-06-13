package es.sotero.nominas.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.nominas.business.entities.Nomina;

public interface NominaRepository extends CrudRepository<Nomina, String> {

	public Nomina findByDni(String dni);

}
