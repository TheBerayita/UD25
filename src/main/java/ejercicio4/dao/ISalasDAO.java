package ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicio4.dto.Salas;

public interface ISalasDAO extends JpaRepository<Salas, Integer> {

}