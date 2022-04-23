/**
 * Classe de composi��o que ser� utilizado como um atributo na classe DadosFisicos, onde ir� cadastrar as atividades efetuadas pelo usu�rio.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class Atividades {
	
	String nomeAtividade;
	String dataExecucao;
	
	
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
	public String getDataExecucao() {
		return dataExecucao;
	}
	public void setDataExecucao(String dataExecucao) {
		this.dataExecucao = dataExecucao;
	}
	
}
