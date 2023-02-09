package br.com.totvs.start.tech.escola;

import br.com.totvs.start.tech.escola.entity.Escola;
import br.com.totvs.start.tech.escola.entity.Professor;
import br.com.totvs.start.tech.escola.service.EscolaServiceImpl;
import br.com.totvs.start.tech.escola.service.ProfessorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		List<Professor> listProfessor = new ArrayList<Professor>();
		List<Escola> listEscola = new ArrayList<Escola>();

		SpringApplication.run(Application.class, args);

		EscolaServiceImpl escolaService = new EscolaServiceImpl();
		ProfessorServiceImpl professorService = new ProfessorServiceImpl();

	}

}
