package ec.edu.uce.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Turista;
import ec.edu.uce.repository.jpa.ITuristaRepo;

@Service
public class TuristaServiceImpl implements ITuristaService {

	
	@Autowired
	private ITuristaRepo turistaRepo;
	
	@Override
	public List<Turista> obtenerTodosTuristas() {
		// TODO Auto-generated method stub
		
		List<Turista> lista=this.turistaRepo.buscarTuristaPorValor();
		
		List<Turista> listaCalculada=this.calcularSaldo(lista);
		return listaCalculada;
	}
	
	private List<Turista> calcularSaldo(List<Turista> listaTurista){
		for(Turista turista:listaTurista) {
			BigDecimal saldo= turista.getValor().subtract(turista.getAbono());
			turista.setSaldo(saldo);
		}
		
		return listaTurista;
	}

	@Override
	public void insertarTurista(Turista turista) {
		// TODO Auto-generated method stub
		this.turistaRepo.insertarTurista(turista);
	}

}
