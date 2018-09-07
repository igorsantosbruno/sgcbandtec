package br.com.sgc.simulacao.model;

import java.io.Serializable;

public class EventoSimulacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String titulo;
	private String descricao;
	
	public EventoSimulacao() {
		
		
	}

	public EventoSimulacao(long id, String titulo, String descricao) {
		
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public long getId() {
		
		return id;
	}

	public void setId(long id) {
		
		this.id = id;
	}

	public String getTitulo() {
		
		return titulo;
	}

	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}

	public String getDescricao() {
		
		return descricao;
	}

	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}
}
