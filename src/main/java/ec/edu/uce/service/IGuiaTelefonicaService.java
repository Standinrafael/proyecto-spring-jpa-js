package ec.edu.uce.service;


import ec.edu.uce.modelo.GuiaTelefonica;

public interface IGuiaTelefonicaService {

	void insertarUsuarioNuevoGuiaTelefonica(GuiaTelefonica usuario);
	void borrarUsuarioGuiaPorId(Integer id);
	void actualizarUsuarioGuiaNuevo(GuiaTelefonica usuario);
	GuiaTelefonica buscarUsuarioGuiaPorId(Integer id);
}
