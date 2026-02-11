package mx.com.qtx.dipArq07m03explorCapaPer.servicios;

import java.sql.SQLException;
import java.util.List;

import mx.com.qtx.dipArq07m03explorCapaPer.servicios.dto.CategoriaDTO;
import mx.com.qtx.dipArq07m03explorCapaPer.servicios.dto.CategoriaProductoDTO;

public interface IGestorDatos {
	CategoriaDTO leerCategoriaXID(int id) throws SQLException;
	void probarJdbc() throws SQLException;
	List<CategoriaProductoDTO> leerProductosConCategorias(int id) throws SQLException;
}
