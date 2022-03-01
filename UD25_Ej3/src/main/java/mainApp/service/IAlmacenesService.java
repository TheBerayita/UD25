package mainApp.service;
import java.util.List;

import mainApp.dto.Almacenes;
public interface IAlmacenesService {

	public List<Almacenes> listarAlmacenees();

	public Almacenes guardarAlmacenes(Almacenes Almacenes);

	public Almacenes AlmacenesXID(Long Codigo);

	public Almacenes actualizarAlmacenes(Almacenes Almacenes);

	public void eliminarAlmacenes(Long Codigo);
}
