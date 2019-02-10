package br.com.mcqueide.poc.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pergunta")
public class Pergunta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod")
	private Integer cod;
	
	@Column(name="nome")
	private String nome;

	@OneToMany(mappedBy="pergunta", cascade=CascadeType.ALL)
	private List<Constatacoes> constatacoes;
	
	@ManyToOne
	@JoinColumn(name="COD_QUESTIONARIO", referencedColumnName="COD")
	private Questionario questionario;
	
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

	public List<Constatacoes> getConstatacoes() {
		return constatacoes;
	}

	public void setConstatacoes(List<Constatacoes> constatacoes) {
		this.constatacoes = constatacoes;
	}

	public Questionario getQuestionario() {
		return questionario;
	}

	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}
	
}
