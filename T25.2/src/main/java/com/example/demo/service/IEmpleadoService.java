package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listaEmpleados(); 
	
	public Empleado addEmpleado(Empleado empleado);
	
	public Empleado getEmpleadoById(Long id);
	
	public void deleteEmpleado(Long id);
}
