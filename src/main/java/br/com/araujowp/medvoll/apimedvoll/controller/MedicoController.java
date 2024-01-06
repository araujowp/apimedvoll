package br.com.araujowp.medvoll.apimedvoll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.araujowp.medvoll.apimedvoll.medico.DTOCadastroMedico;
import br.com.araujowp.medvoll.apimedvoll.medico.DtoListagemMedico;
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

	@GetMapping
//	spring.data.web.pageable.page-parameter=pagina nome dos parametros podem ser mudados no aplication.properties
//	public Page<DtoListagemMedico> listar(@PageableDefault(size=10) Pageable paginacao){
	public Page<DtoListagemMedico> listar(Pageable paginacao) {
		return medicoRepository.findAll(paginacao).map(DtoListagemMedico::new);
	}

}
