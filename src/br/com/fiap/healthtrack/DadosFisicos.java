/**
 * Classe que abstrai os dados fisicos de um usu�rio, onde ir� compor a classe CadastroUsuario.
 * Seus atributos s�o compostos pelas classes Imc e Atividades.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class DadosFisicos {
	
	
	/**
	 * * Atributos da classe DadosFisicos.
	 * Utilizado composi��o de classes para os atributos Imc e Atividades.
	*/	
	private int cdEntradaPeso;
	private int cdUsuario;
	private String dataPesagem;
	private int peso;
	private int altura;
	private Imc imc = new Imc();
	private Atividades atividades = new Atividades();
	
	
	/**
	 * M�todos getters e setters, utilizados para consulta e configura��o dos par�metros.
	 * @param dataPesagem
	 */
	
	public String getDataPesagem() {
		return dataPesagem;
	}
	public void setDataPesagem(String dataPesagem) {
		this.dataPesagem = dataPesagem;
	}
	
	

}
