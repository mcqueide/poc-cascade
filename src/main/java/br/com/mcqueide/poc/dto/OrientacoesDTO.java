package br.com.mcqueide.poc.dto;

public class OrientacoesDTO {
	
	private Integer cod;
	
	private String nome;
	
	public OrientacoesDTO() {
	}
	
	public OrientacoesDTO(String nome) {
		this.nome = nome;
	}

	public OrientacoesDTO(Integer cod, String nome) {
		this.cod = cod;
		this.nome = nome;
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

}
