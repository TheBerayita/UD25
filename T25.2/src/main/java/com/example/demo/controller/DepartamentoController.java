package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Departamento;
import com.example.demo.service.DepartamentoService;


@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoService departamentoService;
	
	@GetMapping("/departamentos")
	public List<Departamento> listaDepartamentos(){
		return departamentoService.listaDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento addNewEmpleado(@RequestBody Departamento departamento) {
		return departamentoService.addDepartamento(departamento);
	};
	
	@GetMapping("/departamentos/{id}")
	public Departamento getEmpById(@PathVariable(name="id") Long id) {
		return departamentoService.getDepartamentoById(id);
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void deleteEmpleado(@PathVariable(name="id")Long id) {
		departamentoService.deleteDepartamento(id);
	}
	
}
