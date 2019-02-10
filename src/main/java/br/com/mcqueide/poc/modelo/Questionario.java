package br.com.mcqueide.poc.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="questionario")
public class Questionario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod")
	public Integer cod;
	
	@Column(name="nome")
	public String nome;
	
	@OneToMany(mappedBy="questionario", cascade=CascadeType.ALL)
	private List<Pergunta> perguntas;

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

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}
	
}
