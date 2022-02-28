package com.example.demo.controller;

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

import com.example.demo.dto.Articulo;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	@Autowired
	com.example.demo.service.ArticuloService ArticuloService;

	@GetMapping("/articulo")
	public List<Articulo> listaArticulo() {
		return ArticuloService.listaArticulo();
	}

	@PostMapping("/articulo")
	public Articulo insertArticulo(@RequestBody Articulo articulo) {
		return ArticuloService.insertArticulo(articulo);
	}

	@GetMapping("/articulo/{id}")
	public Articulo ArticuloID(@PathVariable(name = "id") Long id) {
		Articulo articulo_id = new Articulo();
		articulo_id = ArticuloService.ArticuloID(id);

		return articulo_id;
	}
	
	@GetMapping("/articulo/{name}")
	public List<Articulo> ArticuloName(@PathVariable(name = "nombre") String nombre) {

		return ArticuloService.ArticuloName(nombre);
	}

	@PutMapping("/articulo/{id}")
	public Articulo updateArticulo(@PathVariable(name = "id") Long id, @RequestBody Articulo Articulo) {
		Articulo ArticuloSelected = new Articulo();
		Articulo ArticuloUpdated = new Articulo();

		ArticuloSelected = ArticuloService.ArticuloID(id);
		ArticuloSelected.setNombre(Articulo.getNombre());
		ArticuloSelected.setPrecio(Articulo.getPrecio());

		ArticuloSelected = ArticuloService.updateArticulo(ArticuloSelected);

		return ArticuloUpdated;
	}

	@DeleteMapping("/articulo/{id}")
	public void deleteArticulo(@PathVariable(name = "id") Long id) {
		ArticuloService.deleteArticulo(id);
	}
}
