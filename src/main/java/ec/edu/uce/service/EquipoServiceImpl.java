package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Equipo;
import ec.edu.uce.repository.IEquipoRepo;

@Service
public class EquipoServiceImpl implements IEquipoService {
	
	@Autowired
	private IEquipoRepo equipoRepo;

	@Override
	public void insertarEquipoNuevo(Equipo equipo) {
		// TODO Auto-generated method stub
		this.equipoRepo.insertarEquipo(equipo);
	}

}
