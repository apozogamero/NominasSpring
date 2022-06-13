package es.sotero.nominas.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sotero.nominas.business.entities.Empleado;
import es.sotero.nominas.business.repositories.EmpleadoRepository;

@Service
public class JPAEmpleadoManager implements EmpleadoManager {

    @Autowired
    private EmpleadoRepository empRepository;

    public List<Empleado> getEmpleadoAll() {
        return (List<Empleado>) empRepository.findAll();
    }

	@Override
	public Empleado getEmpleado(String dni) {
		return empRepository.findByDni(dni);
	}
}