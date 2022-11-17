package Fintech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FintechDAO {
	
	public static void main(String[] args) {
	    try {
	    	
	      //Registra o Driver
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      //Abre uma conexão
	      Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96045", "031201");      
	      Statement stmt = conexao.createStatement();
	      
	      ResultSet result = stmt.executeQuery("SELECT * FROM T_FIN_USUARIO");
	      
	      while (result.next()) {
	    	  System.out.println(result.getInt("ID_USUARIO") + " " + result.getString("NM_NOME") + " " + result.getString("EM_EMAIL") + " " 
	+ result.getString("SN_SENHA") + " " + result.getString("NR_CELULAR") + " " + result.getString("SX_SEXO") + " " + result.getString("NC_NACIONALIDADE"));
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
	  }
	}
