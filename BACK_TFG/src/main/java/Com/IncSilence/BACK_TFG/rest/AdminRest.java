package Com.IncSilence.BACK_TFG.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Com.IncSilence.BACK_TFG.DAO.CitaDao;
import Com.IncSilence.BACK_TFG.DAO.ClienteDao;
import Com.IncSilence.BACK_TFG.DAO.PinturaDao;
import Com.IncSilence.BACK_TFG.DAO.RodapieDao;
import Com.IncSilence.BACK_TFG.DAO.SueloDao;
import Com.IncSilence.BACK_TFG.DAO.TrabajadorDao;
import Com.IncSilence.BACK_TFG.entity.Cita;
import Com.IncSilence.BACK_TFG.entity.Cliente;
import Com.IncSilence.BACK_TFG.entity.Pintura;
import Com.IncSilence.BACK_TFG.entity.Rodapies;
import Com.IncSilence.BACK_TFG.entity.Suelo;
import Com.IncSilence.BACK_TFG.entity.Trabajador;

@RestController

@RequestMapping("/api")
public class AdminRest {

    @Autowired
    private ClienteDao clienteDao;
	@Autowired
    private CitaDao citaDao;
	@Autowired
    private PinturaDao pinturaDao;
	@Autowired 
    private RodapieDao rodapieDao;
	@Autowired
    private SueloDao sueloDao;
	@Autowired
    private TrabajadorDao trabajadorDao;




//-----------------------------------------------------------------------------------------------------------------------------
    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "clientes", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> getCliente() {
		List<Cliente> clientes = clienteDao.findAll();
        return ResponseEntity.ok(clientes);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "trabajadores", method = RequestMethod.GET)
	public ResponseEntity<List<Trabajador>> getTrabajador() {
		List<Trabajador> trabajadores = trabajadorDao.findAll();
		return ResponseEntity.ok(trabajadores);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "citas", method = RequestMethod.GET)
	public ResponseEntity<List<Cita>> getCita() {
		List<Cita> citas = citaDao.findAll();
		return ResponseEntity.ok(citas);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "suelos", method = RequestMethod.GET)
	public ResponseEntity<List<Suelo>> getSuelo() {
		List<Suelo> suelos = sueloDao.findAll();
		return ResponseEntity.ok(suelos);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "rodapies", method = RequestMethod.GET)
	public ResponseEntity<List<Rodapies>> getRodapie() {
		List<Rodapies> rodapies = rodapieDao.findAll();
		return ResponseEntity.ok(rodapies);
	}
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "pinturas", method = RequestMethod.GET)
	public ResponseEntity<List<Pintura>> getPintura() {
		List<Pintura> pinturas = pinturaDao.findAll();
		return ResponseEntity.ok(pinturas);
	}


//------------------------------------------------------------------------------------
  @PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "create/clientes", method = RequestMethod.POST)
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
		Cliente newCliente = clienteDao.save(cliente);
		return ResponseEntity.ok(newCliente);
	}
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "create/citas", method = RequestMethod.POST)
	public ResponseEntity<Cita> createCita(@RequestBody Cita cita) {
		Cita newCita = citaDao.save(cita);
		return ResponseEntity.ok(newCita);
	}
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "create/trabajadores", method = RequestMethod.POST)
	public ResponseEntity<Trabajador> createTrabajador(@RequestBody Trabajador trabajador) {
		Trabajador newTrabajador = trabajadorDao.save(trabajador);
		return ResponseEntity.ok(newTrabajador);
	}
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "create/suelos", method = RequestMethod.POST)
	public ResponseEntity<Suelo> createSuelo(@RequestBody Suelo suelo) {
		Suelo newSuelo = sueloDao.save(suelo);
		return ResponseEntity.ok(newSuelo);
	}
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "create/pinturas", method = RequestMethod.POST)
	public ResponseEntity<Pintura> createPintura(@RequestBody Pintura pintura) {
		Pintura newPintura = pinturaDao.save(pintura);
		return ResponseEntity.ok(newPintura);
	}
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "create/rodapies", method = RequestMethod.POST)
	public ResponseEntity<Rodapies> createRodapie(@RequestBody Rodapies rodapies) {
		Rodapies newRodapies = rodapieDao.save(rodapies);
		return ResponseEntity.ok(newRodapies);
	}

	//-------------------------------------------

	@DeleteMapping(value = "/DELclientes/{id_cliente}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Void> DeleteCliente(@PathVariable("id_cliente") Long id_cliente) {
		clienteDao.deleteById(id_cliente);
		return ResponseEntity.ok(null);
	}
	@DeleteMapping(value = "/DELrodapies/{id_cliente}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Void> DeleteRodapie(@PathVariable("id_rodapie") Long id_rodapie) {
		rodapieDao.deleteById(id_rodapie);
		return ResponseEntity.ok(null);
	}
	@DeleteMapping(value = "/DELsuelos/{id_suelo}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Void> DeleteSuelo(@PathVariable("id_suelo") Long id_suelo) {
		sueloDao.deleteById(id_suelo);
		return ResponseEntity.ok(null);
	}
	@DeleteMapping(value = "/DELpinturas/{id_cliente}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Void> DeletePintura(@PathVariable("id") Long id) {
		pinturaDao.deleteById(id);
		return ResponseEntity.ok(null);
	}

//-------------------------------------------------------------

	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "update/clientes", method = RequestMethod.PUT)
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
		Optional<Cliente> optionalCliente = clienteDao.findById(cliente.getId());
		if (optionalCliente.isPresent()) {
			Cliente updateCliente = optionalCliente.get();
			System.out.println(cliente.getNombre());
			updateCliente.setId(cliente.getId());
			updateCliente.setNombre(cliente.getNombre());
			updateCliente.setApellidos(cliente.getApellidos());
			updateCliente.setDni_cif(cliente.getDni_cif());
			updateCliente.setDireccion(cliente.getDireccion());
			updateCliente.setSegundireccion(cliente.getSegundireccion());
			updateCliente.setTelefono(cliente.getTelefono());
			updateCliente.setEmail(cliente.getEmail());
			clienteDao.save(updateCliente);
			System.out.println(updateCliente.getApellidos());
			return ResponseEntity.ok(updateCliente);
		} else {
			System.out.println("error al editar");
			return ResponseEntity.notFound().build();
		
		}
	}
	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "update/trabajadores", method = RequestMethod.PUT)
	public ResponseEntity<Trabajador> updateCliente(@RequestBody Trabajador trabajador) {
		Optional<Trabajador> optionalTrabajador = trabajadorDao.findById(trabajador.getId());
		if (optionalTrabajador.isPresent()) {
			Trabajador updateTrabajador = optionalTrabajador.get();
			
			updateTrabajador.setId(trabajador.getId());
			updateTrabajador.setNombre(trabajador.getNombre());
			updateTrabajador.setApellidos(trabajador.getApellidos());
			updateTrabajador.setDni(trabajador.getDni());
			updateTrabajador.setEstado(trabajador.getEstado());
			updateTrabajador.setPuesto(trabajador.getPuesto());
			updateTrabajador.setTelefono(trabajador.getTelefono());
			updateTrabajador.setEmail(trabajador.getEmail());
			trabajadorDao.save(updateTrabajador);
			return ResponseEntity.ok(updateTrabajador);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@PutMapping
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "update/suelos", method = RequestMethod.PUT)
	public ResponseEntity<Suelo> updatesuelo(@RequestBody Suelo suelo) {
		System.out.println("pintando suelos");
		Optional<Suelo> optionalSuelo = sueloDao.findById(suelo.getId());
		System.out.println("pintando suelos 2");
		if (optionalSuelo.isPresent()) {
			Suelo updateSuelo = optionalSuelo.get();
			System.out.println("pintando suelos 3");
			updateSuelo.setId(suelo.getId());
			updateSuelo.setColor(suelo.getColor());
			updateSuelo.setAcabado(suelo.getAcabado());
			updateSuelo.setCompatibilidad_rad(suelo.getCompatibilidad_rad());
			updateSuelo.setTipo(suelo.getTipo());
			updateSuelo.setMaterial(suelo.getMaterial());
			updateSuelo.setInstalacion(suelo.getInstalacion());
			updateSuelo.setImg(suelo.getImg());
			updateSuelo.setPrecio(suelo.getPrecio());
			sueloDao.save(updateSuelo);
			return ResponseEntity.ok(updateSuelo);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

//------------------------
@RequestMapping(value = { "/clientes/{id_cliente}" }) // products/{productId} -> products/1
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("id_cliente") Long id_cliente) {
		Optional<Cliente> optionaCliente = clienteDao.findById(id_cliente);
		if (optionaCliente.isPresent()) {
			return ResponseEntity.ok(optionaCliente.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@RequestMapping(value = { "/suelos/{id_suelo}" }) // products/{productId} -> products/1
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Suelo> getSueloById(@PathVariable("id_suelo") Long id_suelo) {
		Optional<Suelo> optionaSuelo= sueloDao.findById(id_suelo);
		if (optionaSuelo.isPresent()) {
			return ResponseEntity.ok(optionaSuelo.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}

	@RequestMapping(value = { "/trabajadores/{id_trabajador}" }) // products/{productId} -> products/1
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Trabajador> getTrabajadorById(@PathVariable("id_trabajador") Long id_trabajador) {
		Optional<Trabajador> optionaTrabajador= trabajadorDao.findById(id_trabajador);
		if (optionaTrabajador.isPresent()) {
			return ResponseEntity.ok(optionaTrabajador.get());
		} else {
			return ResponseEntity.noContent().build();
		}
	}
}