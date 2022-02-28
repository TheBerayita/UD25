package ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicio4.dto.Salas;
import ejercicio4.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceImpl SalasServiceImpl;
	
	@GetMapping("/Salas")
	public List<Salas> listarSalas(){
		return SalasServiceImpl.listarSalas();
	}
	
	@PostMapping("/Salas")
	public Salas salvarSalas(@RequestBody Salas Salas) {
		return SalasServiceImpl.guardarSalas(Salas);
	}
	
	@GetMapping("/Salas/{id}")
	public Salas SalasXID(@PathVariable(name="id") int id) {
		Salas Salas_xid= new Salas();
		Salas_xid=SalasServiceImpl.SalasXID(id);
		System.out.println("Salas XID: "+Salas_xid);
		return Salas_xid;
	}
	
	@PutMapping("/Salas/{id}")
	public Salas actualizarSalas(@PathVariable(name="id")int id,@RequestBody Salas Salas) {
		Salas Salas_seleccionado= new Salas();
		Salas Salas_actualizado= new Salas();
		Salas_seleccionado= SalasServiceImpl.SalasXID(id);
		Salas_seleccionado.setNombre(Salas.getNombre());
		Salas_seleccionado.setPelicula(Salas.getPelicula());
		Salas_actualizado = SalasServiceImpl.actualizarSalas(Salas_seleccionado);
		System.out.println("El Salas actualizado es: "+ Salas_actualizado);
		return Salas_actualizado;
	}
	
	@DeleteMapping("/Salas/{id}")
	public void eleiminarSalas(@PathVariable(name="id")int id) {
		SalasServiceImpl.eliminarSalas(id);
	}
	
}