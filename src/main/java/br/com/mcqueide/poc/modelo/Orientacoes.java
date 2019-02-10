package br.com.mcqueide.poc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORIENTACOES")
public class Orientacoes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COD")
	private Integer cod;
	
	@Column(name="NOME")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="COD_CONSTATACOES", referencedColumnName="COD")
	private Constatacoes constatacoes;

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

	public Constatacoes getConstatacoes() {
		return constatacoes;
	}

	public void setConstatacoes(Constatacoes constatacoes) {
		this.constatacoes = constatacoes;
	}
	
}
