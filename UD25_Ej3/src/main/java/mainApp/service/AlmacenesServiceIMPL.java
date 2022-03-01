package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.IAlmacenesDAO;
import mainApp.dto.Almacenes;

public class AlmacenesServiceIMPL implements IAlmacenesService {
	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	@Override
	public List<Almacenes> listarAlmacenees() {
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public Almacenes AlmacenesXID(Long Codigo) {
		return iAlmacenesDAO.findById(Codigo).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacenes) {
		return iAlmacenesDAO.save(almacenes);
	}

	@Override
	public void eliminarAlmacenes(Long Codigo) {
		iAlmacenesDAO.deleteById(Codigo);
	}
	
}
