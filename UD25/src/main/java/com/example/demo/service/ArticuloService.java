package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloService implements IArticuloService {
	@Autowired
	ArticuloDAO ArticuloDAO;

	@Override
	public Articulo insertArticulo(Articulo Articulo) {

		return ArticuloDAO.save(Articulo);
	}

	@Override
	public Articulo ArticuloID(Long id) {
		return ArticuloDAO.findById(id).get();
	}

	@Override
	public List<com.example.demo.dto.Articulo> listaArticulo() {
		return ArticuloDAO.findAll();
	}

	@Override
	public com.example.demo.dto.Articulo updateArticulo(com.example.demo.dto.Articulo Articulo) {
		return ArticuloDAO.save(Articulo);
	}

	@Override
	public void deleteArticulo(Long id) {
		ArticuloDAO.deleteById(id);
	}

	@Override
	public List <Articulo> ArticuloName(String name) {
		
		return ArticuloDAO.findByNombre(name);
	}


}
