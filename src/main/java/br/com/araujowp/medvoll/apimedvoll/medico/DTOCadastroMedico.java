package br.com.araujowp.medvoll.apimedvoll.medico;

import br.com.araujowp.medvoll.apimedvoll.endereco.DTOCadastroEndereco;

public record DTOCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DTOCadastroEndereco endereco) {

}
