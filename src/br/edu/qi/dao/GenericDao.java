package br.edu.qi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class GenericDao {

	private PreparedStatement preparedSql(String sql, Object... parameters) throws Exception {
		PreparedStatement pstm = null;
		pstm = ConnectionManager.getInstance().getConnection().prepareStatement(sql);

		if (parameters != null)
			for (int i = 0; i < parameters.length; i++) {
				pstm.setObject(i + 1, parameters[i]);
			}
		return pstm;
	}

	protected boolean execute(String sql, Object... parameters) throws Exception {
		PreparedStatement pstm = null;
		pstm = preparedSql(sql, parameters);

		return pstm.execute();		
	}	
	
	protected ResultSet executeQuery(String sql, Object... parameters) throws Exception {
		PreparedStatement pstm = null;
		pstm = preparedSql(sql, parameters);

		return pstm.executeQuery();
	}

	protected boolean executeNoQuery(String sql, Object... parameters) throws Exception {
		PreparedStatement pstm = null;
		try {
			pstm = preparedSql(sql, parameters);
			int count = pstm.executeUpdate();
			return (count > 0);

		} catch (Exception e) {
			throw e;
		} finally {
			if (pstm != null)
				pstm.close();
			ConnectionManager.getInstance().close();
		}
	}
}
