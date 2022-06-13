package es.sotero.nominas.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="nominas")
public class Nomina {

	@Id
	@Column(name="dni")
	public String dni;
	
	public int sueldo;
	@OneToOne(mappedBy = "nomina", fetch = FetchType.LAZY)
	public Empleado empleado;
	
	private static final int SUELDO_BASE[] =
		{50000, 70000, 90000, 110000, 130000,
		150000, 170000, 190000, 210000, 230000};
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo() {
		this.sueldo = SUELDO_BASE[empleado.getCategoria() - 1] + 5000 * empleado.anyos;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
}
