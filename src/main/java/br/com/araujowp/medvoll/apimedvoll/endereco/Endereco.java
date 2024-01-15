package br.com.araujowp.medvoll.apimedvoll.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	public Endereco(DTOCadastroEndereco dtoCadastroEndereco) {
        this.logradouro = dtoCadastroEndereco.logradouro();
        this.bairro = dtoCadastroEndereco.bairro();
        this.cep = dtoCadastroEndereco.cep();
        this.uf = dtoCadastroEndereco.uf();
        this.cidade = dtoCadastroEndereco.cidade();
        this.numero = dtoCadastroEndereco.numero();
        this.complemento = dtoCadastroEndereco.complemento();
	}
	
	private String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String uf;
	public void atualizarInformacoes(DTOCadastroEndereco endereco) {
        if (endereco.logradouro() != null) {
            this.logradouro = endereco.logradouro();
        }
        if (endereco.bairro() != null) {
            this.bairro = endereco.bairro();
        }
        if (endereco.cep() != null) {
            this.cep = endereco.cep();
        }
        if (endereco.uf() != null) {
            this.uf = endereco.uf();
        }
        if (endereco.cidade() != null) {
            this.cidade = endereco.cidade();
        }
        if (endereco.numero() != null) {
            this.numero = endereco.numero();
        }
        if (endereco.complemento() != null) {
            this.complemento = endereco.complemento();
        }
		
	}
	
}
