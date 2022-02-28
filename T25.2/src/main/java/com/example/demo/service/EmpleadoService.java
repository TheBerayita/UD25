package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDao;
	
	public List<Empleado> listaEmpleados() {
		return iEmpleadoDao.findAll();
	};
	
	public Empleado addEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	public Empleado getEmpleadoById(Long id) {
		return iEmpleadoDao.findById(id).get();
	}
	
	public void deleteEmpleado(Long id) {	
		iEmpleadoDao.deleteById(id);
	}

	
	
	
}
