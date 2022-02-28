package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {

	public List<Fabricante> listaFabricante();

	public Fabricante insertFabricante(Fabricante fabricante);

	public Fabricante FabricanteID(Long id);

	public Fabricante updateFabricante(Fabricante fabricante);

	public void deleteFabricante(Long id);

}
