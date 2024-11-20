package loja.model;

public class ProdutosEletronicos extends Produto {

	private String categoria;

	public ProdutosEletronicos(String nome, String marca, int codigo, double preco, String categoria) {
		super(nome, marca, codigo, preco);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void exibirDetalhes() {

		// Chama o método exibirDetalhes da superclasse
		super.exibirDetalhes();

		System.out.println("Categoria: " + this.categoria);

	}

}
