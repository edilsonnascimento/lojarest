package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	
	private Long id;
	private String nome;
	private Integer anoDeInicio;
	
	
	public Projeto() {}
	
	public Projeto(Long id, String nome, Integer anoDeInicio) {
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAnoDeInicio() {
		return anoDeInicio;
	}
	public void setAnoDeInicio(Integer anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	public String toXML() {
		return new XStream().toXML(this);
	}

	
}
