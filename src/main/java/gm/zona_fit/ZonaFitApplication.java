package gm.zona_fit;

import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {
	//Inyeccion de dependencias
	@Autowired
	private IClienteServicio clienteServicio;

	//Salto de linea
	String nl = System.lineSeparator();

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
		zonaFitApp();
	}

	private void zonaFitApp(){
		var salir = false;
		Scanner consola = new Scanner(System.in);
		while (!salir){
			var operacion = mostrarMenu(consola);
			//salir = ejecutarOperaciones(consola, operacion);
			logger.info(nl);
		}

	}

	private int mostrarMenu(Scanner consola) {
		logger.info("""
				\n*** Aplicacion Zona Fit GYM ***
				1. Listar Clientes
				2. Buscar Cliente
				3. Agregar Cliente
				4. Modificar Cliente
				5. Eliminar Cliente
				6. Salir
				Elige una operacion:\s""");
		var operacion = Integer.parseInt(consola.nextLine());
		return operacion;
	}
}
