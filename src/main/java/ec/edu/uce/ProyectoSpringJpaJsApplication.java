package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Receta;
import ec.edu.uce.service.IEquipoService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IGuiaTelefonicaService;
import ec.edu.uce.service.IHotelService;
import ec.edu.uce.service.ILibroService;
import ec.edu.uce.service.IMateriaService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.IPeliculaService;
import ec.edu.uce.service.IRopaService;
import ec.edu.uce.service.IUniversidadService;
import ec.edu.uce.service.IVideoJuegoService;

@SpringBootApplication
public class ProyectoSpringJpaJsApplication implements CommandLineRunner {

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

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaJsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
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
	/*	Paciente paciente1 = new Paciente();
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
		
		*/
		
		/*
		// Equipo
		Equipo equipo1 = new Equipo();
		equipo1.setId(1);
		equipo1.setNombre("Milan");
		equipo1.setCiudad("Milan");
		equipo1.setPais("Italia");
		equipo1.setPresidente("Fiorelli");
		equipo1.setNumeroCampeonatos(25);
		this.equipoService.insertarEquipoNuevo(equipo1);

		Equipo equipo2 = new Equipo();
		equipo2.setId(2);
		equipo2.setNombre("Barcelona");
		equipo2.setCiudad("Barcelona");
		equipo2.setPais("España");
		equipo2.setPresidente("Laporta");
		equipo2.setNumeroCampeonatos(36);
		this.equipoService.insertarEquipoNuevo(equipo2);
		
		Equipo equipo3 = new Equipo();
		equipo3.setId(3);
		equipo3.setNombre("Aucas");
		equipo3.setCiudad("Quito");
		equipo3.setPais("Ecuador");
		equipo3.setPresidente("Villavicencio");
		equipo3.setNumeroCampeonatos(3);
		this.equipoService.insertarEquipoNuevo(equipo3);

		// Estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setId(1);
		estudiante1.setNombre("Maria");
		estudiante1.setApellido("Perez");
		estudiante1.setCarrera("Medicina");
		estudiante1.setDireccion("Mariana y Colon");
		estudiante1.setCelular("0999555");
		this.estudianteService.insertarEstudianteNuevo(estudiante1);

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setId(2);
		estudiante2.setNombre("Kathe");
		estudiante2.setApellido("Acosta");
		estudiante2.setCarrera("Artes");
		estudiante2.setDireccion("Colon y Esmeraldas");
		estudiante2.setCelular("099333");
		this.estudianteService.insertarEstudianteNuevo(estudiante2);
		
		
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setId(3);
		estudiante3.setNombre("Paola");
		estudiante3.setApellido("Jaramillo");
		estudiante3.setCarrera("Filosofia");
		estudiante3.setDireccion("Bernardo y Bolivar");
		estudiante3.setCelular("09925789");
		this.estudianteService.insertarEstudianteNuevo(estudiante3);

		// Guia Telefonica
		GuiaTelefonica usuario1 = new GuiaTelefonica();
		usuario1.setId(1);
		usuario1.setNombre("Luis");
		usuario1.setApellido("Carrillo");
		usuario1.setCiudad("Cuenca");
		usuario1.setDireccion("Olmedo y Bolivar");
		usuario1.setTelefono("256001");
		this.guiaService.insertarUsuarioNuevoGuiaTelefonica(usuario1);

		GuiaTelefonica usuario2 = new GuiaTelefonica();
		usuario2.setId(2);
		usuario2.setNombre("Fernando");
		usuario2.setApellido("Olmedo");
		usuario2.setCiudad("Ambato");
		usuario2.setDireccion("Plaza y Napo");
		usuario2.setTelefono("35214");
		this.guiaService.insertarUsuarioNuevoGuiaTelefonica(usuario2);
		
		
		GuiaTelefonica usuario3 = new GuiaTelefonica();
		usuario3.setId(3);
		usuario3.setNombre("Julian");
		usuario3.setApellido("Calderon");
		usuario3.setCiudad("Quito");
		usuario3.setDireccion("America y Madrid");
		usuario3.setTelefono("529632");
		this.guiaService.insertarUsuarioNuevoGuiaTelefonica(usuario3);

		// Hotel
		Hotel hotel1 = new Hotel();
		hotel1.setId(1);
		hotel1.setNombre("Gran Libertador");
		hotel1.setCiudad("Loja");
		hotel1.setPais("Ecuador");
		hotel1.setEstrellas(2);
		hotel1.setPrecioNoche(50.00);
		this.hotelService.insertarHotelNuevo(hotel1);

		Hotel hotel2 = new Hotel();
		hotel2.setId(2);
		hotel2.setNombre("Buena Ventura");
		hotel2.setCiudad("Madrid");
		hotel2.setPais("España");
		hotel2.setEstrellas(5);
		hotel2.setPrecioNoche(90.00);
		this.hotelService.insertarHotelNuevo(hotel2);
		
		Hotel hotel3 = new Hotel();
		hotel3.setId(3);
		hotel3.setNombre("Esperanza");
		hotel3.setCiudad("Cali");
		hotel3.setPais("Colombia");
		hotel3.setEstrellas(4);
		hotel3.setPrecioNoche(70.00);
		this.hotelService.insertarHotelNuevo(hotel3);

		// Libro
		Libro libro1 = new Libro();
		libro1.setId(1);
		libro1.setNombre("20 Poemas");
		libro1.setAutor("Pablo Neruda");
		libro1.setCategoria("Literatura");
		libro1.setSubcategoria("Poemas");
		libro1.setEditorial("Española");
		this.libroService.insertarLibroNuevo(libro1);

		Libro libro2 = new Libro();
		libro2.setId(2);
		libro2.setNombre("Iliada");
		libro2.setAutor("Homero");
		libro2.setCategoria("Literatura");
		libro2.setSubcategoria("Aventura");
		libro2.setEditorial("Greco");
		this.libroService.insertarLibroNuevo(libro2);
		
		Libro libro3 = new Libro();
		libro3.setId(3);
		libro3.setNombre("Trigonometria");
		libro3.setAutor("Jorge Lara");
		libro3.setCategoria("Educacion");
		libro3.setSubcategoria("Matematicas");
		libro3.setEditorial("Gran Colombia");
		this.libroService.insertarLibroNuevo(libro3);

		// Materia
		Materia materia1 = new Materia();
		materia1.setId(1);
		materia1.setNombre("Investigacion");
		materia1.setProfesorImparteMateria(" Pablo Perez");
		materia1.setFacultad("Quimica");
		materia1.setNumeroEstudiantes(20);
		materia1.setHoras(2);
		this.materiaService.insertarMateriaNueva(materia1);

		Materia materia2 = new Materia();
		materia2.setId(2);
		materia2.setNombre("Optimizacion");
		materia2.setProfesorImparteMateria("Fernando Saez");
		materia2.setFacultad("Ingenieria Civil");
		materia2.setNumeroEstudiantes(12);
		materia2.setHoras(4);
		this.materiaService.insertarMateriaNueva(materia2);
		
		Materia materia3 = new Materia();
		materia3.setId(3);
		materia3.setNombre("Algebra Lineal");
		materia3.setProfesorImparteMateria("Oascar Toalombo");
		materia3.setFacultad("Matematicas");
		materia3.setNumeroEstudiantes(6);
		materia3.setHoras(10);
		this.materiaService.insertarMateriaNueva(materia3);

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

		Pelicula pelicula2 = new Pelicula();
		pelicula2.setId(2);
		pelicula2.setNombre("Batman");
		pelicula2.setDirector("Steven Spielberg");
		pelicula2.setGenero("Super Heroes");
		pelicula2.setProductora("Warner Bros");
		pelicula2.setActorPrincipal("Steve Bale");
		pelicula2.setActrizPrincipal("Jessica Jones");
		this.peliculaService.insertarPeliculaNueva(pelicula2);
		
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setId(3);
		pelicula3.setNombre("Titanic");
		pelicula3.setDirector("Juan del Toro");
		pelicula3.setGenero("Fantasia");
		pelicula3.setProductora("Pixar");
		pelicula3.setActorPrincipal("Sthepen Stepson");
		pelicula3.setActrizPrincipal("Mary Jean");
		this.peliculaService.insertarPeliculaNueva(pelicula3);

		// Ropa
		Ropa ropa1 = new Ropa();
		ropa1.setId(1);
		ropa1.setNombre("Pantalon");
		ropa1.setTemporada("Verano");
		ropa1.setMarca("Bershka");
		ropa1.setTalla("XL");
		ropa1.setPrecio(15.50);
		this.ropaService.insertarRopaNuevo(ropa1);

		Ropa ropa2 = new Ropa();
		ropa2.setId(2);
		ropa2.setNombre("Camisa");
		ropa2.setTemporada("Invierno");
		ropa2.setMarca("Tommy Hilfiger");
		ropa2.setTalla("ML");
		ropa2.setPrecio(25.90);
		this.ropaService.insertarRopaNuevo(ropa2);
		

		Ropa ropa3 = new Ropa();
		ropa3.setId(3);
		ropa3.setNombre("Blusa ");
		ropa3.setTemporada("Otoño");
		ropa3.setMarca("Zara");
		ropa3.setTalla("XXL");
		ropa3.setPrecio(13.55);
		this.ropaService.insertarRopaNuevo(ropa3);

		// Universidad
		Universidad universidad1 = new Universidad();
		universidad1.setId(1);
		universidad1.setNombre("Politecnica Nacional");
		universidad1.setCiudad("Quito");
		universidad1.setNumeroCarreras(10);
		universidad1.setNumeroEstudiantes(5000);
		universidad1.setCalificacion('A');
		this.universidadService.insertarUniversidadNuevo(universidad1);

		Universidad universidad2 = new Universidad();
		universidad2.setId(2);
		universidad2.setNombre("Tecnica de Ambato");
		universidad2.setCiudad("Ambato");
		universidad2.setNumeroCarreras(5);
		universidad2.setNumeroEstudiantes(1000);
		universidad2.setCalificacion('C');
		this.universidadService.insertarUniversidadNuevo(universidad2);
	
		Universidad universidad3 = new Universidad();
		universidad3.setId(3);
		universidad3.setNombre("ESPOL");
		universidad3.setCiudad("Guayaquil");
		universidad3.setNumeroCarreras(13);
		universidad3.setNumeroEstudiantes(4500);
		universidad3.setCalificacion('A');
		this.universidadService.insertarUniversidadNuevo(universidad3);

		// Videojuego
		Videojuego videojuego1 = new Videojuego();
		videojuego1.setId(1);
		videojuego1.setNombre("FIFA 21");
		videojuego1.setDistribuidor("EA");
		videojuego1.setGenero("Depor");
		videojuego1.setModoJuego("Multi");
		videojuego1.setClasificacion("+18");
		this.videojuegoService.insertarVideojuegoNuevo(videojuego1);

		Videojuego videojuego2 = new Videojuego();
		videojuego2.setId(2);
		videojuego2.setNombre("Dota 2");
		videojuego2.setDistribuidor("Steam");
		videojuego2.setGenero("Moba");
		videojuego2.setModoJuego("Multijugador");
		videojuego2.setClasificacion("+3");
		this.videojuegoService.insertarVideojuegoNuevo(videojuego2);
		
		Videojuego videojuego3= new Videojuego();
		videojuego3.setId(3);
		videojuego3.setNombre("COD");
		videojuego3.setDistribuidor("Activision");
		videojuego3.setGenero("Guerra");
		videojuego3.setModoJuego("Multijugador");
		videojuego3.setClasificacion("+21");
		this.videojuegoService.insertarVideojuegoNuevo(videojuego3);
*/
	}

}
