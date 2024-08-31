package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefa {

	private List<Tarefa> listaTarefa;
	
//	public List getListaTarefa() {
//		return this.listaTarefa;
//	}
//	
//	public void setListaTerefa(List listaTarefa) {
//		this.listaTarefa=listaTarefa;
//	}
	
	public ListaTarefa() {
		this.listaTarefa=new ArrayList<>();
		
	}
	
	public void adicionarTarefa(String descricao) {
		listaTarefa.add(new Tarefa(descricao.trim()));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> listaRemover=new ArrayList<>();
		for(Tarefa t: listaTarefa) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				listaRemover.add(t);
			}
			
		}
		listaTarefa.removeAll(listaRemover);
		System.out.println("Descricao removida: ");
		for(Tarefa r: listaRemover) {
			System.out.println(r.getDescricao());
		}
	}
	
	public void obterNumeroTarefas() {
		System.out.println("Total de tarefas: "+listaTarefa.size());;
	}
	
	public void obterDescricaoTarefas() {
		for(Tarefa t: listaTarefa) {
			System.out.println(t);
			System.out.println(t.getDescricao());
		}
		
	}
	public static void main(String[] args) {
		Tarefa descricao=new Tarefa("ola");
		Scanner ler=new Scanner(System.in);
		ListaTarefa listaTarefa=new ListaTarefa();

		System.out.println("Digite a descrição da tarefa: ");
		descricao.setDescricao(ler.next());
		listaTarefa.adicionarTarefa(descricao.getDescricao());
		
		
		listaTarefa.obterNumeroTarefas();
		
		listaTarefa.obterDescricaoTarefas();
		listaTarefa.removerTarefa(descricao.getDescricao());

	}

}
