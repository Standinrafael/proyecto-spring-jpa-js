package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Empresa;
import ec.edu.uce.repository.jpa.IEmpresaRepo;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private IEmpresaRepo empresaRepo;
	
	@Override
	public void guardar(Empresa empresa) {
		// TODO Auto-generated method stub
		this.empresaRepo.insertarEmpresa(empresa);
	}

	@Override
	public void actualizar(Empresa empresa) {
		// TODO Auto-generated method stub
		this.empresaRepo.actualizarEmpresa(empresa);
	}

	@Override
	public Empresa buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empresaRepo.buscarEmpresaPorId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empresaRepo.borrarEmpresaPorId(id);
	}

	@Override
	public Empresa buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.empresaRepo.buscarEmpresaPorNombre(nombre);
	}

	@Override
	public Empresa buscarEmpresaPorNombreType(String nombre) {
		// TODO Auto-generated method stub
		return this.empresaRepo.buscarEmpresaPorNombreType(nombre);
	}

	@Override
	public Empresa buscarEmpresaPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.empresaRepo.buscarEmpresaPorNombreNamed(nombre);
	}

}
