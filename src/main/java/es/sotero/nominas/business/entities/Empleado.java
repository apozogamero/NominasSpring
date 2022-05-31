package es.sotero.nominas.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import es.sotero.nominas.business.repositories.DatosNoCorrectosException;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@Column(name="dni")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public String dni;

	public String nombre;
	public char sexo;
	private int categoria;
	public int anyos;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	public String getDni() {
		return dni;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) throws DatosNoCorrectosException {
		if (categoria >= 1 && categoria <= 10) {
			this.categoria = categoria;
		} else {
			throw new DatosNoCorrectosException("La categoria introducida no es correcta.");
		}
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void incrAnyo() {
		this.anyos++;
	}

	public void imprime() {
		System.out.println("---- EMPLEADO ----" + "\n" +
				"Nombre: " + nombre + "\n" +
				"DNI: " + dni + "\n" +
				"Sexo: " + sexo + "\n" +
				"Categoria: " + categoria + "\n" +
				"Anyos: " + anyos);
	}
}
