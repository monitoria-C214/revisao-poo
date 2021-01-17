package model.entities;

import model.interfaces.Taxa;

public class Notebook extends Produto implements Taxa {

	// Atributos
	private double armazenamento;
	private String gpu;
	private String processador;

	// Construtor
	public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
		super(nome, preco);
		this.armazenamento = armazenamento;
		this.gpu = gpu;
		this.processador = processador;
	}

	// Métodos

	@Override
	public String etiquetaPreco() {
		return "Nome: " + getNome() + "\n" + "R$ " + String.format("%.2f", getPreco()) + "\n" + "Armazenamento: "
				+ this.armazenamento + "\n" + "GPU: " + this.gpu + "\n" + "Processador: " + this.processador;
	}

	// Método da Interface
	@Override
	public void calculaTaxa() {
		setTotal(getPreco() * 1.01);
		System.out.println("Total: " + getTotal());
	}

	// Getters e Setters
	public double getArmazenamento() {
		return armazenamento;
	}

	public String getGpu() {
		return gpu;
	}

	public String getProcessador() {
		return processador;
	}


}
