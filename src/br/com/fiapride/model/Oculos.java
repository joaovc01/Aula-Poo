package br.com.fiapride.model;

public class Oculos {

	public String lente;
	public int preço;
	public Boolean antireflexo;

	
	public Oculos() {
	}


	public Oculos(String lente, int preço, Boolean antireflexo) {
		this.lente = lente;
		this.preço = preço;
		this.antireflexo = antireflexo;
	}

}