package com.algoritmos;

import java.util.Scanner;

public class Ciclos {
	static int a = 1;
	int b = 2;
	
	public static int numero(int c)
	{
		c = a*c;
		return 1;
	}
	
	public int potencia(int base, int exponente)
	{
		int res = 1;
		
		for(int i=0; i<exponente; i++)
			res *= base;
		
		return res;
	}
	
	public int cifras(int n1, int n2) {
		int cont1 = 0;
		int cont2 = 0;
		if(n1==0)
			cont1=1;
		else {
			while(n1>=1)
			{
				n1 = n1/10;
				cont1++;
			}
		}
		if(n2==0)
			cont2=1;
		else
		{
			while(n2>=1)
			{
				n2 = n2/10;
				cont2++;
			}
		}
		
		return cont1+cont2;
	}
	public int invertirNumero (int n) {
		int cifras = cifras(n,1)-1;
		int nInvertido = 0;
		int divisorCifras = 1;
		int multiplicadorCifras = 1;
		
		for(int i = 1; i < cifras; i++)
			divisorCifras *= 10;
		
		while (divisorCifras >= 1) {
			nInvertido += n/divisorCifras * multiplicadorCifras;
			n%=divisorCifras;
			divisorCifras/=10;
			multiplicadorCifras *= 10;
		}
		return nInvertido;
	}
	public String adivinar(int n1, int n2) {
		String pista = "";
		
		if(n1>n2)
			pista = "El numero es mayor";
		else if(n2>n1)
			pista = "El numero es menor";
		else
			pista = "Lo adivinaste!";
		
		return pista;
	}
	
	public String Matriz(int numero) { 
		String cuadro = "";
		for(int i = 0; i < numero; i++) {
			for(int j = 0; j < numero; j++) {
				cuadro = cuadro + "* "; 
			}
			cuadro = cuadro + "\n";
		}
		return cuadro;
	}
	
	
}
