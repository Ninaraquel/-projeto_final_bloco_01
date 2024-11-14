package loja.model;

public class Celular extends LojaEletronicos {

	public Celular(int codigo, String nomeProduto, String marca, double preco) {
		super(codigo, nomeProduto, marca, preco);

	}

	public void exibirDetalhes() {
		System.out.println("Detalhes do Produto:");
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Preço: R$ " + getPreco());

	}

}
