package com.example.demo.dto;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Fabricante")
public class Fabricante {

	// Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_fab;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id_art")
	private List<Articulo> Articulo;

	// Constructores
	public Fabricante() {

	}

	public Fabricante(Long id_fab, String nombre) {
		this.id_fab = id_fab;
		this.nombre = nombre;
	}

	// Getters setters
	public Long getid_fab() {
		return id_fab;
	}

	public void setId(Long id_fab) {
		this.id_fab = id_fab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// To string
	@Override
	public String toString() {
		return "Fabricante [id=" + id_fab + ", nombre=" + nombre + "]";
	}

}
