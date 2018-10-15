package com.algoritmos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Arreglos {
	
	public String[] meses(int[] nums)
	{
		String[] mes = new String[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			switch (nums[i]) {
			case 1: mes[i]="Enero";
				break;
			case 2: mes[i]="Febrero";
			break;
			case 3: mes[i]="Marzo";
			break;
			case 4: mes[i]="Abril";
			break;
			case 5: mes[i]="Mayo";
			break;
			case 6: mes[i]="Junio";
			break;
			case 7: mes[i]="Julio";
			break;
			case 8: mes[i]="Agosto";
			break;
			case 9: mes[i]="Septiembre";
			break;
			case 10: mes[i]="Octubre";
			break;
			case 11: mes[i]="Noviembre";
			break;
			case 12: mes[i]="Diciembre";
			break;
			default: mes[i]="Buen intento";
				break;
			}
		}
		
		return mes;
	}
	
	public String[] numMes(int[] aleatorios)
	{
		String[] muestra = {"Buen Intento", "Enero", "Feb", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Sept","Oct","Nov","Dic"};
		String[] meses = new String[aleatorios.length];
		int aux =0;
		for(int i=0; i<aleatorios.length; i++)
		{
			aux = aleatorios[i];
			meses[i] = muestra[aux];
		}
		return meses;
	}
	
	public int[] sumaArreglos(int[] n1, int[] n2)
	{
		int[] n3 = new int[n1.length];
		
		for(int i=0; i<n1.length; i++)
		{
			n3[i] = n1[i] + n2[i];
		}
		
		return n3;
	}
	
	public int media(ArrayList<Integer> nums)
	{
		int media = 0;
		
		Iterator<Integer> it = nums.iterator();
		while(it.hasNext())
		{
			media+=(int)it.next();
		}
		media=media/nums.size();
		
		return media;
	}
	
	
	public long[] fibonacci(int limite)
	{
		long[] serie = new long[limite];
		//En caso de que nos pida mas de un termino
		if(limite>1)
		{
			//Definimos los dos primeros terminos
			serie[0]=0;
			serie[1]=1;
			//Cada termino es igual a la suma de los dos anteriores
			for(int i=2; i<limite; i++)
				serie[i] = serie[i-1]+serie[i-2];
		}else if(limite==1) //Cuando solo pide un termino
			serie[0]=0;
		
		return serie;
	}
	
	public int[] recorrer(int[] numeros)
	{
		int[] recorrido = new int[numeros.length];
		
		recorrido[0] = numeros[numeros.length-1];
		for(int i=1; i<(numeros.length); i++)
		{
			recorrido[i]=numeros[i-1];
		}
			
		return recorrido;
	}
	
	public ArrayList<Integer> recorrerPila(Stack<Integer> pila)
	{
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(pila.pop());
		lista.addAll(pila);
		
		return lista;
	}
	
	public int[] recorrido(int[] arreglo)
	{
		int[] nuevoArr = new int[arreglo.length];
		
		for(int i=1; i<arreglo.length; i++)
			nuevoArr[i]=arreglo[i-1];
		nuevoArr[0]=arreglo[arreglo.length-1];
		
		return nuevoArr;
	}
	
	
	
	
	
	
	
	
	
}
