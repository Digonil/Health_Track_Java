/**
 * Classe para cálculo do IMC, onde irá compor como um atributo a classe DadosFisicos
 * @author Grupo D
 * @version 1.0
 */

package br.com.fiap.healthtrack;

public class Imc {
	
	double peso;
	double altura;
	
	/**
	 * Métodos getters e setters, utilizados para consulta e configuração dos parâmetros.
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
	 * Método para cálculo do IMC.
	 */
	private double calculcarImc() {
		return this.peso * (this.altura * this.altura);
	}

}
