package loja.repository;

import loja.model.LojaEletronicos;

public interface LojaEletronicaRepository {
	
	public void procurarPorCodigo(int codigo);
	public void listarProdutos();
	public void cadastrar(LojaEletronicos loja);
	public void atualizar(LojaEletronicos loja);
	public void deletar(int codigo);

}
