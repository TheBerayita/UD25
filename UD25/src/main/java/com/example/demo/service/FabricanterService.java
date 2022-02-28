package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanterService implements IFabricanteService {
	@Autowired
	FabricanteDAO FabricanteDAO;

	@Override
	public Fabricante insertFabricante(Fabricante fabricante) {

		return FabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante FabricanteID(Long id) {
		return FabricanteDAO.findById(id).get();
	}
	
//	@Override
//	public List<Fabricante> FabricanteName(String name) {
//		return FabricanteDAO.findByNombre;
//	}

	@Override
	public List<com.example.demo.dto.Fabricante> listaFabricante() {
		return FabricanteDAO.findAll();
	}

	@Override
	public com.example.demo.dto.Fabricante updateFabricante(com.example.demo.dto.Fabricante fabricante) {
		return FabricanteDAO.save(fabricante);
	}

	@Override
	public void deleteFabricante(Long id) {
		FabricanteDAO.deleteById(id);
	}

}
