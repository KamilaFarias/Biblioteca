package br.edu.ifpb.biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Volume.getAll", query = "from Volume")
public class Volume {
	
	@Id
	private String titulo;
	
	private String autores;
	private String descricao;
	private String tipoVolume;
	private Integer numPaginas;
	private String anoPublicacao;
	private String editora;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutores() {
		return autores;
	}
	
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTipoVolume() {
		return tipoVolume;
	}
	
	public void setTipoVolume(String tipoVolume) {
		this.tipoVolume = tipoVolume;
	}
	
	public Integer getNumPaginas() {
		return numPaginas;
	}
	
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
