/**
 * Classe de composi��o que ser� utilizado como um atributo na classe DadosFisicos, onde ir� cadastrar as atividades efetuadas pelo usu�rio.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

import java.sql.Date;
import java.util.Calendar;

public class Atividades {
	
	
	
	private int cdAtividade;
	private int cdUsuario;
	private String nomeAtividade;
	private Calendar dataExecucao;
	private int calQueimadas;
	
	
	
	
	public Atividades() {
		super();
	}
	
	
	
	public Atividades(int codigoAtividades, int codigoUsuario, String nomeAtividades, Date data,
			Calendar dataExecucao2) {
		// TODO Auto-generated constructor stub
	}


	/**
	 * M�todos getters e setters, utilizados para consulta e configura��o dos par�metros.
	 * @param nomeAtividade, dataExecucao
	 */
	
	public String getNomeAtividade() {
		return nomeAtividade;
	}
	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}
	public Calendar getDataExecucao() {
		return dataExecucao;
	}
	public void setDataExecucao(Calendar calendar) {
		this.dataExecucao = calendar;
	}
	public int getCalQueimadas() {
		return calQueimadas;
	}
	public void setCalQueimadas(int calQueimadas) {
		this.calQueimadas = calQueimadas;
	}
	
	public int getCdAtividade() {
		return cdAtividade;
	}
	public int getCdUsuario() {
		return cdUsuario;
	}
}
