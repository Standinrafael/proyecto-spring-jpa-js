package ec.edu.uce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Computadora;
import ec.edu.uce.modelo.jpa.Empresa;
import ec.edu.uce.modelo.jpa.Farmacia;
import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.modelo.jpa.Parque;
import ec.edu.uce.modelo.jpa.Supermercado;
import ec.edu.uce.service.IComputadoraService;
import ec.edu.uce.service.IEmpresaService;
import ec.edu.uce.service.IEquipoService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IFarmaciaService;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.IGuiaTelefonicaService;
import ec.edu.uce.service.IHotelService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IParqueService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IRopaService;
import ec.edu.uce.service.ISupermercadoService;
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

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Buscar por NamedQuery
	//	Guardia gApellido=this.guardiaService.buscarGuardiaPorApellidoNamed("Lopez");
	//	LOG.info("El guardia es "+gApellido);
		
	    /*	
		//Buscar po TypedQuery
		Guardia gApellido=this.guardiaService.buscarGuardiaPorApellidoType("Lopez");
		System.out.println(gApellido);
		
		//Buscar por Apellido
	    //Guardia gApellido=this.guardiaService.buscarPorApellido("Perez22");
		//System.out.println(gApellido);
		
		//Guardia gApellido=this.guardiaService.buscarGuardiaPorApellidoLista("Parker");
		//System.out.println(gApellido);
		
		//Eliminar
		//this.guardiaService.borrar(2);
		
		
		
		
		Guardia g1= new Guardia();		
		g1.setNombre("Juan");
		g1.setApellido("Lopez");
		g1.setEdificio("Naciones Unidas;
		this.guardiaService.guardarGuardia(g1);
		
		/*
		 * //Buscar		
		//Guardia g1=this.guardiaService.buscar(2);
		//System.out.println(g1);
		 */
		
		//Actualizar
		/*
		Guardia g2=new Guardia();
		g2.setId(2);
		g2.setApellido("Jean");
		g2.setNombre("Mary");
		g2.setEdificio("Vilalflora");
		
		this.guardiaService.actualizar(g2);
		
		//GESTOR SERVICE 
		Paciente p1= new Paciente();
		p1.setId(5);
		p1.setNombre("Juan");
		p1.setApellido("Guevara");
		p1.setEdad(50);
		
		Receta r1= new Receta();
		r1.setId(1);
		r1.setIndicaciones("Guardar reposo 5 semanas");
		r1.setMedicamentos("Paracetamol");
		
		this.gestorCitaService.registrarNuevaConsulta(p1, r1);
		
		
		

		// PACIENTE
		Paciente paciente1 = new Paciente();
		paciente1.setId(4);
		paciente1.setNombre("Fernanda");
		paciente1.setApellido("Carrion");
		paciente1.setEdad(20);
		//this.pacienteService.insertarPacienteNuevo(paciente1);
		Paciente p1=this.pacienteService.buscarPacientePorId(2);
		System.out.println("El paciente que usted esta buscando es: ");
		System.out.println(p1);
		//this.pacienteService.actualizarPacienteNuevo(paciente1);
		//this.pacienteService.borrarPacientePorId(3);
		
		
		
		 METODOS INSERTAR
		// Equipo
		Equipo equipo1 = new Equipo();
		equipo1.setId(1);
		equipo1.setNombre("Milan");
		equipo1.setCiudad("Milan");
		equipo1.setPais("Italia");
		equipo1.setPresidente("Fiorelli");
		equipo1.setNumeroCampeonatos(25);
		this.equipoService.insertarEquipoNuevo(equipo1);


		// Estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setId(1);
		estudiante1.setNombre("Maria");
		estudiante1.setApellido("Perez");
		estudiante1.setCarrera("Medicina");
		estudiante1.setDireccion("Mariana y Colon");
		estudiante1.setCelular("0999555");
		this.estudianteService.insertarEstudianteNuevo(estudiante1);

		

		// Guia Telefonica
		GuiaTelefonica usuario1 = new GuiaTelefonica();
		usuario1.setId(1);
		usuario1.setNombre("Luis");
		usuario1.setApellido("Carrillo");
		usuario1.setCiudad("Cuenca");
		usuario1.setDireccion("Olmedo y Bolivar");
		usuario1.setTelefono("256001");
		this.guiaService.insertarUsuarioNuevoGuiaTelefonica(usuario1);

		

		// Hotel
		Hotel hotel1 = new Hotel();
		hotel1.setId(1);
		hotel1.setNombre("Gran Libertador");
		hotel1.setCiudad("Loja");
		hotel1.setPais("Ecuador");
		hotel1.setEstrellas(2);
		hotel1.setPrecioNoche(50.00);
		this.hotelService.insertarHotelNuevo(hotel1);

		
		  

		// Libro
		Libro libro1 = new Libro();
		libro1.setId(1);
		libro1.setNombre("20 Poemas");
		libro1.setAutor("Pablo Neruda");
		libro1.setCategoria("Literatura");
		libro1.setSubcategoria("Poemas");
		libro1.setEditorial("Española");
		this.libroService.insertarLibroNuevo(libro1);

		 	

		// Materia
		Materia materia1 = new Materia();
		materia1.setId(1);
		materia1.setNombre("Investigacion");
		materia1.setProfesorImparteMateria(" Pablo Perez");
		materia1.setFacultad("Quimica");
		materia1.setNumeroEstudiantes(20);
		materia1.setHoras(2);
		this.materiaService.insertarMateriaNueva(materia1);		
		
		
		// Pelicula
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setId(1);
		pelicula1.setNombre("No mires arriba");
		pelicula1.setDirector("Quentin Tarantino");
		pelicula1.setGenero("Satira");
		pelicula1.setProductora("Netflix");
		pelicula1.setActorPrincipal("Leonardo Dicaprio");
		pelicula1.setActrizPrincipal("Jeniffer Aniston");
		this.peliculaService.insertarPeliculaNueva(pelicula1);			
		

		// Ropa
		Ropa ropa1 = new Ropa();
		ropa1.setId(1);
		ropa1.setNombre("Pantalon");
		ropa1.setTemporada("Verano");
		ropa1.setMarca("Bershka");
		ropa1.setTalla("XL");
		ropa1.setPrecio(15.50);
		this.ropaService.insertarRopaNuevo(ropa1);	
				

		// Universidad
		Universidad universidad1 = new Universidad();
		universidad1.setId(1);
		universidad1.setNombre("Politecnica Nacional");
		universidad1.setCiudad("Quito");
		universidad1.setNumeroCarreras(10);
		universidad1.setNumeroEstudiantes(5000);
		universidad1.setCalificacion('A');
		this.universidadService.insertarUniversidadNuevo(universidad1);
		

		// Videojuego
		Videojuego videojuego1 = new Videojuego();
		videojuego1.setId(1);
		videojuego1.setNombre("FIFA 21");
		videojuego1.setDistribuidor("EA");
		videojuego1.setGenero("Depor");
		videojuego1.setModoJuego("Multi");
		videojuego1.setClasificacion("+18");
		this.videojuegoService.insertarVideojuegoNuevo(videojuego1);

				

		
		//METODO PARA ELIMINAR
		this.equipoService.borrarEquipoPorId(2);
		this.estudianteService.borrarEstudiantePorId(2);
		this.guiaService.borrarUsuarioGuiaPorId(2);
		this.hotelService.borrarHotelPorId(2);
		this.libroService.borrarLibroPorId(2);
		this.materiaService.borrarMateriaPorId(2);
		this.peliculaService.borrarPeliculaPorId(2);
		this.ropaService.borrarRopaPorId(2);
		this.universidadService.borrarUniversidadPorId(2);
		this.videojuegoService.borrarVideojuegoPorId(2);
		
		//METODOS PARA ACTUALIZAR
		   //Equipo
		Equipo equipo3 = new Equipo();
		equipo3.setId(3);
		equipo3.setNombre("Deportivo Cuenca");
		equipo3.setCiudad("Cuenca");
		equipo3.setPais("Ecuador");
		equipo3.setPresidente("Juan Fernandez");
		equipo3.setNumeroCampeonatos(1);
		this.equipoService.actualizarEquipoNuevo(equipo3);
		  
		  //Estudiante
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setId(3);
		estudiante3.setNombre("Juana");
		estudiante3.setApellido("Jaramillo");
		estudiante3.setCarrera("Educacion Fisica");
		estudiante3.setDireccion("Estvez y Orellana");
		estudiante3.setCelular("0979854562");
		this.estudianteService.actualizarEstudianteNuevo(estudiante3);
		
		  //GuiaTelefonica
		GuiaTelefonica usuario3 = new GuiaTelefonica();
		usuario3.setId(3);
		usuario3.setNombre("Julio");
		usuario3.setApellido("Calderas");
		usuario3.setCiudad("Quito");
		usuario3.setDireccion("America y Barcelona");
		usuario3.setTelefono("522666");
		this.guiaService.actualizarUsuarioGuiaNuevo(usuario3);
		
		  //Hotel
		Hotel hotel3 = new Hotel();
		hotel3.setId(3);
		hotel3.setNombre("Fiesta");
		hotel3.setCiudad("Medallin");
		hotel3.setPais("Colombia");
		hotel3.setEstrellas(3);
		hotel3.setPrecioNoche(60.00);
		this.hotelService.actualizarHotelNuevo(hotel3);
		
		  //Libro
		Libro libro3 = new Libro();
		libro3.setId(3);
		libro3.setNombre("Vectores");
		libro3.setAutor("Luis Andrade");
		libro3.setCategoria("Educacion");
		libro3.setSubcategoria("Fisica");
		libro3.setEditorial("Sanitas");
		this.libroService.actualizarLibroNuevo(libro3);
		
		  //Materia
		
		Materia materia3 = new Materia();
		materia3.setId(3);
		materia3.setNombre("Historia");
		materia3.setProfesorImparteMateria("Carmita Lara");
		materia3.setFacultad("Arquitectura");
		materia3.setNumeroEstudiantes(15);
		materia3.setHoras(10);
		this.materiaService.actualizarMateriaNuevo(materia3);
		
		  //Pelicula
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setId(3);
		pelicula3.setNombre("Spiderman");
		pelicula3.setDirector("Juan Ash");
		pelicula3.setGenero("Superheroes");
		pelicula3.setProductora("Diney");
		pelicula3.setActorPrincipal("Tom Holland");
		pelicula3.setActrizPrincipal("Scarlet Johanson");
		this.peliculaService.actualizarPeliculaNuevo(pelicula3);
		
		  //Ropa
		Ropa ropa3 = new Ropa();
		ropa3.setId(3);
		ropa3.setNombre("Falda");
		ropa3.setTemporada("Primavera");
		ropa3.setMarca("Bershka");
		ropa3.setTalla("S");
		ropa3.setPrecio(17.25);
		this.ropaService.actualizarRopaNuevo(ropa3);	
		
		  //Universidad
		Universidad universidad3 = new Universidad();
		universidad3.setId(3);
		universidad3.setNombre("Catolica Cuenca");
		universidad3.setCiudad("Catolica");
		universidad3.setNumeroCarreras(11);
		universidad3.setNumeroEstudiantes(5500);
		universidad3.setCalificacion('C');
		this.universidadService.actualizarUniversidadNuevo(universidad3);
		
		  //Videojuego
		Videojuego videojuego3= new Videojuego();
		videojuego3.setId(3);
		videojuego3.setNombre("PUBG");
		videojuego3.setDistribuidor("Steam");
		videojuego3.setGenero("Global Defense");
		videojuego3.setModoJuego("Multijugador");
		videojuego3.setClasificacion("+18");
		this.videojuegoService.actualizarVideojuegoNuevo(videojuego3);
		
		
		
		//METODOS PARA BUSCAR
		
		  //Equipo
		Equipo e1=this.equipoService.buscarEquipoPorId(3);
		LOG.info("El equipo que usted esta buscando es: ");
		LOG.info("-"+e1);

		  //Estudiante
		Estudiante es1= this.estudianteService.buscarEstudiantePorId(3);
		LOG.info("El estudiante que usted esta buscando es: ");
		LOG.info("-"+es1);
		
		  //Guia Telefonica
		GuiaTelefonica g1=this.guiaService.buscarUsuarioGuiaPorId(3);
		LOG.info("El usuario de guia que usted esta buscando es: ");
		LOG.info("-"+g1);
		
		  //Hotel
		Hotel h1= this.hotelService.buscarHotelPorId(3);
		LOG.info("El hotel que usted esta buscando es: ");
		LOG.info("-"+h1);
		
		  //Libro
		Libro l1= this.libroService.buscarLibroPorId(3);
		LOG.info("El libro que usted esta buscando es: ");
		LOG.info("-"+l1);
		
		  //Materia
		Materia m1=this.materiaService.buscarMateriaPorId(3);
		LOG.info("La materia que usted esta buscando es: ");
		LOG.info("-"+m1);
		
		  //Pelicula
		Pelicula p1=this.peliculaService.buscarPeliculaPorId(3);
		LOG.info("La pelicula que usted esta buscando es: ");
		LOG.info("-"+p1);
	
		
		  //Ropa
		Ropa r1=this.ropaService.buscarRopaPorId(3);
		LOG.info("La ropa que usted esta buscando es: ");
		LOG.info("-"+r1);
		
		  //Universidad
		Universidad u1=this.universidadService.buscarUniversidadPorId(3);
		LOG.info("La universidad que usted esta buscando es: ");
		LOG.info("-"+u1);
		
		  //Videojuego
		Videojuego v1= this.videojuegoService.buscarVideojuegoPorId(3);
		LOG.info("El videojuego que usted esta buscando es: ");
		LOG.info("-"+v1);
		
		
		
		
		//----------------------------JPA------------------------------------///
		//Metodos Insertar
		    //Computadora
		Computadora c1= new Computadora();
		c1.setNombre("Lexus");
		c1.setMarca("Lenovo");
		c1.setPrecio(1050.50);
		computadoraService.guardar(c1);
		
		    //Empresa
		Empresa e1= new Empresa();
		e1.setNombre("LG");
		e1.setPais("Corea del Sur");
		e1.setNumeroEmpleados(10500);
		empresaService.guardar(e1);
		
		    //Farmacia
		Farmacia f1= new Farmacia();
		f1.setNombre("Sanitas");
		f1.setCiudad("Loja");
		f1.setNumeroSucursales(3);
		farmaciaService.guardar(f1);
		
		    //Parque
		Parque p1= new Parque();
		p1.setNombre("La Carolina");
		p1.setPais("Ecuador");
		p1.setArea(120.35);
		parqueService.guardar(p1);
		
		    //Supermercado
		Supermercado s1= new Supermercado();
		s1.setNombre("TIA");
		s1.setPais("Ecuador");
		s1.setNumeroSucursales(120);
		supermercadoService.guardar(s1);
		
		//Metodos Actualizar
		 //Computadora
		Computadora c2= new Computadora();
		c2.setId(11);
		c2.setNombre("Scorpio");
		c2.setMarca("Asus");
		c2.setPrecio(1250.50);
		computadoraService.actualizar(c2);
		
		    //Empresa
		Empresa e2= new Empresa();
		e2.setId(12);
		e2.setNombre("Whirlpool");
		e2.setPais("Estados Unidos");
		e2.setNumeroEmpleados(5600);
		empresaService.actualizar(e2);
		
		    //Farmacia
		Farmacia f2= new Farmacia();
		f2.setId(13);
		f2.setNombre("Sana Sana");
		f2.setCiudad("Quito");
		f2.setNumeroSucursales(13);
		farmaciaService.actualizar(f2);
		
		    //Parque
		Parque p2= new Parque();
		p2.setId(14);
		p2.setNombre("Central Park");
		p2.setPais("Estaddos Unidos");
		p2.setArea(520.70);
		parqueService.actualizar(p2);
		
		    //Supermercado
		Supermercado s2= new Supermercado(); 
		s2.setId(15);
		s2.setNombre("Supermaxi");
		s2.setPais("Ecuador");
		s2.setNumeroSucursales(500);
		supermercadoService.actualizar(s2);
		
		
		//Eliminar por id
		this.computadoraService.borrar(6);
		this.empresaService.borrar(7);
		this.farmaciaService.borrar(8);
		this.parqueService.borrar(9);
		this.supermercadoService.borrar(10);
		

		//Buscar por id
		LOG.info("");
		LOG.info("----------------BUSQUE POR ID-----------------------------");
		Computadora c1=this.computadoraService.buscar(1);
		LOG.info("-"+c1);
		Empresa e1=this.empresaService.buscar(1);
		LOG.info("-"+e1);
		Farmacia f1=this.farmaciaService.buscar(1);
		LOG.info("-"+f1);
		Parque p1=this.parqueService.buscar(1);
		LOG.info("-"+p1);
		Supermercado s1=this.supermercadoService.buscar(1);
		LOG.info("-"+s1);
		LOG.info("");
		
		//Buscar por otro parametro
		LOG.info("");
		LOG.info("----------------BUSQUE POR OTRO PARAMETRO-----------------------------");
		
		Computadora c2=this.computadoraService.buscarPorMarca("Asus");
		LOG.info("-"+c2);
		Empresa e2=this.empresaService.buscarPorNombre("Whirlpool");
		LOG.info("-"+e2);
		Farmacia f2=this.farmaciaService.buscarPorNombre("Sana Sana");
		LOG.info("-"+f2);
		Parque p2=this.parqueService.buscarPorPais("Estaddos Unidos");
		LOG.info("-"+p2);
		Supermercado s2=this.supermercadoService.buscarPorNombre("Supermaxi");
		LOG.info("-"+s2);
		LOG.info("");*/
		
		// Busqueda por otro parametro TypedQuery
		LOG.info("");
		LOG.info("----------------BUSQUE POR OTRO PARAMETRO: TypedQuery -----------------------------");
		Computadora c2=this.computadoraService.buscarComputadoraPorMarcaType("Asus");
		LOG.info("-"+c2);
		Empresa e2=this.empresaService.buscarEmpresaPorNombreType("Whirlpool");
		LOG.info("-"+e2);
		Farmacia f2=this.farmaciaService.buscarFarmaciaPorNombreType("Sana Sana");
		LOG.info("-"+f2);
		Parque p2=this.parqueService.buscarParquePorPaisType("Estaddos Unidos");
		LOG.info("-"+p2);
		Supermercado s2=this.supermercadoService.buscarSupermercadoPorNombreType("Supermaxi");
		LOG.info("-"+s2);
		LOG.info("");
		
		// Busqueda por otro parametro NamedQuery 
		LOG.info("");
		LOG.info("----------------BUSQUE POR OTRO PARAMETRO: NamedQuery -----------------------------");
		Computadora c3=this.computadoraService.buscarComputadoraPorMarcaNamed("Lenovo");
		LOG.info("-"+c3);
		Empresa e3=this.empresaService.buscarEmpresaPorNombreNamed("LG");
		LOG.info("-"+e3);
		Farmacia f3=this.farmaciaService.buscarFarmaciaPorNombreNamed("Sanitas");
		LOG.info("-"+f3);
		Parque p3=this.parqueService.buscarParquePorPaisNamed("Ecuador");
		LOG.info("-"+p3);
		Supermercado s3=this.supermercadoService.buscarSupermercadoPorNombreNamed("TIA");
		LOG.info("-"+s3);
		LOG.info("");
	}

}
