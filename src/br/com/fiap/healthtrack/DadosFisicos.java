/**
 * Classe que abstrai os dados fisicos de um usuário, onde irá compor a classe CadastroUsuario.
 * Seus atributos são compostos pelas classes Imc e Atividades.
 * @author Grupo D
 * @version 1.0
 */


package br.com.fiap.healthtrack;

public class DadosFisicos {
	
	
	/**
	 * * Atributos da classe DadosFisicos.
	 * Utilizado composição de classes para os atributos Imc e Atividades.
	*/	
	
	private String dataPesagem;
	private Imc imc = new Imc();
	private Atividades atividades = new Atividades();
	
	
	/**
	 * Métodos getters e setters, utilizados para consulta e configuração dos parâmetros.
	 * @param dataPesagem
	 */
	
	public String getDataPesagem() {
		return dataPesagem;
	}
	public void setDataPesagem(String dataPesagem) {
		this.dataPesagem = dataPesagem;
	}
	
	

}
