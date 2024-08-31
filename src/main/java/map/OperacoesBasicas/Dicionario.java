package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> agendaDicionario;
	
	public Dicionario() {
		this.agendaDicionario=new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra,String definicao) {
		agendaDicionario.put(palavra, definicao);
		
	}
	
	public void removerPalavra(String palavra) {
		if(!agendaDicionario.isEmpty()) {
			
			agendaDicionario.remove(palavra);
		}
		else {
			System.out.println("O dicionario esta vazio");
		}
	}
	
	public void exibirPalavras() {
		System.out.println(agendaDicionario);
	}
	
	public void pesquisarPorPalavra(String palavra) {
		if(!agendaDicionario.isEmpty()) {
			System.out.println(agendaDicionario.get(palavra)); ;
		}else {
			System.out.println("O dicionario esta vazio");
		}
	}
	
	public static void main(String[] args) {
		Dicionario dicionarioAgenda= new Dicionario();
		dicionarioAgenda.adicionarPalavra("arroz", "Grao(comida)");
		dicionarioAgenda.adicionarPalavra("bola", "esporte");
		dicionarioAgenda.adicionarPalavra("espada", "lamina");
		dicionarioAgenda.adicionarPalavra("galaxia", "vialactea");
		System.out.println("");
		dicionarioAgenda.removerPalavra("bola");
		dicionarioAgenda.pesquisarPorPalavra("galaxia");
		dicionarioAgenda.exibirPalavras();
	}
}
