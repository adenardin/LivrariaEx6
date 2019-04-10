package br.edu.qi.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.edu.qi.dto.Livro;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ILivrariaDao {
	@WebMethod
	public boolean gravar(Livro livro);

	@WebMethod
	public boolean vender(int isbn);

	@WebMethod
	public Livro consultar(Livro livroint, String autor);
}
