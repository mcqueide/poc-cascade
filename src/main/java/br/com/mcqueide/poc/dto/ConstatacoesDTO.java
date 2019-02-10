package br.com.mcqueide.poc.dto;

import java.util.List;

public class ConstatacoesDTO {

	private Integer cod;
	
	private String nome;
	
	private List<OrientacoesDTO> orientacoes;
	
	public ConstatacoesDTO() {
	}
	
	public ConstatacoesDTO(String nome, List<OrientacoesDTO> orientacoes) {
		this.nome = nome;
		this.orientacoes = orientacoes;
	}

	public ConstatacoesDTO(Integer cod, String nome, List<OrientacoesDTO> orientacoes) {
		this.cod = cod;
		this.nome = nome;
		this.orientacoes = orientacoes;
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

	public List<OrientacoesDTO> getOrientacoes() {
		return orientacoes;
	}

	public void setOrientacoes(List<OrientacoesDTO> orientacoes) {
		this.orientacoes = orientacoes;
	}
	
}
