package danko.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TinnovaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinnovaApplication.class, args);
        System.out.println("Servidor online!");
	}

}
