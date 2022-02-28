package ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicio4.dto.Peliculas;

public interface IPeliculasDAO extends JpaRepository<Peliculas, Integer>{

}