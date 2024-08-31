package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class CatalogoLivro {
	
	private List<Livro> listaLivro;
	
	public CatalogoLivro() {
		this.listaLivro=new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livro) {
		listaLivro.add(livro);
		
		
	}
	
	public String pesquisarPorAutor(String autor) {
		List <Livro> livrosAutor=new ArrayList<>();
		for(Livro a: listaLivro) {
			if(a.getAutor().equalsIgnoreCase(autor)){
				livrosAutor.add(a);
				System.out.println("LIVROS DESTE AUTOR: "+ a.getAutor());
				for(Livro la:livrosAutor) {
					return la.getTitulo();
				}
			}
		}
		return "autor nao encontrado";
	}
	
	public int pesquisarPorIntervaloAno(int anoInicial,int anoFinal) {
		List <Livro> livrosPorIntervalo=new ArrayList<>();
		for(Livro l:listaLivro) {
			if(l.getAno()>=anoInicial && l.getAno()<=anoFinal) {
				livrosPorIntervalo.add(l);
				System.out.println("LIVROS ENCONTRADOS NESTE PERIODO DE ANO");
				for(Livro lpa:livrosPorIntervalo) {
					return lpa.getAno() ;
				}

			}
		}
		return 0;
	}
	
	public void pesquisarPorTitulo(String titulo) {
		for(Livro a: listaLivro) {
			if(a.getTitulo().equalsIgnoreCase(titulo)){
				System.out.println("LIVRO: "+"\n"+a.getTitulo());
				break;
			}
		}

	}
	public static void main(String[] args) {
		
			CatalogoLivro listaLivro = new CatalogoLivro();
			
			Scanner ler=new Scanner (System.in);
		
			Livro livro=new Livro();
			System.out.println("Digite o nome do autor :");
			livro.setAutor(ler.next());


			System.out.println("Digite o titulo do livro:");
			livro.setTitulo(ler.next());
			

			System.out.println("Digite o ano do livro:");
			livro.setAno(ler.nextInt());
			
			
			listaLivro.adicionarLivro(livro);
			System.out.println(listaLivro.pesquisarPorIntervaloAno(1900, 2020));;
			
			listaLivro.pesquisarPorTitulo("coraline");
			
			System.out.println(listaLivro.pesquisarPorAutor("monteiro"));;
		
	}
}
