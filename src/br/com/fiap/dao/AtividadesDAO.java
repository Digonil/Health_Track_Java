/**
 * Classe de composição que será utilizado como um atributo na classe DadosFisicos, onde irá cadastrar as atividades efetuadas pelo usuário.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.Atividades;
import br.com.fiap.healthtrack.HealthTrackDB;



public class AtividadesDAO {
	
	
	private Connection conexao;
	
	//Método para realizar a inserção de dados.
	
	public void cadastrar(Atividades atividades) {
		PreparedStatement stmt = null;
		
		try {
			
			conexao = HealthTrackDB.obterConexao();
			
			String sql = "INSERT INTO T_SIP_ATIVIDADES (CD_ATIVIDADE, CD_USUARIO, DS_ATIVIDADE, DT_DATA_EXECUCAO, NM_CAL_QUEIMADAS) VALUES (SQ_ATIVIDADES.NEXTVAL,SQ_CADASTRO.NEXTVAL, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
	        
	        stmt.setString(1, atividades.getNomeAtividade()); //Terceiro parâmetro (Atividade)
	        //Instancia um objeto do tipo java.sql.Date com a data atual
	        java.sql.Date data = new java.sql.Date(atividades.getDataExecucao().getTimeInMillis());
	        stmt.setDate(2,data);//Quarto parâmetro (data de execução da atividade)
	        stmt.setInt(3, atividades.getCalQueimadas());//Quinto parâmetro (Calorias queimadas na atividade)
	              
	        stmt.executeUpdate();
	        
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				stmt.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
				
	}
	
	
	//Método para realizar a consulta de dados.
	
	public List<Atividades> listar() {
		
	    //Cria uma lista de atividades
	    
		List<Atividades> lista = new ArrayList<Atividades>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    
	    try {
	    conexao = HealthTrackDB.obterConexao();
	    stmt = conexao.prepareStatement("SELECT * FROM T_SIP_ATIVIDADES");
	    rs = stmt.executeQuery();
	  
	//Percorre todos os registros encontrados
	    
	    while (rs.next()) {
	    	
		    int codigoAtividades = rs.getInt("CD_ATIVIDADE");
		    int codigoUsuario = rs.getInt("CD_USUARIO");
		    String nomeAtividades = rs.getString("DS_ATIVIDADE");
		    java.sql.Date data = rs.getDate("DT_DATA_EXECUCAO");
		    Calendar dataExecucao = Calendar.getInstance();
		    dataExecucao.setTimeInMillis(data.getTime());
		    int calQueimadas = rs.getInt("NM_CAL_QUEIMADAS");
	        
	    //Cria um objeto Atividades com as informações encontradas
		    
	    Atividades atividade = new Atividades(codigoAtividades, codigoUsuario, nomeAtividades, data, dataExecucao);
	    
	    //Adiciona o colaborador na lista
	    lista.add(atividade);
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return lista;
	  }
	
	
//	//Método para remoção de dados
//	
//	public void remover(int codigo){
//	    PreparedStatement stmt = null;
//	  
//	    try {
//	      conexao = HealthTrackDB.obterConexao();
//	      String sql = "DELETE FROM T_SIP_ATIVIDADES WHERE CODIGO_COLABORADOR = ?";
//	      stmt = conexao.prepareStatement(sql);
//	      stmt.setInt(1, codigo);
//	      stmt.executeUpdate();
//	    } catch (SQLException e) {
//	      e.printStackTrace();
//	    } finally {
//	      try {
//	        stmt.close();
//	        conexao.close();
//	      } catch (SQLException e) {
//	        e.printStackTrace();
//	      }
//	    }
//	  }
	
	// Busca por código para recuperar o id.
	
//	public Atividades buscarPorId(int codigoBusca){
//	Atividades atividade = null;
//	  PreparedStatement stmt = null;
//	  ResultSet rs = null;
//	  
//	  try {
//	    conexao = HealthTrackDB.obterConexao();
//	    stmt = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = ?");
//	    stmt.setInt(1, codigoBusca);
//	    rs = stmt.executeQuery();
//	  
//	    if (rs.next()){
//	      int codigo = rs.getInt("CODIGO_COLABORADOR");
//	      String nome = rs.getString("NOME");
//	      String email = rs.getString("EMAIL");
//	      double salario = rs.getDouble("SALARIO");
//	      java.sql.Date data = rs.getDate("DATA_CONTRATACAO");
//	      Calendar dataContratacao = Calendar.getInstance();
//	      dataContratacao.setTimeInMillis(data.getTime());
//	      Atividades atividade = new Atividades(codigoAtividades, codigoUsuario, nomeAtividades, data, dataExecucao);
//	    }
//	    
//	  } catch (SQLException e) {
//	    e.printStackTrace();
//	  }finally {
//	    try {
//	      stmt.close();
//	      rs.close();
//	      conexao.close();
//	    } catch (SQLException e) {
//	      e.printStackTrace();
//	    }
//	  }
//	  return atividade;
//	  }
	
	
}
