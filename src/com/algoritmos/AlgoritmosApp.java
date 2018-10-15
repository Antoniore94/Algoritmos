package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AlgoritmosApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = 0;
		int exp = 0;
		int calificacion = 0;
		int asistencia = 0;
		double horas = 0;
		int n1, n2, n3;
		int n = 0;
		int opcion = 0;
		Ciclos ciclo = new Ciclos();
		Condicionales condicion = new Condicionales();
		Arreglos arreglo = new Arreglos();
		
		do {
		
		System.out.println("Selecciona un programa:\n 1-Calcular exponente\n 2-Aprobado o no\n 3-Calcula salario con horas extra\n 4-Identificar el numero medio\n 5-Contar las cifras de dos numeros\n 6-Calcular una nueva hora\n 7-Invertir las cifras de un numero\n 8-Determina si un numero es Primo\n 9- Imprime un Cuadrado de * de tamano n\n 10- Transforma vector de Numero a mes\n 11-Suma dos arreglos de aleatorios\n 12-Pide numeros hasta el primer negativo y calcula media\n 13-Serie de Fibonacci\n 14- Adivinar un numero\n 15-Recorrer un arreglo una posicion\n 16-Sustituir Vocales en un archivo");
		
		
		opcion=sc.nextInt();
		
		switch(opcion)
		{
		case 1: //		Pedir base y exponente, calcular resultado
			System.out.println("Dame la base");
			base = sc.nextInt();
			System.out.println("Dame el exponente");
			exp = sc.nextInt();
			System.out.println("El resultado es: "+ciclo.potencia(base, exp));
			break;
		case 2: 		//Decir si un alumno paso o no, de acuerdo a calificaciones y asistencia
			System.out.println("Cual es tu calificacion?");
			calificacion = sc.nextInt();
			System.out.println("Cuantas asistencias tienes?");
			asistencia = sc.nextInt();
			System.out.println("Pasaste: "+condicion.acreditar(asistencia, calificacion));
			break;
		case 3: 		//Calcular el salario tomando en cuenta horas extra
			System.out.println("Ingresa tu salario:");
			double salario = sc.nextDouble();
			System.out.println("Ingresa las horas que trabajaste:");
			horas = sc.nextDouble();
			System.out.printf("Tu sueldo total es: "+condicion.salario(salario, horas));
			break;
		default: System.out.println("En mantenimiento");
		}
		
		do {
		System.out.println("Otro programa?\n 1-Si\n 2-No");
		opcion = sc.nextInt();
		if(opcion!=1 && opcion!=2)
			System.out.println("Opcion no valida");
		}while(opcion!=1 && opcion!=2);
		
		}while(opcion==1);
		System.out.println("Adios.");
		
		//Pedir tres numeros e indicar cual es el numero de enmedio
//		System.out.println("Ingresa el primer numero: ");
//		n1 = sc.nextInt();
//		System.out.println("Ingrese el segundo numero: ");
//		n2 = sc.nextInt();
//		System.out.println("ingrese el tercer numero: ");
//		n3 =sc.nextInt();
//		System.out.println("El numero de enmedio es: "+condicion.medio(n1, n2, n3));
//		
		//Pedir dos numeros y decir cuantas cifras tienen entre ambos
//		System.out.println("Dame un numero");
//		n1 = sc.nextInt();
//		System.out.println("Dame otro numero");
//		n2 = sc.nextInt();
//		System.out.println("La suma de sus cifras es: "+ciclo.cifras(n1, n2));
//		
		//Pdir al usuario la hora min y seg. e incrementar en seg. todo implementado por los usuarios.
//		System.out.println("Ingresa hora");
//		n1 = sc.nextInt();
//		System.out.println("Ingresa minutos");
//		n2 = sc.nextInt();
//		System.out.println("Ingresa segundos");
//		n3 = sc.nextInt();
//		System.out.println("Ingresa el incremento en segundos");
//		base = sc.nextInt();
//		System.out.println("La hora nueva es:"+condicion.horaUsuario(n1, n2, n3, base));
		
		//Invertir las cifras de un entero
/*		System.out.println("ingresa un numero");
		n=sc.nextInt();
		System.out.println(ciclo.invertirNumero(n));*/
		
		//Adivinar numero
		/*String respuesta = "";
		Random rnd = new Random(System.nanoTime());
		n1 = rnd.nextInt(100);
		do {
			System.out.println("Adivina el numero");
			n2 = sc.nextInt();
			respuesta = ciclo.adivinar(n1, n2);
			System.out.println(respuesta);
		} while(!respuesta.equals("Lo adivinaste!"));
	*/
		//Determina si un numero es primo
//		int num = 0;
//		System.out.println("Ingresa un numero");
//		num = sc.nextInt();
//		System.out.println("El numero es: "+condicion.esprimo(num));
	
		//Imprime un cuadrado de *, de lado n
//		int numero = 0;
//		System.out.println("Ingresa el tamano de la matriz:");
//		numero = sc.nextInt();
//		System.out.println(ciclo.Matriz(numero));
		
//		System.out.println(Arreglos.hola());
		
		//Transforma un arreglo de numeros aleatorios a un arreglo de meses
//		Arreglos arreglo = new Arreglos();
//		Random rnd = new Random(System.nanoTime());
//		int[] nums = new int[10];
//		String[] mes = new String[10];
//		for(int i=0; i<nums.length; i++)
//			nums[i]=rnd.nextInt(12);
//		mes = arreglo.meses(nums);
//		for(int i=0; i<nums.length; i++) {
//			System.out.println("["+nums[i]+"] -> ["+mes[i]+"]");
//		}
		
		//Recorrer un arreglo con for each
		
		/*String[] arreglo = {"Hola", "Adios", "Ciao", "Salut", "Alo", "Au revoir", "Que rollo"};
		
		for(String temp : arreglo)
		{
			System.out.println(temp);
		}
		
		int[] arreglo2 = {10, 11, 5, 8, 6, 1672};
		int suma=0;
		for(int aux : arreglo2)
		{
			suma=suma+aux;
		}
		System.out.println(suma);*/
		
//		int[] aleatorios = new int[12];
//		String[] meses = new String[12];
//		
//		for(int i=0; i<aleatorios.length; i++)
//			aleatorios[i] = rnd.nextInt(12);
//		
//		meses = arreglo.numMes(aleatorios);
//		for(String temp : meses)
//		{
//			System.out.println(temp);
//		}
		
		//Suma dos arreglos de aleatorios
//		Random rnd = new Random(System.nanoTime());
//		System.out.println("Cual es el tamano de los arreglos?");
//		n1=sc.nextInt();
//		int[] random1 = new int[n1];
//		int[] random2 = new int[n1];
//		int[] resp = new int[n1];
//		
//		for(int i =0; i<n1; i++)
//		{
//			random1[i] = rnd.nextInt(100);
//			random2[i] = rnd.nextInt(100);
//		}
//		
//		resp = arreglo.sumaArreglos(random1, random2);
//		
//		for(int i=0; i<n1; i++)
//		{
//			System.out.println(random1[i] + " + "+random2[i]+" = "+resp[i]);
//		}
		
/*		ArrayList list = new ArrayList();
		list.add("Ulises");//Agregamos elementos a nuestra lista
		list.add(128);
		list.add(true);
		list.add('t');
		list.add(condicion);
		
		list.remove(4); //Quitamos el elemento en el indice 4
		//Verificamos si contiene algun elemento
		System.out.println("La lista contiene Ulises? "+list.contains("Ulises"));
		System.out.println("La lista contiene Axel? "+list.contains("Axel"));
		Iterator it = list.iterator(); //Creamos un iterador para recorrer la lista
		while(it.hasNext()) //El ciclo se efectua mientras haya mas elementos en la lista
		{
			System.out.println(it.next());
		}
		System.out.println("El tamano actual de la lista es: "+list.size());
	}*/
		
		//Pide numeros hasta que lee un negativo y calcula la media
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		int x = 0;
//		do {
//			System.out.println("Dame un numero");
//			x = sc.nextInt();
//			if(x>=0)
//				nums.add(x);
//		}while(x>=0);
//		x=arreglo.media(nums);
//		System.out.println("La media es: "+x);
		
		//Serie de fibonacci
//		System.out.println("Cuantos terminos quieres?");
//		n1 = sc.nextInt();
//		long[] serie = new long[n1];
//		serie=arreglo.fibonacci(n1);
//		for(long num : serie)
//			System.out.println(num);
		
		//Pilas
//		Stack<String> pila = new Stack<String>();
//		pila.push("Adal");
//		pila.push("Victor");
//		pila.push("Efren");
//		pila.push("La Yadis");
//		System.out.println("El tamano: "+pila.size());
//		//Peek nos muestra el elemento en la cima de la lista sin quitarlo
//		System.out.println("Ultimo elemento: "+pila.peek());
//		System.out.println("El tamano: "+pila.size());
//		//Pop nos muestra el elemento en la cima y lo quita de la pila
//		System.out.println("Ultimo elemento despues de peek: "+pila.pop());
//		System.out.println("El tamano: "+pila.size());
//		System.out.println("Ultimo elemento despues de pop: "+pila.peek());
//		//Get nos regresa el elemento en un indice determinado
//		System.out.println("El indice 1 "+pila.get(1));
//		while(pila.size()>0)
//			System.out.println(pila.pop());
		
		//Colas
//		PriorityQueue<String> cola = new PriorityQueue<String>();
//		cola.add("Ulises");
//		cola.add("Pacheco");
//		cola.add("Axel");
//		cola.add("Chino");
//		
//		Iterator it = cola.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		
//		//peek nos muestra el primer elemento de la cola
//		System.out.println("El primero "+cola.peek());
//		//poll nos muestra el primer elemento de la cola y lo saca de ella
//		System.out.println("El primero "+cola.poll());
//		System.out.println("El nuevo primero "+cola.peek());
//		//contains nos dice si nuestra cola contiene cierto elemento
//		System.out.println("Contiene Ulises? "+cola.contains("Ulises"));
//		System.out.println("Contiene Manu? "+cola.contains("Manu"));
//		//remove saca un elemento especificado de la cola
//		cola.remove("Pacheco");
		
		//TreeSet. No guarda elementos repetidos, y se ordena automaticamente
//		TreeSet<String> arbol = new TreeSet<String>();
//		arbol.add("Mario");
//		arbol.add("Cesar");
//		arbol.add("Mario");
//		arbol.add("Cesar");
//		
//		System.out.println("Elementos en el arbol: "+arbol.size());
//		Iterator it = arbol.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		System.out.println("Se agrego elemento Marco? "+arbol.add("Marco"));
//		System.out.println("Se agrego elemento Cesar? "+arbol.add("Cesar"));
//		System.out.println("Se agrego elemento cesar? "+arbol.add("cesar"));
//		//remove quita un elemento
//		arbol.remove("Marco");
//		//clear quita todos los elementos
//		arbol.clear();
		
		//HashTable. Contiene claves para cada una de sus entradas. No se pueden repetir
//		Hashtable<Integer, String> hash = new Hashtable<Integer, String>(); //Se define el tipo de dato de la clave, y el del valor.
//		hash.put(1, "Yareli");
//		hash.put(2, "Alan");
//		//Al repetir una clave se sobreescribe el valor
//		hash.put(2, "Manu");
//		//Hashtable se recorre con Enumeration en lugar de iterator
//		Enumeration en = hash.keys();
//		while(en.hasMoreElements()) {
//			int clave = (int)en.nextElement();
//			System.out.println(clave+" - "+hash.get(clave));
//		}
//		hash.put(5, "Osvaldo");
//		hash.put(3, "Alan");
//		//Podemos comprobar si nuestra Hashtable ya contiene una clave con:
//		System.out.println("Ya existe la clave 3? "+hash.containsKey(3));
//		System.out.println("Ya existe la clave 4? "+hash.containsKey(4));
		
		//TreeMap. Incluye una clave por cada valor, y se ordena automaticamente de acuerdo a las claves
//		TreeMap<String, Integer> tmap = new TreeMap<>();
//		tmap.put("Michelle", 90);
//		tmap.put("Oscar", 95);
//		tmap.put("Alan", 91);
//		tmap.put("Yareli", 89);
//		Iterator it = tmap.keySet().iterator();
//		while(it.hasNext()) {
//			String clave = (String)it.next();
//			System.out.println(clave+"-->"+tmap.get(clave));
//		}
//		//Quitamos un valor con su llave
//		tmap.remove("Yareli");
		
		//Recorrer un arreglo de numeros un lugar
//		int[] numeros = {1,2,3,4,5,6,7,8,9,0};
//		for(int j=0; j<4; j++)
//		{
//		for(int i:numeros)
//			System.out.print(i+" ");
//		System.out.println();
//		numeros=arreglo.recorrer(numeros);
//		}
		
//		Stack<Integer> numeros = new Stack<>();
//		ArrayList<Integer> nuevoNum = new ArrayList<>();
//		for(int i=0; i<10; i++)
//			numeros.push(i);
//		for(int i=0; i<numeros.size(); i++)
//		{
//			System.out.print(numeros.get(i)+" ");
//		}
//		nuevoNum = arreglo.recorrerPila(numeros);
//		System.out.println();
//		for(int i=0; i<numeros.size(); i++)
//		{
//			System.out.print(nuevoNum.get(i)+" ");
//		}
		
		//Recorrer el contenido de un arreglo una posicion
//		int[] arreglo1 = {1,2,3,4,5,6,7,8,9,0};	
//		for(int i : arreglo1)
//			System.out.print(i+" ");
//		System.out.println();
//		arreglo1 = arreglo.recorrido(arreglo1);
//		for(int i : arreglo1)
//			System.out.print(i+" ");
		
		
//		Archivos archivo = new Archivos();
//		String lorem = "";
//		lorem = archivo.leer("C:\\Users\\Elia M\\Desktop\\prueba.txt");
//		System.out.println(lorem);
////		lorem = archivo.vocales(lorem);
////		System.out.println(lorem);
//		lorem=lorem.replace('a', '_');
//		lorem=lorem.replaceAll("[eiou]", "_");
//		System.out.println(lorem);
//
//		archivo.escribir("C:\\Users\\Elia M\\Desktop\\lorem2.txt", lorem);
	}
}
