/**
 * Classe que que herda a classe CadastroUsuario .
 * Seus atributos s�o compostos pelos atributos  herdados da classe CadastroUsuario e de seus pr�prios atributos.
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class UsuarioComum extends CadastroUsuario {
	
	private String cpf;
	private String rg;
	
	/**
	 * Construtor padr�o.
	 */
	public UsuarioComum() {
		
	}

	/**
	 * Construtor que inicializa com par�metros.
	 * @param cpf
	 * @param rg
	 */
	public UsuarioComum(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		
		System.out.println("Usu�rio Comum");
	}

	/**
	 * M�todos getters e setters, utilizados para consulta e configura��o dos par�metros.
	 * @param cpf, rg
	 * Herdas os m�todos da classe CadastroUsu�rio
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
