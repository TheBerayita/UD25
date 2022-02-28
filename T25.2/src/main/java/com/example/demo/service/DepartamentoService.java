package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;


@Service
public class DepartamentoService implements IDepartamentoService {

	@Autowired
	IDepartamentoDAO iDepartamentoDao;
	
	public List<Departamento> listaDepartamentos() {
		return iDepartamentoDao.findAll();
	};
	
	public Departamento addDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	public Departamento getDepartamentoById(Long id) {
		return iDepartamentoDao.findById(id).get();
	}
	
	public void deleteDepartamento(Long id) {	
		iDepartamentoDao.deleteById(id);
	}

	
	
	
}
