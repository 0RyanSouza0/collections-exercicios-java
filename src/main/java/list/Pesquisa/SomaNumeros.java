package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumero;
	
	public  SomaNumeros() {
		this.listaNumero=new ArrayList<>();
		
	}
	
	public void adicionaNumero(int numero) {
		listaNumero.add(numero);
		System.out.println("Numero adicionado");
	}
	
	public int calcularSoma() {
	    int soma = 0;
	    for (Integer numero : listaNumero)
	      soma += numero;
	    return soma;
	  }
	
	public void encontrarMaiorNumero() {
		int maiorValor=Integer.MIN_VALUE;
		for(Integer numero: listaNumero) {
			if(numero > maiorValor) {
				maiorValor=numero;
			}
			

		}
		System.out.println(maiorValor);
	}
	
	public void encontrarMenorNumero() {
		int menorValor=Integer.MAX_VALUE;
		for(Integer numero: listaNumero) {
			if(numero < menorValor) {
				menorValor=numero;
			}
			

		}
		System.out.println(menorValor);
	}
	
	public void exbirNumeros() {
		for(Integer numeros:listaNumero) { 
			System.out.println(numeros);
		}
	}
	
	public static void main(String[] args) {
		
		SomaNumeros listaNumeros= new SomaNumeros();
		
		listaNumeros.adicionaNumero(10);
		listaNumeros.adicionaNumero(5);
		listaNumeros.adicionaNumero(2);
		listaNumeros.adicionaNumero(30);
		listaNumeros.adicionaNumero(12);
		System.out.println(listaNumeros.calcularSoma());;
		listaNumeros.encontrarMaiorNumero();
		listaNumeros.encontrarMenorNumero();
		listaNumeros.exbirNumeros();
		
		
	}
}






