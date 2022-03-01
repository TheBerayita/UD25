package mainApp.dto;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="Almacenes")
public class Almacenes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long Codigo;
	@Column(name = "Lugar")//no hace falta si se llama igual
	private String Lugar;
	@Column(name = "Capacidad")//no hace falta si se llama igual
	private int Capacidad;
	
    @OneToMany
    @JoinColumn(name="Codigo")
    private List<Cajas> cajas;

    public Almacenes() {
    	
    }

	public Almacenes(Long codigo, String lugar, int capacidad) {
		super();
		Codigo = codigo;
		Lugar = lugar;
		Capacidad = capacidad;
	}

	public Long getCodigo() {
		return Codigo;
	}

	public String getLugar() {
		return Lugar;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	
	public void setCodigo(Long codigo) {
		Codigo = codigo;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenes [Codigo=" + Codigo + ", Lugar=" + Lugar + ", Capacidad=" + Capacidad + "]";
	}

	

}

