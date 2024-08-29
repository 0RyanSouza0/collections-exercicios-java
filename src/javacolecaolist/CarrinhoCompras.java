package javacolecaolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoCompras {
	
	private List<ItemCarrinho> listaCarrinho;
	
	public CarrinhoCompras() {
		this.listaCarrinho=new ArrayList<>();
	}
	
	public void adiconarItem( ItemCarrinho item) {
		if(item.getNomeItem() ==null || item.getPrecoItem() ==0 || item.getQuantidadeItem()==0) {
			System.out.println("Este nao item nao teve todos os requisitos preenchido");
		}else {
		listaCarrinho.add(item);
		
		System.out.println("Adiconado");
		}
	}
	
	public void removerItem( ItemCarrinho item) {
		List<ItemCarrinho> removerItem=new ArrayList<>();
		for(ItemCarrinho i: listaCarrinho) {
			if(item.equals(i)) {
				removerItem.add(item);	
			}	
		}
		listaCarrinho.removeAll(removerItem);
		
		System.out.println("Item Removido:");
		for(ItemCarrinho ir:removerItem) {
			System.out.println(ir.getNomeItem());
		}
	}
	
	public void exibirItem() {
		System.out.println("ITENS NO CARRINHO");
		for (ItemCarrinho i: listaCarrinho) {
			
			System.out.println(i.getNomeItem()+"\n"+i.getPrecoItem()+"R$ \n"+i.getQuantidadeItem()+" UNIDADES");
		}
	}
	
	public void calculaValorTotal() {
		List<ItemCarrinho> listaCalcula = new ArrayList<ItemCarrinho>();
		int quantidade=0;
		double preco=0;
		double valorTotal=0;
		for(ItemCarrinho ic: listaCarrinho) {
			if(listaCarrinho.isEmpty() ) {
				System.out.println("Carrinho vazio");
			}
			else {
				listaCalcula.addAll(listaCarrinho);
				for(ItemCarrinho i: listaCalcula) {
				 preco=i.getPrecoItem();
				 quantidade=i.getQuantidadeItem();
				}
			}
		}
		 valorTotal=preco* quantidade;
		 System.out.println("O valor total do carrinho é: "+ valorTotal);
		
	}
	public static void main(String[] args) {
		
		
		ItemCarrinho item=new ItemCarrinho();
		CarrinhoCompras listaCompra=new CarrinhoCompras();
		Scanner ler=new Scanner(System.in);
		
	
		System.out.println("Digite o nome do item");
		item.setNomeItem(ler.next());
		System.out.println("Digite o preço do item");
		item.setPrecoItem(ler.nextDouble());
		System.out.println("Digite a quantidade do item");
		item.setQuantidadeItem(ler.nextInt());
		
		
		
		listaCompra.adiconarItem(item);
		listaCompra.calculaValorTotal();
		listaCompra.exibirItem();
		listaCompra.removerItem(item);
		
	}
}
