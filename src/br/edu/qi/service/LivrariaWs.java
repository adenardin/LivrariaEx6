package br.edu.qi.service;

import javax.jws.WebService;

import br.edu.qi.dao.LivrariaDao;
import br.edu.qi.dto.Livro;

@WebService(endpointInterface = "br.edu.qi.service.ILivrariaDao")
public class LivrariaWs implements ILivrariaDao {
		
	public LivrariaWs() {};

	@Override
	public boolean gravar(Livro livro) {

		LivrariaDao dao = new LivrariaDao();
		try {					

			return dao.gravar(livro);

		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean vender(int isbn) {

		LivrariaDao dao = new LivrariaDao();
		try {					

			return dao.vender(isbn);

		} catch (Exception e) {
			return false;
		}
	}	
	
	@Override
	public Livro consultar(Livro livro, String autor) {

		LivrariaDao dao = new LivrariaDao();
		try {					

			return dao.consultar(livro, autor);

		} catch (Exception e) {
			return null;
		}
	}

}
