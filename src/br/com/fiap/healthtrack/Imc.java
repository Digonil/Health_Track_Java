/**
 * Classe para c�lculo do IMC, onde ir� compor como um atributo a classe DadosFisicos
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class Imc {
	
	double peso;
	double altura;
	
	/**
	 * M�todos getters e setters, utilizados para consulta e configura��o dos par�metros.
	 * @param peso, altura
	 */
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * M�todo para c�lculo do IMC.
	 */
	private double calculcarImc() {
		return this.peso * (this.altura * this.altura);
	}

}
