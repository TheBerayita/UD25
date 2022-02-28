package ejercicio4.dto;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Peliculas")
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "Clasificacion_Edad")
	private int ClasificacionEdad;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Salas> Salas;
	
	public Peliculas() {

	}

	public Peliculas(int id, String nombre, int ClasificacionEdad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ClasificacionEdad = ClasificacionEdad;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getClasificacionEdad() {
		return ClasificacionEdad;
	}

	public void setClasificacionEdad(int ClasificacionEdad) {
		this.ClasificacionEdad = ClasificacionEdad;
	}

	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", ClasificacionEdad=" + ClasificacionEdad + "]";
	}
	
}