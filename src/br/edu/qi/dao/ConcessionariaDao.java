package br.edu.qi.dao;

import java.util.ArrayList;

import br.edu.qi.dto.Livro;

public class LivrariaDao extends GenericDao implements IDao<Livro> {

	ArrayList<Livro> livros = new ArrayList<Livro>();

//	private static final String INSERT = ""
//			+ "INSERT INTO livro(titulo, isbn, genero, dataEdicao, editora, autor) values (?,?,?,?,?,?)";
//	private static final String SELECT = "" + "select n1,n2,exame from nota" + " where codDisciplina = ? and "
//			+ " ra = ? and ano_semestre = ?";
//	
//	private static final String VENDER = "" + "update livro set status=\"indisponivel\" where isbn = ?";
//	
//	private static final String CONSULTAR = "" + "select * from livro ";

	@Override
	public boolean gravar(Livro obj) throws Exception {
//		return super.executeNoQuery(INSERT, obj.getTitulo(), obj.getIsbn(), obj.getGenero(), obj.getDataEdicao(),
//				obj.getEditora(), obj.getAutor());
		return livros.add(obj);

	}

	@Override
	public boolean vender(int isbn) throws Exception {
//		return super.executeNoQuery(VENDER, isbn);
		for (Livro livro : livros) {
			if(livro.getIsbn() == isbn) {
				livro.setStatus("vendido");
				return true;
			}
		}
		return false;

	}

	@Override
	public Livro consultar(Livro obj, String autor) throws Exception {
//		
//		String where = CONSULTAR;
//		
//		if(!autor.isEmpty())
//			where += "where autor=\""+autor+"\"";
//		
//		ResultSet rs = super.executeQuery(where);
//		obj = new Livro();
//		while(rs.next()) {
//			obj.setPreco(rs.getFloat("preco"));
//			obj.setStatus(rs.getString("status"));
//		}
//	
//		return obj;

	}

//	public int delete(Livro obj) throws Exception {
//		return 0;
//	}
//
//	public Livro find(Livro obj) throws Exception {
//		ResultSet rs = super.executeQuery(SELECT, obj.getCodDisciplina(), obj.getRa(), obj.getAnoSem());
//		if (!rs.next())
//			return null;
//		Livro nota = new Livro();
//		nota.setN1(rs.getFloat("n1"));
//		nota.setN2(rs.getFloat("n2"));
//		nota.setExame(rs.getFloat("exame"));
//		return nota;
//	}
//
//	public ArrayList<Nota> findAll() throws Exception {
//		return null;
//	}

//	@Override
//	public int delete(Livro obj) throws Exception {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public Livro find(Livro obj) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ArrayList<Livro> findAll() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
