package br.com.araujowp.medvoll.apimedvoll.medico;

import br.com.araujowp.medvoll.apimedvoll.endereco.DTOCadastroEndereco;
import jakarta.validation.constraints.NotNull;

public record DTOAtualizacaoMedico(@NotNull
        Long id,
        String nome,
        String telefone,
        DTOCadastroEndereco endereco) {
	}
