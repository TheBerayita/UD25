package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.ICajasDAO;
import mainApp.dto.Cajas;

public class CajasServiceIMPL implements ICajasService {
	@Autowired
	ICajasDAO iCajasDAO;
	@Override
	public List<Cajas> listarCajass() {
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public Cajas CajasXID(String id) {
		return iCajasDAO.findById(id).get();
	}

	@Override
	public List<Cajas> listarCajasAlmacenes(String almacen) {
		return iCajasDAO.findByAlmacen(almacen);
	}

	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(String numreferencia) {
		iCajasDAO.deleteById(numreferencia);
		
	}
}
