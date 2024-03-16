package com.coderhouse;

import jakarta.persistence.Entity;

@Entity
@Table(name="Clientes")
public class Cliente {
	
	@Id
	@Column("")
	private Integer dni;
	private Integer cli_int_id;
	@Override
	public int hashCode() {
		return Objects.hash(cli_int_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cli_int_id, other.cli_int_id);
	}

	public Integer getCli_int_id() {
		return cli_int_id;
	}

	public void setCli_int_id(Integer cli_int_id) {
		this.cli_int_id = cli_int_id;
	}

	private String nombre;
	private String apellido;
	
	public Cliente () {}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
