package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> listaPalavras;
	
	public ConjuntoPalavrasUnicas() {
		this.listaPalavras=new HashSet<>();
	}

	@Override
	public String toString() {
		return "ConjuntoPalavrasUnicas [listaPalavras=" + listaPalavras + "]";
	}
	
	
	public void adicionarPalavra(String palavra) {
		listaPalavras.add( palavra);
		
	}
	
	public void removerPalavra(String palavra) {
		for(String palavras:listaPalavras) {
			if(palavras.contains(palavra)) {
				listaPalavras.remove(palavra);
				break;
			}
			else {
				throw 	new RuntimeException("A palavra não existe");
			}
		}
	}
	
	public void verificarPalavra(String palavra) {
		System.out.println(listaPalavras.contains(palavra)+" Existe "+ palavra);
	}
	
	public void exibirPalavras() {
		System.out.println(listaPalavras);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas  listaPalavra=new ConjuntoPalavrasUnicas();
		listaPalavra.adicionarPalavra("ryan");
		listaPalavra.adicionarPalavra("souza");
		listaPalavra.adicionarPalavra("ana");
		listaPalavra.adicionarPalavra("pedro");
		listaPalavra.removerPalavra("ryan");
		listaPalavra.verificarPalavra("souza");
		listaPalavra.exibirPalavras();
		
	}
}
