package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutos;
	
	public EstoqueProdutos() {
		this.estoqueProdutos=new HashMap<Long, Produto>();
	}
	
	public void adicionarProduto(long id,String nome,int quantidade,double preco) {
		estoqueProdutos.put(id, new Produto(nome,quantidade,preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}
	
	public void calculaValorTotalEstoque() {
		double valorTotal=0;
		if(!estoqueProdutos.isEmpty()) {
			for(Produto p: estoqueProdutos.values()) {
				valorTotal+=p.getPreco()*p.getQuantidade();
			}
		
		}
		System.out.println("Valor total: "+ valorTotal);
	}
	
	public void obterProdutoMaisCaro() {
		
		double maiorValor=Double.MIN_VALUE;
		for(Produto p:estoqueProdutos.values() ) {
			if(p.getPreco()>maiorValor) {
				maiorValor=p.getPreco();
			
			}
		}
		System.out.println("O maior valor do estoque: "+maiorValor);
	}
	
	public void obterProdutoMaisBarato() {
		
		double menorValor=Double.MAX_VALUE;
		for(Produto p:estoqueProdutos.values() ) {
			if(p.getPreco()<menorValor) {
				menorValor=p.getPreco();
			
			}
		}
		System.out.println("O menor valor do estoque: "+menorValor);
	}
	public static void main(String[] args) {
		EstoqueProdutos estoqueProduto=new EstoqueProdutos();
		estoqueProduto.adicionarProduto(1l, "carne", 10, 40);
		estoqueProduto.adicionarProduto(2l, "peixe", 3, 10);
		estoqueProduto.adicionarProduto(3l, "arroz", 6, 15);
		estoqueProduto.exibirProdutos();
		estoqueProduto.calculaValorTotalEstoque();
		estoqueProduto.obterProdutoMaisCaro();
		estoqueProduto.obterProdutoMaisBarato();
		
		
	}

}
