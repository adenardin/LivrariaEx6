package br.edu.qi.dto;

public class Livro {
	
	private String titulo;
	private int isbn;
	private String genero;
	private Integer dataEdicao;
	private String editora;
	private String autor;
	private Float preco;
	private String status;		
		
	public Livro() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getDataEdicao() {
		return dataEdicao;
	}

	public void setDataEdicao(Integer dataEdicao) {
		this.dataEdicao = dataEdicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	} 
	
	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 	
	
}
