package br.com.fiap.tdson.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tdson.model.ObjetivoFinanceiroModel;

public class ObjetivoFinanceiroDAO {
	
	public static List<ObjetivoFinanceiroModel> getAll() {
		
		List<ObjetivoFinanceiroModel> listaObjetivoFin = new ArrayList<ObjetivoFinanceiroModel>();
		Connection conn = null;
		
		try {
	    	
		      //Registra o Driver
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      //Abre uma conexão
		      Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96045", "031201");      
		      Statement stmt = conexao.createStatement();
		      
		      ResultSet result = stmt.executeQuery("SELECT * FROM T_FIN_OBJETIVO_FINANCEIRO");
		      
		      while(result.next()) {
		    	  ObjetivoFinanceiroModel objetivoFinanceiro = new ObjetivoFinanceiroModel();
		    	  objetivoFinanceiro.setDs_descricao_obj_fin(result.getString("DS_DESCRICAO_OBJ_FIN"));
		    	  objetivoFinanceiro.setId_objetivo(result.getInt("ID_OBJETIVO"));
		    	  objetivoFinanceiro.setId_usuario(result.getInt("ID_USUARIO"));
		    	  listaObjetivoFin.add(objetivoFinanceiro);
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
		System.out.println(listaObjetivoFin);
		
		return listaObjetivoFin;
}
	public static ObjetivoFinanceiroModel insertObjetivo(ObjetivoFinanceiroModel objetivoFinanceiro) throws SQLException {
		String SQL1 = "INSERT INTO T_FIN_OBJETIVO_FINANCEIRO(ID_OBJETIVO, DS_DESCRICAO_OBJ_FIN, ID_USUARIO)" + 
	" VALUES (SQ_OBJETIVO.NEXTVAL, ?, ?)";
			
			Connection conexao = null;
			
			try {
				//Registra o Driver
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      //Abre uma conexão
			      conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96045", "031201");      
			      PreparedStatement ptmt = conexao.prepareStatement(SQL1);

				ptmt.setString(1, objetivoFinanceiro.getDs_descricao_obj_fin());
				ptmt.setInt(2, objetivoFinanceiro.getId_usuario());
				
				ptmt.execute();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				conexao = null;
			}
			
			return(objetivoFinanceiro);
			
		
	}
}
