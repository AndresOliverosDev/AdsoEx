package Academy.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@GetMapping("/hello")
    public String saludo(@RequestParam(value = "name", defaultValue = "Andres") String name) {
      return String.format("Hola %s!", name);
    }

	@PostMapping("/goodBay")
    public String despedida(@RequestParam(value = "name", defaultValue = "Andres") String name) {
      return String.format("Adios %s!", name);
    }
}
