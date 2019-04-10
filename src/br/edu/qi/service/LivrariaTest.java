package br.edu.qi.service;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import br.edu.qi.dto.Livro;

public class LivrariaTest {

	public static void main(String[] args) {
		try {

			Livro livro = new Livro();

			livro.setTitulo("A volta");
			livro.setIsbn(1);
			livro.setGenero("Teste");
			livro.setDataEdicao(201901);
			livro.setEditora("Casa do Código");
			livro.setAutor("Anderson Denardin");
//			
			
//			StringWriter sw = new StringWriter();
//			JAXB.marshal(livro, sw);
//			String xmlString = sw.toString();		
//			
			LivrariaWs livrariaWs = new LivrariaWs();
			boolean ret = livrariaWs.gravar(livro);

//			LivrariaWs livrariaWs = new LivrariaWs();
//			boolean ret = livrariaWs.vender(1);			

//			LivrariaWs livrariaWs = new LivrariaWs();
//			Livro ret = livrariaWs.consultar(livro, "Anderson Denardin");

//			System.out.println("Retorno é status=" + ret.getStatus() + " preço=" + String.valueOf(ret.getPreco()));
		} catch (Exception e) {
		}
	}

}
