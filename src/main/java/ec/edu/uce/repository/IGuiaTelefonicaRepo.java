package ec.edu.uce.repository;

import ec.edu.uce.modelo.GuiaTelefonica;

public interface IGuiaTelefonicaRepo {

	void insertarUsuarioGuiaTelefonica(GuiaTelefonica guia);
	GuiaTelefonica buscarUsuarioGuiaTelefonica(Integer id);
	void actualizarUsuarioGuiaTelefonica(GuiaTelefonica guia);
	void borrarUsuarioGuiaTelefonica(Integer id);
}
