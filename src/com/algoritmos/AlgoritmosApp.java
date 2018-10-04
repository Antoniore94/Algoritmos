package com.algoritmos;

import java.util.Random;
import java.util.Scanner;

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
		Ciclos ciclo = new Ciclos();
		Condicionales condicion = new Condicionales();
		
//		Pedir base y exponente, calcular resultado
//		System.out.println("Dame la base");
//		base = sc.nextInt();
//		System.out.println("Dame el exponente");
//		exp = sc.nextInt();
//		System.out.println("El resultado es: "+ciclo.potencia(base, exp));
//		
		//Decir si un alumno paso o no, de acuerdo a calificaciones y asistencia
//		System.out.println("Cual es tu calificacion?");
//		calificacion = sc.nextInt();
//		System.out.println("Cuantas asistencias tienes?");
//		asistencia = sc.nextInt();
//		System.out.println("Pasaste: "+condicion.acreditar(asistencia, calificacion));
		
		//Calcular el salario tomando en cuenta horas extra
//		System.out.println("Ingresa tu salario:");
//		salario = sc.nextDouble();
//		System.out.println("Ingresa las horas que trabajaste:");
//		horas = sc.nextDouble();
//		System.out.printf("Tu sueldo total es: "+condicion.salario(salario, horas));
		
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
		
	}
	
}
