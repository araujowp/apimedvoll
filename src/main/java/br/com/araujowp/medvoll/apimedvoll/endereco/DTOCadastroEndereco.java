package br.com.araujowp.medvoll.apimedvoll.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DTOCadastroEndereco(
		
		@NotBlank
		String logradouro,//
		
		@NotBlank
		String bairro, //
		
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String cep, //
		
		String cidade,//
		
		@NotBlank
		String uf,//
		
		String complemento,// 
		String numero) {

}
