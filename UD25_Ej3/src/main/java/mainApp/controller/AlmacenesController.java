package mainApp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import mainApp.dto.Almacenes;
import mainApp.service.AlmacenesServiceIMPL;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired
	AlmacenesServiceIMPL almacenesServiceImpl;

	@GetMapping("/Almacenes")
	public List<Almacenes> listarAlmacenes() {
		return almacenesServiceImpl.listarAlmacenees();
	}

	@PostMapping("/Almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes Almacenes) {
		return almacenesServiceImpl.guardarAlmacenes(Almacenes);
	}

	@GetMapping("/Almacenes/{Codigo}")
	public Almacenes AlmacenesXID(@PathVariable(name = "Codigo") Long Codigo) {

		Almacenes Almacenes_xCodigo = new Almacenes();

		Almacenes_xCodigo = almacenesServiceImpl.AlmacenesXID(Codigo);

		System.out.println("Almacenes XID: " + Almacenes_xCodigo);

		return Almacenes_xCodigo;
	}

	@PutMapping("/Almacenes/{Codigo}")
	public Almacenes actualizarAlmacenes(@PathVariable(name = "Codigo") Long Codigo, @RequestBody Almacenes Almacenes) {

		Almacenes Almacenes_seleccionado = new Almacenes();
		Almacenes Almacenes_actualizado = new Almacenes();

		Almacenes_seleccionado = almacenesServiceImpl.AlmacenesXID(Codigo);

		Almacenes_seleccionado.setCodigo(Almacenes.getCodigo());
		Almacenes_seleccionado.setLugar(Almacenes.getLugar());
		Almacenes_seleccionado.setCapacidad(Almacenes.getCapacidad());

		Almacenes_actualizado = almacenesServiceImpl.actualizarAlmacenes(Almacenes_seleccionado);

		System.out.println("El Almacenes actualizado es: " + Almacenes_actualizado);

		return Almacenes_actualizado;
	}

	@DeleteMapping("/Almacenes/{Codigo}")
	public void eliminarAlmacenes(@PathVariable(name = "Codigo") Long Codigo) {
		almacenesServiceImpl.eliminarAlmacenes(Codigo);
	}
}