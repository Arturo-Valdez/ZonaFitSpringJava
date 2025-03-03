package gm.zona_fit;

import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {
	//Inyeccion de dependencias
	@Autowired
	private IClienteServicio clienteServicio;
	private static final Logger logger =
			LoggerFactory.getLogger(ZonaFitApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		//Levantar la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicacion finalizada");

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("*** Aplicacion Zona Fit GYM ***");
	}
}
