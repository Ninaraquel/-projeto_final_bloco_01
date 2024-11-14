package loja.model;

public class Celular extends LojaEletronicos {

	private String sistemaOperacional;
	private int capacidadeMemoria;

	public Celular(int codigo, String nomeProduto, String marca, double preco) {
		super(codigo, nomeProduto, marca, preco);

	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public int getCapacidadeMemoria() {
		return capacidadeMemoria;
	}

	public void setCapacidadeMemoria(int capacidadeMemoria) {
		this.capacidadeMemoria = capacidadeMemoria;
	}

	public void exibirDetalhes() {

		// Chama o método exibirDetalhes da superclasse
		super.exibirDetalhes();

		// Adiciona os detalhes específicos da subclasse
		System.out.println("Sistema Operacional: " + getSistemaOperacional());
		System.out.println("Capacidade de Memória: " + getCapacidadeMemoria() + "GB");

	}

}
