package practice.newSpringFramwwork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import practice.newSpringFramwwork.main.Main;
import practice.newSpringFramwwork.main.Test;

@SpringBootApplication
public class NewSpringFramwworkApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(NewSpringFramwworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Main main = new Main();
		main.showsTheMenu();

       //creamos la instancia t dentro de esa instancia llamamos al metodo getTest.
		//Test test = new Test();
		//test.getTest();


	}
}
