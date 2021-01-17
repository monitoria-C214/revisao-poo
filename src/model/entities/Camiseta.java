package model.entities;

import model.interfaces.Taxa;

public class Camiseta extends Produto implements Taxa {

	// Atributos
	private String cor;
	private String tamanho;

	// Construtor
	public Camiseta(String nome, double preco, String cor, String tamanho) {
		super(nome, preco);
		this.cor = cor;
		this.tamanho = tamanho;
	}

	// Métodos
	@Override
	public String etiquetaPreco() {
		return "Nome: " + getNome() + "\n" +
				"R$ " + String.format("%.2f", getPreco()) + "\n" +
				"Cor: " + this.cor + "\n" +
				"Tamanho: " + this.tamanho;
	}
	
	@Override
	public void calculaTaxa() {
		setTotal(getPreco() * 1.10);
		System.out.println("Total: " + getTotal());
	}

	// Getters e Setters
	public String getCor() {
		return cor;
	}	

	public String getTamanho() {
		return tamanho;
	}		

}
