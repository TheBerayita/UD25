package mainApp.service;

import java.util.List;

import mainApp.dto.Cajas;

public interface ICajasService {

	public List<Cajas> listarCajass();

	public Cajas guardarCajas(Cajas cajas);

	public Cajas CajasXID(String NumReferencia);

	public List<Cajas> listarCajasAlmacenes(String almacen);

	public Cajas actualizarCajas(Cajas cajas);

	public void eliminarCajas(String NumReferencia);
}