package br.com.araujowp.medvoll.apimedvoll.medico;

import br.com.araujowp.medvoll.apimedvoll.endereco.DTOCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DTOCadastroMedico(
		
		@NotBlank
		String nome,//
		
		@NotBlank
		@Email
		String email,//
		
		@NotBlank
		String telefone,
		
		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String crm,//
		
		@NotNull
		Especialidade especialidade,//
		
		@NotNull
		@Valid
		DTOCadastroEndereco endereco) {

}
