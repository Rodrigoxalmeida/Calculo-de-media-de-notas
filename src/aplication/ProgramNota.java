package aplication;

import java.util.Scanner;
import java.util.Locale;

import entities.Notas;

public class ProgramNota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1,n2,n3,media;
		
		System.out.print("N1: ");
		n1 = sc.nextFloat();
		System.out.print("N2: ");
		n2 = sc.nextFloat();
		System.out.print("N3: ");
		n3 = sc.nextFloat();
		
		media = Notas.mediaNota(n1, n2, n3);
		
		System.out.println("Media das 3 notas: " + media);
		System.out.println("Maior nota: " + Notas.maxNota(n1, n2, n3));
		System.out.println("Menor nota: " + Notas.minNota(n1, n2, n3));
		System.out.println("media das 2 mais altas: " + Notas.mediaMax(n1, n2, n3));
		System.out.println("Media da maior e menor nota: " + Notas.mediaMaxMin(n1, n2, n3));
		sc.close();

	}

}
