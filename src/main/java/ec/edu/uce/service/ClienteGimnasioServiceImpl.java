package ec.edu.uce.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;
import ec.edu.uce.repository.jpa.IClienteGimnasioRepo;

@Service
public class ClienteGimnasioServiceImpl implements IClienteGimnasioService {

	@Autowired
	private IClienteGimnasioRepo clienteRepo;
	
	@Override
	public void insertarClienteGimnasio(ClienteGimnasio cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertarClienteGimnasio(cliente);
	}

	@Override
	public void actualizarClienteGimnasio(ClienteGimnasio cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizarClienteGimnasio(cliente);
	}

	@Override
	public ClienteGimnasio buscarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarClientePorId(id);
	}

	@Override
	public void eliminarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.eliminarClientePorId(id);
	}

	@Override
	@Transactional(value=TxType.SUPPORTS)
	public ClienteGimnasio buscarClientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarClientePorCedula(cedula);
	}

}
