package br.edu.qi.dao;

import java.util.ArrayList;

import br.edu.qi.dto.Livro;

public interface IDao<T> {

	public boolean gravar(T obj) throws Exception;
	public boolean vender(int isbn) throws Exception;
	public Livro consultar(Livro livro, String autor) throws Exception;
//	public int delete(T obj) throws Exception;
//	public T find(T obj) throws Exception;
//	public ArrayList<T> findAll() throws Exception;
}
