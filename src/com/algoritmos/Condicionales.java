package com.algoritmos;

public class Condicionales {

	public boolean acreditar(int asistencia, int calificacion) {
		final int totalAsist = 70;
		boolean paso = false;

		if (asistencia >= (totalAsist * .8) && calificacion >= 60)
			paso = true;

		return paso;
	}

	public double salario(double salario, double horas) {

		// preguntar a un trabajador horas y salario y las horas despues de 40
		// se pagan a 1.5
		if (salario != 0 && horas != 0) {
			if (horas >= 40)
				salario = (salario * 40) + (horas - 40) * (salario * 1.5);
			else
				salario = salario * horas;
		}
		return salario;
	}

	public int medio(int n1, int n2, int n3) {

		if (n1 < n2 && n1 > n3 || n1 > n2 && n1 < n3) {
			return n1;
		} else if (n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3) {
			return n2;
		} else {
			return n3;
		}
	}

	public String horaUsuario(int hora, int minuto, int segundo, int segundouser) {
		if (segundouser != 0) {
			segundo += segundouser;
			if (segundo > 59) {
				minuto += segundo / 60;
				segundo = segundo % 60;
				if (minuto > 59) {
					hora += minuto / 60;
					minuto = minuto % 60;
					if (hora > 23) {
						hora = (hora % 24);// hora
					}
				}
			}
		}
		return ("hora: " + hora + "  minuto: " + minuto + "  segundo: " + segundo + "");
	}

	public boolean esprimo(int num) {
		int contador = 2;
		boolean primo = true;
		if (num == 1)
			return primo;
		while ((primo) && (contador != num)) {
			if (num % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

}
