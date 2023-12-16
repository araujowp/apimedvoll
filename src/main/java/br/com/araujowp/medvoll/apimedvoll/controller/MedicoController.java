package br.com.araujowp.medvoll.apimedvoll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.araujowp.medvoll.apimedvoll.medico.DTOCadastroMedico;
import br.com.araujowp.medvoll.apimedvoll.medico.Medico;
import br.com.araujowp.medvoll.apimedvoll.medico.MedicoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("medicos")
public class MedicoController {

	@Autowired
	private MedicoRepository medicoRepository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DTOCadastroMedico dto) {
		
		medicoRepository.save(new Medico(dto));
		System.out.println(dto);
	}
	
}
