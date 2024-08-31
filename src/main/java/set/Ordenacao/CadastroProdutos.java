package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	Set<Produto>listaProdutos;
	
	public CadastroProdutos() {
		this.listaProdutos=new HashSet<>();
	}
	
	public void adicionaProduto(String nome,long cod,double preco,int quantidade) {
		listaProdutos.add(new Produto(nome,cod,preco,quantidade));
	}
	
	public Set<Produto> exibirPorNome(){
		Set<Produto> listaPorNome=new TreeSet<Produto>(listaProdutos);
		
		return listaPorNome;
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> listaPorPreco=new TreeSet<Produto>(new CompararPorPreco());
		listaPorPreco.addAll(listaProdutos);
		return listaPorPreco;
	}
	public class CompararPorPreco implements Comparator<Produto>{

		@Override
		public int compare(Produto p1, Produto p2) {
			// TODO Auto-generated method stub
			return Double.compare(p1.getPreco(), p2.getPreco());
		}
		
	}
	
	public void exibirProdutos() {
		for(Produto p: listaProdutos) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		CadastroProdutos listaProdutos=new CadastroProdutos();
		
		listaProdutos.adicionaProduto("ovo", 1L, 20, 1);
		listaProdutos.adicionaProduto("leite", 2L, 4, 5);
		listaProdutos.adicionaProduto("pao", 3L, 1, 5);
		listaProdutos.adicionaProduto("carne", 4L, 30, 3);
		
		System.out.println("");
		System.out.println(listaProdutos.exibirPorNome());
		System.out.println("");
		System.out.println(listaProdutos.exibirPorPreco());
		System.out.println("");
		listaProdutos.exibirProdutos();
		
	}

	
}
