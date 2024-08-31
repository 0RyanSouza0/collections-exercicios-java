package main.java.list.OperacoesBasicas;

public class Tarefa {

	private String descricao;
	
	public Tarefa(String descricao) {
		this.descricao=descricao.trim();
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	
	
	
	
}
