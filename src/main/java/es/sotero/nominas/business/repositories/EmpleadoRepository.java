package es.sotero.nominas.business.repositories;

import org.springframework.data.repository.CrudRepository;

import es.sotero.nominas.business.entities.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, String> {

	public Empleado findByDni(String dni);
}
