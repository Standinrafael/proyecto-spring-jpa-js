package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.GuiaTelefonica;
import ec.edu.uce.repository.IGuiaTelefonicaRepo;

@Service
public class GuiaTelefonicaServiceImpl implements IGuiaTelefonicaService {
	
	@Autowired
	private IGuiaTelefonicaRepo guiaRepo;

	@Override
	public void insertarUsuarioNuevoGuiaTelefonica(GuiaTelefonica usuario) {
		// TODO Auto-generated method stub
		this.guiaRepo.insertarUsuarioGuiaTelefonica(usuario);
	}

}
