package ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ejercicio4.dto.Peliculas;
import ejercicio4.service.PeliculasServiceImpl;
 
@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceImpl PeliculasServiceImpl;
	
	@GetMapping("/Peliculas")
	public List<Peliculas> listarPeliculas(){
		return PeliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/Peliculas")
	public Peliculas salvarPeliculas(@RequestBody Peliculas Peliculas) {
		
		return PeliculasServiceImpl.guardarPeliculas(Peliculas);
	}
	
	@GetMapping("/Peliculas/{id}")
	public Peliculas PeliculasXID(@PathVariable(name="id") int id) {
		Peliculas Peliculas_xid= new Peliculas();
		Peliculas_xid=PeliculasServiceImpl.PeliculasXID(id);
		System.out.println("Peliculas XID: "+Peliculas_xid);
		return Peliculas_xid;
	}
	
	@PutMapping("/Peliculas/{id}")
	public Peliculas actualizarPeliculas(@PathVariable(name="id")int id,@RequestBody Peliculas Peliculas) {
		Peliculas Peliculas_seleccionado= new Peliculas();
		Peliculas Peliculas_actualizado= new Peliculas();
		Peliculas_seleccionado= PeliculasServiceImpl.PeliculasXID(id);
		Peliculas_seleccionado.setNombre(Peliculas.getNombre());
		Peliculas_seleccionado.setClasificacionEdad(Peliculas.getClasificacionEdad());
		Peliculas_actualizado = PeliculasServiceImpl.actualizarPeliculas(Peliculas_seleccionado);
		System.out.println("El Peliculas actualizado es: "+ Peliculas_actualizado);
		return Peliculas_actualizado;
	}
	
	@DeleteMapping("/Peliculas/{id}")
	public void eleiminarPeliculas(@PathVariable(name="id")int id) {
		PeliculasServiceImpl.eliminarPeliculas(id);
	}
	
}