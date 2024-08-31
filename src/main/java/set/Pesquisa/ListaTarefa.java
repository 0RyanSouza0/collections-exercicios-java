package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
	
	Set<Tarefa> tarefaSet;
	
	ListaTarefa(){
		this.tarefaSet=new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
		
	}
	public void removerTarefa(String descricao) {
		Tarefa tarefaRemover=null;
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t: tarefaSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaRemover=t;
					break;
				}
			}
		}
		tarefaSet.remove(tarefaRemover);
		if(tarefaRemover==null) {
			System.out.println("Tarefa nao encontrada");
		}
	}
	
	public void exibirTarefas() {
		for(Tarefa t: tarefaSet) {
			System.out.println(t);
		}
	}
	
	public void contarTarefas() {
		System.out.println("Quantidade de tarefas: "+tarefaSet.size());;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t: tarefaSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluido(true);
					break;
				}
			}
		}
		else {
			System.out.println("Lista vazia");
			}
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t: tarefaSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluido(false);;
					break;
				}
			}
		}
		else {
		System.out.println("Lista vazia");
		}
	
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa>tarefasConcluidas=new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t: tarefaSet) {
				if(t.isConcluido()){
					tarefasConcluidas.add(t);
				}			
			}
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa>tarefasPendentes=new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t: tarefaSet) {
				if(!t.isConcluido()){
					tarefasPendentes.add(t);
				}
			}
		}
		return tarefasPendentes;
	}
	
	public void limparListaTarefas() {
		if(!tarefaSet.isEmpty()) {
			tarefaSet.clear();
		}
		else {
			System.out.println("A lista ja esta vazia");
		}
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa=new ListaTarefa();
		listaTarefa.adicionarTarefa("limpar");
		listaTarefa.adicionarTarefa("escovar");
		listaTarefa.adicionarTarefa("passar");
		listaTarefa.adicionarTarefa("pegar");
		listaTarefa.removerTarefa("pegar");
		listaTarefa.marcarTarefaConcluida("limpar");
		listaTarefa.marcarTarefaConcluida("passar");
		listaTarefa.marcarTarefaPendente("escovar");
		listaTarefa.contarTarefas();
		System.out.println();
		listaTarefa.exibirTarefas();
		System.out.println();
		System.out.println(listaTarefa.obterTarefasConcluidas());
		System.out.println();
		System.out.println(listaTarefa.obterTarefasPendentes());
		listaTarefa.limparListaTarefas();
		listaTarefa.exibirTarefas();
	}
}
