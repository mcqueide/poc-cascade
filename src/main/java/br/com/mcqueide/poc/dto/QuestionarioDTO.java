package br.com.mcqueide.poc.dto;

import java.util.List;

import javax.persistence.OneToMany;

public class QuestionarioDTO {

	public Integer cod;
	
	public String nome;
	
	@OneToMany(mappedBy="questionario")
	private List<PerguntaDTO> perguntas;
	
	public QuestionarioDTO() {
	}
	
	public QuestionarioDTO(String nome, List<PerguntaDTO> perguntas) {
		this.nome = nome;
		this.perguntas = perguntas;
	}

	public QuestionarioDTO(Integer cod, String nome, List<PerguntaDTO> perguntas) {
		this.cod = cod;
		this.nome = nome;
		this.perguntas = perguntas;
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

	public List<PerguntaDTO> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<PerguntaDTO> perguntas) {
		this.perguntas = perguntas;
	}
	
}
