package ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicio4.dao.IPeliculasDAO;
import ejercicio4.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	@Autowired
	IPeliculasDAO iPeliculasDAO;
	@Override
	public List<Peliculas> listarPeliculas() {
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas Peliculas) {
		return iPeliculasDAO.save(Peliculas);
	}

	@Override
	public Peliculas PeliculasXID(int id) {
		return iPeliculasDAO.findById(id).get();
	}


	@Override
	public Peliculas actualizarPeliculas(Peliculas Peliculas) {
		return iPeliculasDAO.save(Peliculas);
	}

	@Override
	public void eliminarPeliculas(int id) {
		iPeliculasDAO.deleteById(id);
	}

}