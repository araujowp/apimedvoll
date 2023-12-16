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
	
}
