package es.sotero.nominas.business.services;

import java.util.List;

import es.sotero.nominas.business.entities.Empleado;

public interface EmpleadoManager {
    
    public List<Empleado> getEmpleadoAll();
    
    public Empleado getEmpleado(String dni);

}