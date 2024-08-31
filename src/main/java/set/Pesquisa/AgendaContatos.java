package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		
		this.contatoSet = new HashSet<>();
	}	
		public void adicionarContato(String nome,int numero) {		
			contatoSet.add(new Contato(nome,numero));
		}
		
		public void exbirContato() {
			for(Contato c:contatoSet) {
				System.out.println(c);
			}
		}
		public void pesquisarPorNome(String nome) {
			Set<Contato>contatosPorNomeSet = new HashSet<>();
			for(Contato c: contatoSet) {
				if(c.getNome().startsWith(nome)) {
					contatosPorNomeSet.add(c);
					break;
				}
			}
			for(Contato ca: contatosPorNomeSet) {
				System.out.println(ca);
			}
		}
		
		public Contato atualizarNumeroContato(String nome,int numero) {
			Contato contatoAtualizado=null;
			for(Contato c: contatoSet) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(numero);
					contatoAtualizado=c;
					break;
				}
			}
			return contatoAtualizado;
		}
	public static void main(String[] args) {
		
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.adicionarContato("ryan", 1111);
		contatos.adicionarContato("pedro", 2222);
		contatos.adicionarContato("souza", 3333);
		contatos.adicionarContato("pedro", 4444);
		
		contatos.pesquisarPorNome("pedro");
		System.out.println(contatos.atualizarNumeroContato("ryan", 3333));
	}
	
	
}
