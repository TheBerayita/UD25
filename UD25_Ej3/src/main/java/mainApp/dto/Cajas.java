package mainApp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cajas")
public class Cajas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long NumReferencia;
	@Column(name = "Contenido") // no hace falta si se llama igual
	private String Contenido;
	@Column(name = "Valor") // no hace falta si se llama igual
	private int Valor;
	@Column(name = "Almacen") // no hace falta si se llama igual
	private int Almacen;

	public Cajas() {

	}

	public Cajas(Long numReferencia, String contenido, int valor, int almacen) {
		super();
		NumReferencia = numReferencia;
		Contenido = contenido;
		Valor = valor;
		Almacen = almacen;
	}

	public Long getNumReferencia() {
		return NumReferencia;
	}

	public String getContenido() {
		return Contenido;
	}

	public int getValor() {
		return Valor;
	}

	public int getAlmacen() {
		return Almacen;
	}

	public void setNumReferencia(Long numReferencia) {
		NumReferencia = numReferencia;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	public void setValor(int valor) {
		Valor = valor;
	}

	public void setAlmacen(int almacen) {
		Almacen = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [NumReferencia=" + NumReferencia + ", Contenido=" + Contenido + ", Valor=" + Valor + ", Almacen="
				+ Almacen + "]";
	}
	
}
