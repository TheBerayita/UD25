package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;


public interface IDepartamentoService {

	//Metodos del CRUD
	public List<Departamento> listaDepartamentos(); 
	
	public Departamento addDepartamento(Departamento departamento);
	
	public Departamento getDepartamentoById(Long id);
	
	public void deleteDepartamento(Long id);
}
