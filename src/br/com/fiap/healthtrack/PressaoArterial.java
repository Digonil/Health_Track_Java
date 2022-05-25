package br.com.fiap.healthtrack;

public class PressaoArterial {
	
	private int cdPresArt;
	private int cdUsuario;
	private String dataMedicao;
	private double pressBaixa;
	private double pressAlta;
	private int bpm;
	
	
	public String getDataMedicao() {
		return dataMedicao;
	}
	public void setDataMedicao(String dataMedicao) {
		this.dataMedicao = dataMedicao;
	}
	public double getPressBaixa() {
		return pressBaixa;
	}
	public void setPressBaixa(double pressBaixa) {
		this.pressBaixa = pressBaixa;
	}
	public double getPressAlta() {
		return pressAlta;
	}
	public void setPressAlta(double pressAlta) {
		this.pressAlta = pressAlta;
	}
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	
	
}
