package bank.stb.demolab.flightspecial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightspecialController {

	@Autowired
	FlightspecialRepository repository;

	@GetMapping("/flightspecial")
	List<Flightspecial> all() {
		return repository.findAll();
		
	}
}
