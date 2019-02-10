package br.com.mcqueide.poc.dto;

import java.util.List;

import javax.persistence.OneToMany;

public class PerguntaDTO {

	private Integer cod;
	
	private String nome;

	@OneToMany(mappedBy="pergunta")
	private List<ConstatacoesDTO> constatacoes;
	
	public PerguntaDTO() {
	}
	
	public PerguntaDTO(String nome, List<ConstatacoesDTO> constatacoes) {
		this.nome = nome;
		this.constatacoes = constatacoes;
	}

	public PerguntaDTO(Integer cod, String nome, List<ConstatacoesDTO> constatacoes) {
		this.cod = cod;
		this.nome = nome;
		this.constatacoes = constatacoes;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ConstatacoesDTO> getConstatacoes() {
		return constatacoes;
	}

	public void setConstatacoes(List<ConstatacoesDTO> constatacoes) {
		this.constatacoes = constatacoes;
	}

}
