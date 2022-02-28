package mainApp.dto;

import javax.persistence.*;


@Entity
@Table(name="Almacenes")
public class Almacenes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	

}
