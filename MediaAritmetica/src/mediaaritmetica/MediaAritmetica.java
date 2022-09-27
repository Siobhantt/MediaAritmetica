package mediaaritmetica;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		//Declaramos el Scanner
		Scanner media = new Scanner(System.in);
		
		//Solicitamos al usuario la primera nota y la guardamos en la variable nota1
		System.out.println("Introduzca la primera nota: ");
		double nota1 = media.nextInt();
		
		//Solicitamos al usuario la segunda nota y la guardamos en la variable nota2
		System.out.println("Introduzca la segunda nota: ");
		double nota2 = media.nextInt();
		
		//Realizamos la operacion
		double notaA = nota1 + nota2;
		double notaB = notaA/2;
		
		//Imprimimos el resultado
		System.out.println("LA NOTA MEDIA ES: " + notaB);
		
		//Cerramos Scanner
		media.close();
		// TODO Auto-generated method stub

	}

}
