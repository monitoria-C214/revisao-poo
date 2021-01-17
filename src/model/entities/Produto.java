package model.entities;

public abstract class Produto {

	// Atributos
	private String nome;
	private double preco;
	
	private double total;
	
	//Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Métodos
	public abstract String etiquetaPreco();
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}	

	public double getPreco() {
		return preco;
	}	

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}	
	
	
}
