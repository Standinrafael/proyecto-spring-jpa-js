package ec.edu.uce;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.uce.modelo.jpa.Poliza;
import ec.edu.uce.service.IPolizaService;

@SpringBootTest
class ProyectoSpringJpaJsApplicationTests {

	@Autowired
	private IPolizaService polizaService;

	@Test
	void insertarUno() {

		// Insertar
		Poliza poliza = new Poliza();
		poliza.setEstado("Pagado");
		poliza.setDescripcion("Poliza de Trabajo");
		poliza.setNumero("11111");
		poliza.setValor(new BigDecimal("5000.00"));
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2022, Month.SEPTEMBER, 2, 12, 45));

		this.polizaService.insertarPoliza(poliza);

		assertNotNull(this.polizaService.buscarPoliza(1));

	
	}

	@Test
	void insertarDos() {
		Poliza poliza1 = new Poliza();
		poliza1.setEstado("Pendiente");
		poliza1.setDescripcion("Poliza de Estudio");
		poliza1.setNumero("22222");
		poliza1.setValor(new BigDecimal("500.00"));
		poliza1.setFechaEmision(LocalDateTime.now());
		poliza1.setFechaVigencia(LocalDateTime.of(2022, Month.JUNE, 2, 12, 45));

		this.polizaService.insertarPoliza(poliza1);
		assertNotNull(this.polizaService.buscarPoliza(2));
	}

	@Test
	void buscarUno() {

		String poliza = "Poliza Animal";

		assertEquals(poliza, this.polizaService.buscarPoliza(2).getDescripcion());
	}

	@Test
	void buscarDos() {
		String poliza = "Poliza";

		assertEquals(poliza, this.polizaService.buscarPoliza(1).getDescripcion());
	}

	@Test
	void actualizarUno() {

		Poliza poliza = new Poliza();
		poliza.setId(1);
		poliza.setEstado("Pendiente");
		poliza.setDescripcion("Poliza");
		poliza.setNumero("333333");
		poliza.setValor(new BigDecimal("5000.00"));
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2022, Month.SEPTEMBER, 3, 12, 45));
		
		this.polizaService.actualizarPoliza(poliza);
		
		String numero="333333";
		
		assertEquals(numero, this.polizaService.buscarPoliza(1).getNumero());
		
	}

	@Test
	void actualizarDos() {

		Poliza poliza = new Poliza();
		poliza.setId(2);
		poliza.setEstado("Cancelado");
		poliza.setDescripcion("Poliza Animal");
		poliza.setNumero("44444");
		poliza.setValor(new BigDecimal("500.00"));
		poliza.setFechaEmision(LocalDateTime.now());
		poliza.setFechaVigencia(LocalDateTime.of(2022, Month.SEPTEMBER, 5, 12, 45));
		
		this.polizaService.actualizarPoliza(poliza);
		
		String estado="Cancelado";
		
		assertEquals(estado, this.polizaService.buscarPoliza(2).getEstado());
	}

	@Test
	void EliminarUno() {
		this.polizaService.eliminarPoliza(8);
		assertNull(this.polizaService.buscarPoliza(8));
	}

	@Test
	void EliminarDos() {
		this.polizaService.eliminarPoliza(9);
		assertNull(this.polizaService.buscarPoliza(9));
	}
}
