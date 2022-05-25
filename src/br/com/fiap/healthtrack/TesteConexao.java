package br.com.fiap.healthtrack;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	
	
	public class TesteConexao {
		
		public static void main(String[] args) {
			
			      try {
			        //Registra o Driver
			        Class.forName("oracle.jdbc.driver.OracleDriver");
			  
			        //Abre uma conexão com o banco de dados
			        Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92020", "290685");
			        
			        System.out.println("Conectado!");
			        
			        //Finaliza  a conexão
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
		

