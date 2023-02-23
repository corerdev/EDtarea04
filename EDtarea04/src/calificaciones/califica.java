package calificaciones;

public class califica {

	/**
	 * @param num_nota
	 * @return calificacion en forma de string según la nota pasada
	 * @author Core
	 * @since 23/02/2023
	 * Este es el metodo que se ha ido generando a lo largo de la tarea.
	 * Tiene como objetivo devolver un string que luego se imprimira, basado en la nota que se ha pasado.
	 */
	public static String calificadios(int num_nota) {
		String resultado;
		if (num_nota >= 0 && num_nota < 5)
		resultado = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
		resultado = "Aprobado";
		else if (num_nota >= 7 && num_nota <9)
		resultado = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
		resultado = "Sobresaliente";
		else
		resultado = "El valor de la calificación introducida no es correcta";
		return resultado;
	}
	
}
