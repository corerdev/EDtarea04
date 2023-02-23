package notas;

import java.util.Scanner;

import calificaciones.califica;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int notaza = 0;
String resultadoA = "";
System.out.print("Introduzca el valor de una calificación: ");
notaza = reader.nextInt();

resultadoA = calificaciones.califica.califica(notaza);

System.out.println(resultadoA);
reader.close();
}

/**
 * @param nota
 * @return
 * @deprecated Use {@link calificaciones.califica#califica(int)} instead
 */
public static String cali(int nota) {
	return calificaciones.califica.califica(nota);
}

/**
 * @param num_nota
 * @return
 * @deprecated Use {@link califica#califica(int)} instead
 */
public static String califica(int num_nota) {
	return califica.califica(num_nota);
}
}