package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Almacenes;

public interface IAlmacenesDAO extends JpaRepository<Almacenes, Long>{ 

}
