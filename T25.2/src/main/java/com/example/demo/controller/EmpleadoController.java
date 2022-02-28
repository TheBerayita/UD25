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

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	public List<Empleado> listaEmpleados(){
		return empleadoService.listaEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado addNewEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.addEmpleado(empleado);
	};
	
	@GetMapping("/empleados/{id}")
	public Empleado getEmpById(@PathVariable(name="id") Long id) {
		return empleadoService.getEmpleadoById(id);
	}
	
	@DeleteMapping("/empleados/{id}")
	public void deleteEmpleado(@PathVariable(name="id")Long id) {
		empleadoService.deleteEmpleado(id);
	}
	
}
