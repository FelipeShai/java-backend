package br.com.fiap.tdson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tdson.model.TransacaoFinanceiroModel;

public class TransacaoFinanceiroDAO {
	
	public static List<TransacaoFinanceiroModel> getAll() {
		
		List<TransacaoFinanceiroModel> listaTransacao = new ArrayList<TransacaoFinanceiroModel>();
		Connection conn = null;
		
		try {
	    	
		      //Registra o Driver
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      //Abre uma conexão
		      Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96045", "031201");      
		      Statement stmt = conexao.createStatement();
		      
		      ResultSet result = stmt.executeQuery("SELECT * FROM T_FIN_TRANSACAO");
		      
		      while(result.next()) {
		    	  TransacaoFinanceiroModel transacaoFinanceiro = new TransacaoFinanceiroModel();
		    	  transacaoFinanceiro.setId_transacao(result.getInt("ID_TRANSACAO"));
		    	  transacaoFinanceiro.setId_usuario(result.getInt("ID_USUARIO"));
		    	  transacaoFinanceiro.setDs_descricao(result.getString("DS_DESCRICAO"));
		    	  transacaoFinanceiro.setDt_transacao(result.getDate("DT_TRANSACAO"));
		    	  transacaoFinanceiro.setCt_categoria(result.getString("CT_CATEGORIA"));
		    	  transacaoFinanceiro.setVl_valor(result.getFloat("VL_VALOR"));
		    	  listaTransacao.add(transacaoFinanceiro);
		      }
		      
		      //Fecha a conexão
		      conexao.close();
		      
		    //Tratamento de erro  
		    } catch (SQLException e) {
		      System.err.println("Não foi possível conectar no Banco de Dados");
		      e.printStackTrace();
		    } catch (ClassNotFoundException e) {
		      System.err.println("O Driver JDBC não foi encontrado!");
		      e.printStackTrace();
		    }
		System.out.println(listaTransacao);
		
		return listaTransacao;
}
	public static TransacaoFinanceiroModel insertTransacao(TransacaoFinanceiroModel transacaoFinanceiro) throws SQLException {
		String SQL1 = "INSERT INTO T_FIN_TRANSACAO(ID_TRANSACAO, ID_USUARIO, DS_DESCRICAO, DT_TRANSACAO, CT_CATEGORIA, VL_VALOR)" + 
	" VALUES (SQ_TRANSACAO.NEXTVAL, ?, ?, ?, ?, ?)";
	
			
			Connection conexao = null;
			
			try {
				//Registra o Driver
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      //Abre uma conexão
			      conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96045", "031201");      
			      PreparedStatement ptmt = conexao.prepareStatement(SQL1);

				ptmt.setInt(1, transacaoFinanceiro.getId_usuario());
				ptmt.setString(2, transacaoFinanceiro.getDs_descricao());
				ptmt.setDate(3, transacaoFinanceiro.getDt_transacao());
				ptmt.setString(4, transacaoFinanceiro.getCt_categoria());
				ptmt.setFloat(5, transacaoFinanceiro.getVl_valor());
				
				
				ptmt.execute();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conexao = null;
			}
			
			return(transacaoFinanceiro);
			
		
	}
}
