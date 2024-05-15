package com.residencia.biblioteca.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

//@JsonIdentityInfo (
//		generator = ObjectIdGenerators.PropertyGenerator.class,
//		property = "codigoLivro"
//	)
@Entity
@Table(name = "livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigolivro")
	private Long codigoLivro;
	
	@Column(name = "nomelivro")
	@NotNull
	private String nomeLivro;
	
	@Column(name = "nomeAutor")
	@NotNull
	private String nomeAutor;
	
	@Column(name = "dataPublicacao")
	@NotNull
	private String dataPublicacao;
	
	@Column(name = "nomeEditora")
	@NotNull
	private String nomeEditora;

	public Long getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(Long codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}	
}
