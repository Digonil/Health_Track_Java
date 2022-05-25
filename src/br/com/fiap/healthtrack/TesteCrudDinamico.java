package br.com.fiap.healthtrack;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
		
	
	public class TesteCrudDinamico {
		
		public static void main(String[] args) {
			
			      try {
			    	  
			        //Registra o Driver
			        Class.forName("oracle.jdbc.driver.OracleDriver");
			  
			        //Abre uma conexão com o banco de dados
			        Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM92020", "290685");
			        
			        System.out.println("Conectado!");
			        
			        
			        //Inserção de dados no banco
			        PreparedStatement stmt = conexao.prepareStatement("INSERT INTO T_SIP_ATIVIDADES (CD_ATIVIDADE, CD_USUARIO, DS_ATIVIDADES, DT_DATA_EXECUCAO, NM_CAL_QUEIMADAS) VALUES (SQ_ATIVIDADES.NEXTVAL, ?, ?, ?, ?,?)");
			        stmt.setInt(1, 1); //Primero parâmetro (Código Atividade)
			        stmt.setInt(2, 1);//Segundo parâmetro (Código usuário)
			        stmt.setString(3, "Supino"); //Terceiro parâmetro (Atividade)
			        //Instancia um objeto do tipo java.sql.Date com a data atual
			        java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			        stmt.setDate(4,data);//Quarto parâmetro (data de execução da atividade)
			        stmt.setInt(5, 600);//Quinto parâmetro (Calorias queimadas na atividade)
			              
			        stmt.executeUpdate();
			        
			        
			        PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM T_SIP_ATIVIDADES WHERE NOME = ?");
			        stmt.setString(3, "Supino");
			        ResultSet result = stmt.executeQuery();
			        
			        
			        //Percorre todos os registros
			        
			        while (result.next()) {
			        	int codigoAtividade = result.getInt("CD_ATIVIDADE");
			        	int codigoUsuario = result.getInt("CD_USUARIO");
			        	String  atividade = result.getString("DS_ATIVIDADE");
			        	java.sql.Date dataAtividade = result.getDate("DT_DATA_EXECUCAO");
			        	int calQueimadas = result.getInt("NM_CAL_QUEIMADAS");
			        	
			        	//Informações do registro
			        	System.out.println(codigoAtividade + " " + codigoUsuario + " " + atividade + " " + dataAtividade + " " + calQueimadas);
			        }
			        
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
		

