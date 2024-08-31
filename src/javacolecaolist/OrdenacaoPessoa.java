package javacolecaolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoPessoa {
	
	private List<Pessoa> listaPessoas;
	

	
	public OrdenacaoPessoa() {
		listaPessoas=new ArrayList<>();
	}
	
	public class OrdenarPorAltura implements Comparator<Pessoa>{

		@Override
		public int compare(Pessoa p1, Pessoa p2) {
			return Double.compare(p1.getAltura(), p2.getAltura());
			 
		}
		
	}
	
	
	public void adicionarPessoa(String nome,int idade,double altura) {
		listaPessoas.add(new Pessoa(nome,idade,altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> listaPorIdade=new ArrayList<>(listaPessoas);
		if(!listaPorIdade.isEmpty()) {
			Collections.sort(listaPorIdade);
			return listaPorIdade;
		}
		else {
			throw new RuntimeException("Lista vazia");
		}
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> listaPorAltura=new ArrayList<>(listaPessoas);
		if(!listaPorAltura.isEmpty()) {
			Collections.sort(listaPorAltura, new OrdenarPorAltura());
			return listaPorAltura;	
		}else {
			throw new RuntimeException("A lista esta vazia");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "OrdenacaoPessoa [listaPessoas=" + listaPessoas + "]";
	}

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		OrdenacaoPessoa listaPessoas=new OrdenacaoPessoa();

		
		listaPessoas.adicionarPessoa("ryan", 20, 1.80);
		listaPessoas.adicionarPessoa("souza", 21, 1.90);
		listaPessoas.adicionarPessoa("gio", 40, 1.60);
		listaPessoas.adicionarPessoa("ana", 14, 1.40);
		
		System.out.println(listaPessoas.ordenarPorAltura());
		System.out.println(listaPessoas.ordenarPorIdade());
	}
}
