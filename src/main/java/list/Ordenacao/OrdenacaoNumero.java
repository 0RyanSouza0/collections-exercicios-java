package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero  {
	
	
	private List<Integer> listaNumeros;
	
	public OrdenacaoNumero() {
		this.listaNumeros=new ArrayList<>();
		
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);		
	}
	
	
	public void ordenarCrescente(){
		List<Integer>listaCrescente=new ArrayList<>(listaNumeros);
		Collections.sort(listaCrescente);
		for(Integer numeros: listaCrescente) {
			System.out.println(numeros);
		}
	}
	
	public void ordenarDescente(){
		List<Integer>listaDescente=new ArrayList<>(listaNumeros);
		listaDescente.sort(Collections.reverseOrder());
		for(Integer numeros: listaDescente) {
			System.out.println(numeros);
		}
	}
	
	public void exibirNumeros() {
		for(Integer numeros:listaNumeros) {
			System.out.println(numeros);
		}
	}
	
	
	public static void main(String[] args) {
		
		OrdenacaoNumero listaNumeros=new OrdenacaoNumero();
		
		listaNumeros.adicionarNumero(10);
		listaNumeros.adicionarNumero(9);
		listaNumeros.adicionarNumero(30);
		listaNumeros.adicionarNumero(4);
		listaNumeros.adicionarNumero(6);
		
		listaNumeros.ordenarCrescente();
		System.out.println("");
		listaNumeros.ordenarDescente();
		
	}


	
}
