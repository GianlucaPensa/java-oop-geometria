package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci altezza e base : ");
		
		Rettangolo r1 = new Rettangolo(scan.nextInt(), scan.nextInt());
		
		
		int a = r1.calcolaArea();
		
		int p = r1.calcolaPerimetro();
		
		System.out.println("Il tuo rettangolo ha un perimetro di " + p + "cm e un area di " + a + " cm^2");
		
		
		scan.close();
	}

}
