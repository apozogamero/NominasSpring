package es.sotero.nominas.business.services;

import java.util.List;

import org.springframework.stereotype.Service;

import es.sotero.nominas.business.entities.Empleado;

public class SimpleEmpleadoManager implements EmpleadoManager {

    private List<Empleado> listaEmp;
    private Empleado emp;

    public List<Empleado> getEmpleadoAll() {
        return listaEmp; 
    }
	
    public void setEmpleadoAll(List<Empleado> listaEmp) {
        this.listaEmp = listaEmp;
    }

	public Empleado getEmpleado(String dni) {
		return emp;
	}
}