package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Articulo;

public interface ArticuloDAO extends JpaRepository<Articulo, Long> {
	public List<Articulo> findByNombre(String nombre);
}
