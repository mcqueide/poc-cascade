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
@Table
public class Constatacoes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COD")
	private Integer cod;
	
	@Column(name="NOME")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="COD_PERGUNTA", referencedColumnName="COD")
	private Pergunta pergunta;
	
	@OneToMany(mappedBy="constatacoes", cascade=CascadeType.ALL)
	private List<Orientacoes> orientacoes;

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

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public List<Orientacoes> getOrientacoes() {
		return orientacoes;
	}

	public void setOrientacoes(List<Orientacoes> orientacoes) {
		this.orientacoes = orientacoes;
	}
	
}
