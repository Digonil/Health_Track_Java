/**
 * Classe de composição que será utilizado como um atributo na classe DadosFisicos, onde irá cadastrar as atividades efetuadas pelo usuário.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class Atividades {
	
	String nomeAtividade;
	String dataExecucao;
	
	
	/**
	 * Métodos getters e setters, utilizados para consulta e configuração dos parâmetros.
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
