package notas;

import java.util.Scanner;

import calificaciones.califica;

public class Notas {
	
	/**
	 * @author Core
	 * @param args
	 * @version 1
	 * @since 23-02-2023
	 * Metodo que se basa en que el usuario nos pase una nota, y convertir esa nota en una calificación
	 * para luego imprimirla por pantalla.
	 */

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int notaza = 0; //la variable en la que se va a almacenar la nora
String resultadoA = ""; // la variable en la que se almacenara el resultado
System.out.print("Introduzca el valor de una calificación: ");
notaza = reader.nextInt(); //lee la nota que introduce el usuario

resultadoA = califica.calificadios(notaza); //este es el metodo que creamos a lo largo de la tarea, el que nos da el resultado basandose en la nota.

System.out.println(resultadoA); //imprime el resultado que nos da el metodo anterior.
reader.close();

	
}

/**
 * @param nota
 * @return
 * @deprecated Use {@link calificaciones.califica#califica(int)} instead
 * Método restante de la evolución de la tarea.
 *
public static String cali(int nota) {
	return calificaciones.califica.califica(nota);
}
*/
/**
 * @param num_nota
 * @return
 * @deprecated Use {@link califica#califica(int)} instead
 * Método restante de la evolución de la tarea.
 
public static String califica(int num_nota) {
	return califica.califica(num_nota);
}*/
}