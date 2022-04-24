/**
 * Classe que que herda a classe CadastroUsuario .
 * Seus atributos são compostos pelos atributos  herdados da classe CadastroUsuario e de seus próprios atributos.
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class UsuarioComum extends CadastroUsuario {
	
	private String cpf;
	private String rg;
	
	/**
	 * Construtor padrão.
	 */
	public UsuarioComum() {
		
	}

	/**
	 * Construtor que inicializa com parâmetros.
	 * @param cpf
	 * @param rg
	 */
	public UsuarioComum(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		
		System.out.println("Usuário Comum");
	}

	/**
	 * Métodos getters e setters, utilizados para consulta e configuração dos parâmetros.
	 * @param cpf, rg
	 * Herdas os métodos da classe CadastroUsuário
	 */
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
