package com.moya;

import com.moya.Controller.JugadorController;
import com.moya.Service.EquipoService;
import com.moya.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EquipoJugadorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EquipoJugadorApplication.class, args);
		JugadorService jugadorService = context.getBean(JugadorService.class);
		EquipoService equipoService = context.getBean(EquipoService.class);

		equipoService.registrarEquipos();
		jugadorService.registrarJugadores();

		jugadorService.consultas();
		equipoService.consultas();
	}
}