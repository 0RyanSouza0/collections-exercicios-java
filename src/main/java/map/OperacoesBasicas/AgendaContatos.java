package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> dicionarioAgenda;
	
	public AgendaContatos() {
		this.dicionarioAgenda=new HashMap<String, Integer>();
	}
	
	public void adicionarContato(String nome,Integer numero) {
		dicionarioAgenda.put(nome, numero);
		
	}
	
	public void removerContato(String nome) {
		if(!dicionarioAgenda.isEmpty()) {
			dicionarioAgenda.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(dicionarioAgenda);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome=null;
		if(!dicionarioAgenda.isEmpty()) {
			numeroPorNome=dicionarioAgenda.get(nome);
		}
		return numeroPorNome;
	}
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContato= new AgendaContatos();
		
		agendaContato.adicionarContato("ryan", 1234);
		agendaContato.adicionarContato("pedro", 4567);
		agendaContato.adicionarContato("gustavo", 8910);
		agendaContato.adicionarContato("alice", 1010);
		System.out.println();
		agendaContato.removerContato("ryan");
		agendaContato.exibirContato();
		System.out.println("O numero do contato pesquisado é: "+agendaContato.pesquisarPorNome("alice"));
		
		
		
		
	}

}
