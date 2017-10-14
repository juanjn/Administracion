package mx.edu.uacm.administrativo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="entidad_administrativa")
public class EntidadAdministrativa {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long clave;
	@NotNull
	private String nombre;
	@NotNull
	private String sede;
	public long getClave() {
		return clave;
	}
	public void setClave(long clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
	
	
}
