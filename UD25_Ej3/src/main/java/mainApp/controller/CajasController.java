package mainApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mainApp.dto.Cajas;
import mainApp.service.CajasServiceIMPL;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceIMPL cajasServiceImpl;

	@GetMapping("/Cajas")
	public List<Cajas> listarCajass() {
		return cajasServiceImpl.listarCajass();
	}

	// listar Cajass por campo nombre
	@GetMapping("/Cajas/almacen/{almacen}")
	public List<Cajas> listarCajasNombre(@PathVariable(name = "almacen") String almacen) {
		return cajasServiceImpl.listarCajasAlmacenes(almacen);
	}

	@PostMapping("/Cajas")
	public Cajas salvarCajas(@RequestBody Cajas Cajas) {

		return cajasServiceImpl.guardarCajas(Cajas);
	}

	@GetMapping("/Cajas/{NumReferencia}")
	public Cajas CajasXID(@PathVariable(name = "NumReferencia") String NumReferencia) {

		Cajas Cajas_xid = new Cajas();

		Cajas_xid = cajasServiceImpl.CajasXID(NumReferencia);

		System.out.println("Cajas XID: " + Cajas_xid);

		return Cajas_xid;
	}

	@PutMapping("/Cajas/{NumReferencia}")
	public Cajas actualizarCajas(@PathVariable(name = "NumReferencia") String NumReferencia, @RequestBody Cajas Cajas) {

		Cajas Cajas_seleccionado = new Cajas();
		Cajas Cajas_actualizado = new Cajas();

		Cajas_seleccionado = cajasServiceImpl.CajasXID(NumReferencia);

		Cajas_seleccionado.setNumReferencia(Cajas.getNumReferencia());
		Cajas_seleccionado.setContenido(Cajas.getContenido());
		Cajas_seleccionado.setValor(Cajas.getValor());

		Cajas_actualizado = cajasServiceImpl.actualizarCajas(Cajas_seleccionado);

		System.out.println("El Cajas actualizado es: " + Cajas_actualizado);

		return Cajas_actualizado;
	}

	@DeleteMapping("/Cajas/{NumReferencia}")
	public void eliminarCajas(@PathVariable(name = "NumReferencia") String NumReferencia) {
		cajasServiceImpl.eliminarCajas(NumReferencia);
	}

}