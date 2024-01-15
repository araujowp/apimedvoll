package br.com.araujowp.medvoll.apimedvoll.medico;

public record DtoListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {

	public DtoListagemMedico(Medico medico) {
		this(medico.getId(),  medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
	}
}
