package mainApp.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Cajas;

public interface ICajasDAO extends JpaRepository<Cajas, String>{
	
	public List<Cajas> findByAlmacen(String Almacen);
	
}