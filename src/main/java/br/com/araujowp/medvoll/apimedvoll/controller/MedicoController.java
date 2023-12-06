package br.com.araujowp.medvoll.apimedvoll.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.araujowp.medvoll.apimedvoll.medico.DTOCadastroMedico;

@RestController
@RequestMapping("medicos")
public class MedicoController {

	@PostMapping
	public void cadastrar(@RequestBody DTOCadastroMedico dto) {
		System.out.println(dto);
	}
	
}
