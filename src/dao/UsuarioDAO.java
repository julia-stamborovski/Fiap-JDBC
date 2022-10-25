package dao;

import java.util.List;

import model.UsuarioModel;

public interface UsuarioDAO {

	void insert(UsuarioModel model);
	
	List<UsuarioModel> findAll();
	
	UsuarioModel findById(Integer idUsuario);
	
	void update(UsuarioModel model);
	
	void delete(Integer idUsuario);
	
}
