package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listaArticulo();

	public Articulo insertArticulo(Articulo Articulo);

	public Articulo ArticuloID(Long id);
	
	public List<Articulo> ArticuloName(String name);

	public Articulo updateArticulo(Articulo Articulo);

	public void deleteArticulo(Long id);
}
