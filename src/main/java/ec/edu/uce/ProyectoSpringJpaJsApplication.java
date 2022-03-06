package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.ClienteGimnasio;
import ec.edu.uce.modelo.jpa.Membresia;
import ec.edu.uce.service.ICiudadanoService;
import ec.edu.uce.service.IClienteGimnasioService;
import ec.edu.uce.service.IComputadoraService;
import ec.edu.uce.service.IConsumoService;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IDetalleFacturaService;
import ec.edu.uce.service.IEmpresaService;
import ec.edu.uce.service.IEquipoService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IFacturaElectronicaService;
import ec.edu.uce.service.IFarmaciaService;
import ec.edu.uce.service.IGestorCajeroService;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IGestorGimnasioService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.IGuiaTelefonicaService;
import ec.edu.uce.service.IHabienteService;
import ec.edu.uce.service.IHotelService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IMembresiaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IParqueService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IRetiroService;
import ec.edu.uce.service.IRopaService;
import ec.edu.uce.service.ISupermercadoService;
import ec.edu.uce.service.ITarjetaCreditoService;
import ec.edu.uce.service.ITuristaService;
import ec.edu.uce.service.IUniversidadService;
import ec.edu.uce.service.IVideoJuegoService;

@SpringBootApplication
public class ProyectoSpringJpaJsApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaJsApplication.class);

	@Autowired
	private IPacienteService pacienteService;

	@Autowired
	private IEquipoService equipoService;

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IGuiaTelefonicaService guiaService;

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private ILibroService libroService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IPeliculaService peliculaService;

	@Autowired
	private IRopaService ropaService;

	@Autowired
	private IUniversidadService universidadService;

	@Autowired
	private IVideoJuegoService videojuegoService;

	@Autowired
	private IGestorCitaService gestorCitaService;

	@Autowired
	private IGuardiaService guardiaService;

	@Autowired
	private IComputadoraService computadoraService;

	@Autowired
	private IFarmaciaService farmaciaService;

	@Autowired
	private IEmpresaService empresaService;

	@Autowired
	private IParqueService parqueService;

	@Autowired
	private ISupermercadoService supermercadoService;

//	@Autowired
//	private IFacturaService facturaService;

	@Autowired
	private ICiudadanoService ciudadanoService;

	@Autowired
	private IDetalleFacturaService detalleFacturaService;

//	@Autowired
//	private IClienteService clienteService;

	@Autowired
	private ITuristaService turistaService;

//	@Autowired
//	private ICuentaBancariaService cuentaService;

	@Autowired
	private ITarjetaCreditoService tarjetaService;

	@Autowired
	private IConsumoService consumoService;

	@Autowired
	private IRetiroService retiroService;

	@Autowired
	private ICuentaService cuentaService;

	@Autowired
	private IHabienteService habienteService;
	
	@Autowired
	private IGestorCajeroService cajeroService;
	
	@Autowired
	private IClienteGimnasioService clienteService;
	
	@Autowired
	private IMembresiaService membresiaService;
	
	@Autowired
	private IFacturaElectronicaService facturaService;
	
	@Autowired
	private IGestorGimnasioService gimnasioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//Insertar Clientes
		ClienteGimnasio cliente1= new ClienteGimnasio();
		cliente1.setApellido("Andrade");
		cliente1.setNommbre("Juan");
		cliente1.setCedula("12345");
		cliente1.setFechaNacimiento(LocalDateTime.of(1989, Month.AUGUST,8,12,45));
		cliente1.setEstado("No pagada");
		
		ClienteGimnasio cliente2= new ClienteGimnasio();
		cliente2.setApellido("Villacres");
		cliente2.setNommbre("Michelle");
		cliente2.setCedula("01234");
		cliente2.setFechaNacimiento(LocalDateTime.of(1997, Month.MAY,9,10,20));
		cliente2.setEstado("No pagada");
		
//		this.clienteService.insertarClienteGimnasio(cliente1);
//		this.clienteService.insertarClienteGimnasio(cliente2);
		
		//Insertar Membresia
		Membresia membresia= new Membresia();
		membresia.setCodigo("A1");
		membresia.setNombre("Bailoterapia");
		membresia.setValor(new BigDecimal("30.00"));
		membresia.setVigencia("Un mes");
		membresia.setCantidad(0);
		
		Membresia membresia2= new Membresia();
		membresia2.setCodigo("C1");
		membresia2.setNombre("Cardio");
		membresia2.setValor(new BigDecimal("50.00"));
		membresia2.setVigencia("Dos meses");
		membresia2.setCantidad(0);
		
//		this.membresiaService.insertarMembresia(membresia);
//		this.membresiaService.insertarMembresia(membresia2);
		
		
		//Gestor
		this.gimnasioService.registrarPago("12345", "C1");
		this.gimnasioService.registroMembresia("01234");
		
//		// Cuenta Habiente
//		Habiente cuenta1 = new Habiente();
//		cuenta1.setNombre("Pablo");
//		cuenta1.setApellido("Cabrera");
//		cuenta1.setCedula("1105166299");
//
//		Habiente cuenta2 = new Habiente();
//		cuenta2.setNombre("Katherine");
//		cuenta2.setApellido("Gonzalez");
//		cuenta2.setCedula("1103456999");
//
//		// Lista de Cuentas Bancarias
//
//		List<Cuenta> primeraCuenta = new ArrayList<>();
//		List<Cuenta> segundaCuenta = new ArrayList<>();
//
//		// Cuenta Bancaria
//		Cuenta c1 = new Cuenta();
//		c1.setNumeroCuenta("12345");
//		c1.setSaldo(new BigDecimal("1000"));
//		c1.setTipo("Ahorro");
//
//		Cuenta c2 = new Cuenta();
//		c2.setNumeroCuenta("67890");
//		c2.setSaldo(new BigDecimal("10000"));
//		c2.setTipo("Corriente");
//
//		Cuenta c3 = new Cuenta();
//		c3.setNumeroCuenta("24680");
//		c3.setSaldo(new BigDecimal("500"));
//		c3.setTipo("Ahorro");
//
//		// Agregar cuentas a las listas
//		primeraCuenta.add(c1);
//		segundaCuenta.add(c2);
//		segundaCuenta.add(c3);
//
//		// Enviar las listas a cada cuenta
//		cuenta1.setCuenta(primeraCuenta);
//		cuenta2.setCuenta(segundaCuenta);
//		c1.setHabiente(cuenta1);
//		c2.setHabiente(cuenta2);
//		c3.setHabiente(cuenta2);
//
//		// Insertar cuentas
//	
////		this.habienteService.insertarHabiente(cuenta2);
////		this.habienteService.insertarHabiente(cuenta1);
//		
//
//		//Gestor Cajero
//		
//		//Consultar cuentas bancarias de un habiente por cedula
//		LOG.info("------------Consultar Cuenta Bancarira del Habiente---------------------------");
//		this.cajeroService.consultarCuentaBancaria("1105166299");
//		
//		//Consultar saldo de una cuenta
//		LOG.info("------------Consultar Saldo de la Cuenta Bancaria---------------------------");
//		this.cajeroService.consultarSaldo("24680");
//		
//		//Funcionalidad que permite retirar dinero
//		this.cajeroService.realizarRetiro("12345", new BigDecimal("200.00"));

//		//Insertar Tarjeta
//		TarjetaCredito tarjeta1= new TarjetaCredito();
//		tarjeta1.setNumero("123456789");
//		tarjeta1.setCedula("1105166290");
//		tarjeta1.setCupo(new BigDecimal("1000"));
//		
//		
//		TarjetaCredito tarjeta2= new TarjetaCredito();
//		tarjeta2.setNumero("987654321");
//		tarjeta2.setCedula("0415263978");
//		tarjeta2.setCupo(new BigDecimal("2000"));
//		
////		this.tarjetaService.insertarTarjetaCredito(tarjeta1);
////		this.tarjetaService.insertarTarjetaCredito(tarjeta2);
//		
//		this.consumoService.realizarTransferencia("123456789", LocalDateTime.now(), new BigDecimal ("500"));

		// Cuenta Bancaria

//		CuentaBancaria c1= new CuentaBancaria();
//		c1.setClienteCedula("1105166230");
//		c1.setNumero("12345");
//		c1.setSaldo(new BigDecimal("100.50"));
//		c1.setTipo("Ahorro");
//		
//		CuentaBancaria c2=new CuentaBancaria();
//		c2.setClienteCedula("031265489");
//		c2.setNumero("5678");
//		c2.setSaldo(new BigDecimal("75.25"));
//		c2.setTipo("Corriente");

//		this.cuentaService.insertarCuentaBancaria(c1);
//		this.cuentaService.insertarCuentaBancaria(c2);

//		this.cuentaService.realizarTransferencia("12345", "5678", new BigDecimal(20));

//		//Insertar Turista
//		Turista t1= new Turista();
//		t1.setNombre("Pedro");
//		t1.setValor(new BigDecimal(500.00));
//		t1.setAbono(new BigDecimal(150.00));
//		
//		Turista t2= new Turista();
//		t2.setNombre("Maria");
//		t2.setValor(new BigDecimal(350.00));
//		t2.setAbono(new BigDecimal(75.50));
//		
//		this.turistaService.insertarTurista(t1);
//		this.turistaService.insertarTurista(t2);
//		
//		//Imprimir turistas con el saldo ya calculado
//		List<Turista> listaSaldoTuristas=this.turistaService.obtenerTodosTuristas();
//		for(Turista turista: listaSaldoTuristas) {
//			LOG.info(turista.toString());
//		}
//		

//		//Factura Sencilla
//		List<FacturaSencilla>  lista=this.facturaService.buscarPorFechaSencilla(LocalDateTime.now());
//		for(FacturaSencilla f:lista) {
//	
//			LOG.info(f.toString());
//		}
//		
		// Cliente
//		
//		Cliente cliente= new Cliente();
//		cliente.setNombre("Juan");
//		
//		List<String>lista= new ArrayList<>();
//		lista.add("099999");
//		lista.add("2560004");
//		cliente.setTelefono(lista);
//		
//		this.clienteService.guardar(cliente);
//		

//		//JOIN FETCH
//		List<Factura> lista= this.facturaService.buscarPorFechaJOINFETCH(LocalDateTime.now());
//		for(Factura f:lista) {
//			LOG.info("Detalles:"+ f.getDetalles());
//			LOG.info(f.toString());
//		}
////		
//		LOG.info("-----------DETALLE FACTURA------------------");

//		List<DetalleFactura>lista2=this.detalleFacturaService.buscarProductors(new BigDecimal(1.00));
//		for(DetalleFactura d:lista2) {
//			LOG.info(d.toString());
//		}

//		this.detalleFacturaService.buscarProductors(new BigDecimal(1.00),LocalDateTime.now() );

		// JOIN-LEFT JOIN

//		this.facturaService.buscarPorFechaLEFTJOIN(LocalDateTime.now());

		// WHERE JOIN
//		this.facturaService.buscarPorFechaWHERE(LocalDateTime.now());

//		for(Factura factura : listaFactura) {
//			LOG.info(factura.toString());
//		}

		/*
		 * //CiudadanoService Ciudadano miCiudadano= new Ciudadano();
		 * miCiudadano.setNombre("Juan"); miCiudadano.setApellido("Perez");
		 * 
		 * Empleado e1= new Empleado(); e1.setIess("adasdasd"); e1.setSalario(new
		 * BigDecimal(50.50)); e1.setCiudadano(miCiudadano);
		 * 
		 * miCiudadano.setEmpleado(e1);
		 * 
		 * this.ciudadanoService.guardarCiudadano(miCiudadano);
		 * 
		 * //Facttura Factura miFactura= new Factura(); miFactura.setCedula("11111");
		 * LocalDateTime miFecha= LocalDateTime.of(1989, Month.AUGUST,8,12,45);
		 * miFactura.setFecha(miFecha); miFactura.setNumero("123-231");
		 * 
		 * 
		 * 
		 * //Vamos a construir la lista de detalles //List es una interface
		 * List<DetalleFactura> detalles= new ArrayList<>();
		 * 
		 * 
		 * //Primer Detalle a agregar DetalleFactura d1= new DetalleFactura();
		 * d1.setCantidad(2); d1.setPrecio(new BigDecimal(2.57));
		 * d1.setFactura(miFactura);
		 * 
		 * //Segund detalle DetalleFactura d2= new DetalleFactura(); d2.setCantidad(10);
		 * d2.setPrecio(new BigDecimal(10.50)); d2.setFactura(miFactura);
		 * 
		 * detalles.add(d1); detalles.add(d2);
		 * 
		 * //Agregar detalle en el atributo de la factura
		 * miFactura.setDetalles(detalles);
		 * 
		 * this.facturaService.guardarFactura(miFactura);
		 * 
		 * 
		 * //Buscar por NamedQuery // Guardia
		 * gApellido=this.guardiaService.buscarGuardiaPorApellidoNamed("Lopez"); //
		 * LOG.info("El guardia es "+gApellido);
		 * 
		 * /* //Buscar po TypedQuery Guardia
		 * gApellido=this.guardiaService.buscarGuardiaPorApellidoType("Lopez");
		 * System.out.println(gApellido);
		 * 
		 * //Buscar por Apellido //Guardia
		 * gApellido=this.guardiaService.buscarPorApellido("Perez22");
		 * //System.out.println(gApellido);
		 * 
		 * //Guardia
		 * gApellido=this.guardiaService.buscarGuardiaPorApellidoLista("Parker");
		 * //System.out.println(gApellido);
		 * 
		 * //Eliminar //this.guardiaService.borrar(2);
		 * 
		 * 
		 * 
		 * 
		 * Guardia g1= new Guardia(); g1.setNombre("Juan"); g1.setApellido("Lopez");
		 * g1.setEdificio("Naciones Unidas; this.guardiaService.guardarGuardia(g1);
		 * 
		 * /* //Buscar //Guardia g1=this.guardiaService.buscar(2);
		 * //System.out.println(g1);
		 */

		// Actualizar
		/*
		 * Guardia g2=new Guardia(); g2.setId(2); g2.setApellido("Jean");
		 * g2.setNombre("Mary"); g2.setEdificio("Vilalflora");
		 * 
		 * this.guardiaService.actualizar(g2);
		 * 
		 * //GESTOR SERVICE Paciente p1= new Paciente(); p1.setId(5);
		 * p1.setNombre("Juan"); p1.setApellido("Guevara"); p1.setEdad(50);
		 * 
		 * Receta r1= new Receta(); r1.setId(1);
		 * r1.setIndicaciones("Guardar reposo 5 semanas");
		 * r1.setMedicamentos("Paracetamol");
		 * 
		 * this.gestorCitaService.registrarNuevaConsulta(p1, r1);
		 * 
		 * 
		 * 
		 * 
		 * // PACIENTE Paciente paciente1 = new Paciente(); paciente1.setId(4);
		 * paciente1.setNombre("Fernanda"); paciente1.setApellido("Carrion");
		 * paciente1.setEdad(20);
		 * //this.pacienteService.insertarPacienteNuevo(paciente1); Paciente
		 * p1=this.pacienteService.buscarPacientePorId(2);
		 * System.out.println("El paciente que usted esta buscando es: ");
		 * System.out.println(p1);
		 * //this.pacienteService.actualizarPacienteNuevo(paciente1);
		 * //this.pacienteService.borrarPacientePorId(3);
		 * 
		 * 
		 * 
		 * METODOS INSERTAR // Equipo Equipo equipo1 = new Equipo(); equipo1.setId(1);
		 * equipo1.setNombre("Milan"); equipo1.setCiudad("Milan");
		 * equipo1.setPais("Italia"); equipo1.setPresidente("Fiorelli");
		 * equipo1.setNumeroCampeonatos(25);
		 * this.equipoService.insertarEquipoNuevo(equipo1);
		 * 
		 * 
		 * // Estudiante Estudiante estudiante1 = new Estudiante();
		 * estudiante1.setId(1); estudiante1.setNombre("Maria");
		 * estudiante1.setApellido("Perez"); estudiante1.setCarrera("Medicina");
		 * estudiante1.setDireccion("Mariana y Colon");
		 * estudiante1.setCelular("0999555");
		 * this.estudianteService.insertarEstudianteNuevo(estudiante1);
		 * 
		 * 
		 * 
		 * // Guia Telefonica GuiaTelefonica usuario1 = new GuiaTelefonica();
		 * usuario1.setId(1); usuario1.setNombre("Luis");
		 * usuario1.setApellido("Carrillo"); usuario1.setCiudad("Cuenca");
		 * usuario1.setDireccion("Olmedo y Bolivar"); usuario1.setTelefono("256001");
		 * this.guiaService.insertarUsuarioNuevoGuiaTelefonica(usuario1);
		 * 
		 * 
		 * 
		 * // Hotel Hotel hotel1 = new Hotel(); hotel1.setId(1);
		 * hotel1.setNombre("Gran Libertador"); hotel1.setCiudad("Loja");
		 * hotel1.setPais("Ecuador"); hotel1.setEstrellas(2);
		 * hotel1.setPrecioNoche(50.00); this.hotelService.insertarHotelNuevo(hotel1);
		 * 
		 * 
		 * 
		 * 
		 * // Libro Libro libro1 = new Libro(); libro1.setId(1);
		 * libro1.setNombre("20 Poemas"); libro1.setAutor("Pablo Neruda");
		 * libro1.setCategoria("Literatura"); libro1.setSubcategoria("Poemas");
		 * libro1.setEditorial("Española");
		 * this.libroService.insertarLibroNuevo(libro1);
		 * 
		 * 
		 * 
		 * // Materia Materia materia1 = new Materia(); materia1.setId(1);
		 * materia1.setNombre("Investigacion");
		 * materia1.setProfesorImparteMateria(" Pablo Perez");
		 * materia1.setFacultad("Quimica"); materia1.setNumeroEstudiantes(20);
		 * materia1.setHoras(2); this.materiaService.insertarMateriaNueva(materia1);
		 * 
		 * 
		 * // Pelicula Pelicula pelicula1 = new Pelicula(); pelicula1.setId(1);
		 * pelicula1.setNombre("No mires arriba");
		 * pelicula1.setDirector("Quentin Tarantino"); pelicula1.setGenero("Satira");
		 * pelicula1.setProductora("Netflix");
		 * pelicula1.setActorPrincipal("Leonardo Dicaprio");
		 * pelicula1.setActrizPrincipal("Jeniffer Aniston");
		 * this.peliculaService.insertarPeliculaNueva(pelicula1);
		 * 
		 * 
		 * // Ropa Ropa ropa1 = new Ropa(); ropa1.setId(1); ropa1.setNombre("Pantalon");
		 * ropa1.setTemporada("Verano"); ropa1.setMarca("Bershka");
		 * ropa1.setTalla("XL"); ropa1.setPrecio(15.50);
		 * this.ropaService.insertarRopaNuevo(ropa1);
		 * 
		 * 
		 * // Universidad Universidad universidad1 = new Universidad();
		 * universidad1.setId(1); universidad1.setNombre("Politecnica Nacional");
		 * universidad1.setCiudad("Quito"); universidad1.setNumeroCarreras(10);
		 * universidad1.setNumeroEstudiantes(5000); universidad1.setCalificacion('A');
		 * this.universidadService.insertarUniversidadNuevo(universidad1);
		 * 
		 * 
		 * // Videojuego Videojuego videojuego1 = new Videojuego();
		 * videojuego1.setId(1); videojuego1.setNombre("FIFA 21");
		 * videojuego1.setDistribuidor("EA"); videojuego1.setGenero("Depor");
		 * videojuego1.setModoJuego("Multi"); videojuego1.setClasificacion("+18");
		 * this.videojuegoService.insertarVideojuegoNuevo(videojuego1);
		 * 
		 * 
		 * 
		 * 
		 * //METODO PARA ELIMINAR this.equipoService.borrarEquipoPorId(2);
		 * this.estudianteService.borrarEstudiantePorId(2);
		 * this.guiaService.borrarUsuarioGuiaPorId(2);
		 * this.hotelService.borrarHotelPorId(2); this.libroService.borrarLibroPorId(2);
		 * this.materiaService.borrarMateriaPorId(2);
		 * this.peliculaService.borrarPeliculaPorId(2);
		 * this.ropaService.borrarRopaPorId(2);
		 * this.universidadService.borrarUniversidadPorId(2);
		 * this.videojuegoService.borrarVideojuegoPorId(2);
		 * 
		 * //METODOS PARA ACTUALIZAR //Equipo Equipo equipo3 = new Equipo();
		 * equipo3.setId(3); equipo3.setNombre("Deportivo Cuenca");
		 * equipo3.setCiudad("Cuenca"); equipo3.setPais("Ecuador");
		 * equipo3.setPresidente("Juan Fernandez"); equipo3.setNumeroCampeonatos(1);
		 * this.equipoService.actualizarEquipoNuevo(equipo3);
		 * 
		 * //Estudiante Estudiante estudiante3 = new Estudiante(); estudiante3.setId(3);
		 * estudiante3.setNombre("Juana"); estudiante3.setApellido("Jaramillo");
		 * estudiante3.setCarrera("Educacion Fisica");
		 * estudiante3.setDireccion("Estvez y Orellana");
		 * estudiante3.setCelular("0979854562");
		 * this.estudianteService.actualizarEstudianteNuevo(estudiante3);
		 * 
		 * //GuiaTelefonica GuiaTelefonica usuario3 = new GuiaTelefonica();
		 * usuario3.setId(3); usuario3.setNombre("Julio");
		 * usuario3.setApellido("Calderas"); usuario3.setCiudad("Quito");
		 * usuario3.setDireccion("America y Barcelona"); usuario3.setTelefono("522666");
		 * this.guiaService.actualizarUsuarioGuiaNuevo(usuario3);
		 * 
		 * //Hotel Hotel hotel3 = new Hotel(); hotel3.setId(3);
		 * hotel3.setNombre("Fiesta"); hotel3.setCiudad("Medallin");
		 * hotel3.setPais("Colombia"); hotel3.setEstrellas(3);
		 * hotel3.setPrecioNoche(60.00); this.hotelService.actualizarHotelNuevo(hotel3);
		 * 
		 * //Libro Libro libro3 = new Libro(); libro3.setId(3);
		 * libro3.setNombre("Vectores"); libro3.setAutor("Luis Andrade");
		 * libro3.setCategoria("Educacion"); libro3.setSubcategoria("Fisica");
		 * libro3.setEditorial("Sanitas");
		 * this.libroService.actualizarLibroNuevo(libro3);
		 * 
		 * //Materia
		 * 
		 * Materia materia3 = new Materia(); materia3.setId(3);
		 * materia3.setNombre("Historia");
		 * materia3.setProfesorImparteMateria("Carmita Lara");
		 * materia3.setFacultad("Arquitectura"); materia3.setNumeroEstudiantes(15);
		 * materia3.setHoras(10); this.materiaService.actualizarMateriaNuevo(materia3);
		 * 
		 * //Pelicula Pelicula pelicula3 = new Pelicula(); pelicula3.setId(3);
		 * pelicula3.setNombre("Spiderman"); pelicula3.setDirector("Juan Ash");
		 * pelicula3.setGenero("Superheroes"); pelicula3.setProductora("Diney");
		 * pelicula3.setActorPrincipal("Tom Holland");
		 * pelicula3.setActrizPrincipal("Scarlet Johanson");
		 * this.peliculaService.actualizarPeliculaNuevo(pelicula3);
		 * 
		 * //Ropa Ropa ropa3 = new Ropa(); ropa3.setId(3); ropa3.setNombre("Falda");
		 * ropa3.setTemporada("Primavera"); ropa3.setMarca("Bershka");
		 * ropa3.setTalla("S"); ropa3.setPrecio(17.25);
		 * this.ropaService.actualizarRopaNuevo(ropa3);
		 * 
		 * //Universidad Universidad universidad3 = new Universidad();
		 * universidad3.setId(3); universidad3.setNombre("Catolica Cuenca");
		 * universidad3.setCiudad("Catolica"); universidad3.setNumeroCarreras(11);
		 * universidad3.setNumeroEstudiantes(5500); universidad3.setCalificacion('C');
		 * this.universidadService.actualizarUniversidadNuevo(universidad3);
		 * 
		 * //Videojuego Videojuego videojuego3= new Videojuego(); videojuego3.setId(3);
		 * videojuego3.setNombre("PUBG"); videojuego3.setDistribuidor("Steam");
		 * videojuego3.setGenero("Global Defense");
		 * videojuego3.setModoJuego("Multijugador");
		 * videojuego3.setClasificacion("+18");
		 * this.videojuegoService.actualizarVideojuegoNuevo(videojuego3);
		 * 
		 * 
		 * 
		 * //METODOS PARA BUSCAR
		 * 
		 * //Equipo Equipo e1=this.equipoService.buscarEquipoPorId(3);
		 * LOG.info("El equipo que usted esta buscando es: "); LOG.info("-"+e1);
		 * 
		 * //Estudiante Estudiante es1= this.estudianteService.buscarEstudiantePorId(3);
		 * LOG.info("El estudiante que usted esta buscando es: "); LOG.info("-"+es1);
		 * 
		 * //Guia Telefonica GuiaTelefonica
		 * g1=this.guiaService.buscarUsuarioGuiaPorId(3);
		 * LOG.info("El usuario de guia que usted esta buscando es: ");
		 * LOG.info("-"+g1);
		 * 
		 * //Hotel Hotel h1= this.hotelService.buscarHotelPorId(3);
		 * LOG.info("El hotel que usted esta buscando es: "); LOG.info("-"+h1);
		 * 
		 * //Libro Libro l1= this.libroService.buscarLibroPorId(3);
		 * LOG.info("El libro que usted esta buscando es: "); LOG.info("-"+l1);
		 * 
		 * //Materia Materia m1=this.materiaService.buscarMateriaPorId(3);
		 * LOG.info("La materia que usted esta buscando es: "); LOG.info("-"+m1);
		 * 
		 * //Pelicula Pelicula p1=this.peliculaService.buscarPeliculaPorId(3);
		 * LOG.info("La pelicula que usted esta buscando es: "); LOG.info("-"+p1);
		 * 
		 * 
		 * //Ropa Ropa r1=this.ropaService.buscarRopaPorId(3);
		 * LOG.info("La ropa que usted esta buscando es: "); LOG.info("-"+r1);
		 * 
		 * //Universidad Universidad
		 * u1=this.universidadService.buscarUniversidadPorId(3);
		 * LOG.info("La universidad que usted esta buscando es: "); LOG.info("-"+u1);
		 * 
		 * //Videojuego Videojuego v1= this.videojuegoService.buscarVideojuegoPorId(3);
		 * LOG.info("El videojuego que usted esta buscando es: "); LOG.info("-"+v1);
		 * 
		 * 
		 * 
		 * 
		 * //----------------------------JPA------------------------------------///
		 * //Metodos Insertar //Computadora Computadora c1= new Computadora();
		 * c1.setNombre("Lexus"); c1.setMarca("Lenovo"); c1.setPrecio(1050.50);
		 * computadoraService.guardar(c1);
		 * 
		 * //Empresa Empresa e1= new Empresa(); e1.setNombre("LG");
		 * e1.setPais("Corea del Sur"); e1.setNumeroEmpleados(10500);
		 * empresaService.guardar(e1);
		 * 
		 * //Farmacia Farmacia f1= new Farmacia(); f1.setNombre("Sanitas");
		 * f1.setCiudad("Loja"); f1.setNumeroSucursales(3); farmaciaService.guardar(f1);
		 * 
		 * //Parque Parque p1= new Parque(); p1.setNombre("La Carolina");
		 * p1.setPais("Ecuador"); p1.setArea(120.35); parqueService.guardar(p1);
		 * 
		 * //Supermercado Supermercado s1= new Supermercado(); s1.setNombre("TIA");
		 * s1.setPais("Ecuador"); s1.setNumeroSucursales(120);
		 * supermercadoService.guardar(s1);
		 * 
		 * //Metodos Actualizar //Computadora Computadora c2= new Computadora();
		 * c2.setId(11); c2.setNombre("Scorpio"); c2.setMarca("Asus");
		 * c2.setPrecio(1250.50); computadoraService.actualizar(c2);
		 * 
		 * //Empresa Empresa e2= new Empresa(); e2.setId(12); e2.setNombre("Whirlpool");
		 * e2.setPais("Estados Unidos"); e2.setNumeroEmpleados(5600);
		 * empresaService.actualizar(e2);
		 * 
		 * //Farmacia Farmacia f2= new Farmacia(); f2.setId(13);
		 * f2.setNombre("Sana Sana"); f2.setCiudad("Quito"); f2.setNumeroSucursales(13);
		 * farmaciaService.actualizar(f2);
		 * 
		 * //Parque Parque p2= new Parque(); p2.setId(14); p2.setNombre("Central Park");
		 * p2.setPais("Estaddos Unidos"); p2.setArea(520.70);
		 * parqueService.actualizar(p2);
		 * 
		 * //Supermercado Supermercado s2= new Supermercado(); s2.setId(15);
		 * s2.setNombre("Supermaxi"); s2.setPais("Ecuador");
		 * s2.setNumeroSucursales(500); supermercadoService.actualizar(s2);
		 * 
		 * 
		 * //Eliminar por id this.computadoraService.borrar(6);
		 * this.empresaService.borrar(7); this.farmaciaService.borrar(8);
		 * this.parqueService.borrar(9); this.supermercadoService.borrar(10);
		 * 
		 * 
		 * //Buscar por id LOG.info("");
		 * LOG.info("----------------BUSQUE POR ID-----------------------------");
		 * Computadora c1=this.computadoraService.buscar(1); LOG.info("-"+c1); Empresa
		 * e1=this.empresaService.buscar(1); LOG.info("-"+e1); Farmacia
		 * f1=this.farmaciaService.buscar(1); LOG.info("-"+f1); Parque
		 * p1=this.parqueService.buscar(1); LOG.info("-"+p1); Supermercado
		 * s1=this.supermercadoService.buscar(1); LOG.info("-"+s1); LOG.info("");
		 * 
		 * //Buscar por otro parametro LOG.info(""); LOG.
		 * info("----------------BUSQUE POR OTRO PARAMETRO-----------------------------"
		 * );
		 * 
		 * Computadora c2=this.computadoraService.buscarPorMarca("Asus");
		 * LOG.info("-"+c2); Empresa
		 * e2=this.empresaService.buscarPorNombre("Whirlpool"); LOG.info("-"+e2);
		 * Farmacia f2=this.farmaciaService.buscarPorNombre("Sana Sana");
		 * LOG.info("-"+f2); Parque
		 * p2=this.parqueService.buscarPorPais("Estaddos Unidos"); LOG.info("-"+p2);
		 * Supermercado s2=this.supermercadoService.buscarPorNombre("Supermaxi");
		 * LOG.info("-"+s2); LOG.info("");
		 * 
		 * // Busqueda por otro parametro TypedQuery LOG.info(""); LOG.
		 * info("----------------BUSQUE POR OTRO PARAMETRO: TypedQuery -----------------------------"
		 * ); Computadora
		 * c2=this.computadoraService.buscarComputadoraPorMarcaType("Asus");
		 * LOG.info("-"+c2); Empresa
		 * e2=this.empresaService.buscarEmpresaPorNombreType("Whirlpool");
		 * LOG.info("-"+e2); Farmacia
		 * f2=this.farmaciaService.buscarFarmaciaPorNombreType("Sana Sana");
		 * LOG.info("-"+f2); Parque
		 * p2=this.parqueService.buscarParquePorPaisType("Estaddos Unidos");
		 * LOG.info("-"+p2); Supermercado
		 * s2=this.supermercadoService.buscarSupermercadoPorNombreType("Supermaxi");
		 * LOG.info("-"+s2); LOG.info("");
		 * 
		 * // Busqueda por otro parametro NamedQuery LOG.info(""); LOG.
		 * info("----------------BUSQUE POR OTRO PARAMETRO: NamedQuery -----------------------------"
		 * ); Computadora
		 * c3=this.computadoraService.buscarComputadoraPorMarcaNamed("Lenovo");
		 * LOG.info("-"+c3); Empresa
		 * e3=this.empresaService.buscarEmpresaPorNombreNamed("LG"); LOG.info("-"+e3);
		 * Farmacia f3=this.farmaciaService.buscarFarmaciaPorNombreNamed("Sanitas");
		 * LOG.info("-"+f3); Parque
		 * p3=this.parqueService.buscarParquePorPaisNamed("Ecuador"); LOG.info("-"+p3);
		 * Supermercado
		 * s3=this.supermercadoService.buscarSupermercadoPorNombreNamed("TIA");
		 * LOG.info("-"+s3); LOG.info("");
		 */
	}

}
