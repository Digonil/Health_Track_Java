package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class HealthTrackDB {
	
	
	public static Connection obterConexao() {
		
		Connection conexao = null;
	
	try {
        //Registra o Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
  
        //Abre uma conexão com o banco de dados
        conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92020", "290685");
        
        System.out.println("Conectado!");
        
        //Finaliza  a conexão
        conexao.close();
        
      //Tratamento de erro  
      } catch (Exception e) {
    	  e.printStackTrace();
      }
	return conexao;

}
}
