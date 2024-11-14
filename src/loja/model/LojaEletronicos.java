package loja.model;

public abstract class LojaEletronicos {
	private int codigo;
	private String nome;
	private String marca;
	private double preco;

	public LojaEletronicos(int codigo, String nome, String marca, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNomeProduto(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void exibirDetalhes() {
        System.out.println("Detalhes do Produto:");
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$ " + getPreco());
       
    }

}
