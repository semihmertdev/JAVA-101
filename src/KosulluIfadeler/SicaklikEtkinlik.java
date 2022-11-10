package KosulluIfadeler;

import java.util.Scanner;

public class SicaklikEtkinlik { 
	public static void main(String[] args) {
		

		int sicaklik;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Hava sıcaklığını giriniz: ");
		sicaklik = input.nextInt();
		if(sicaklik<5) {
			System.out.println("Bu havada kayak yapabilirsiniz.");
		}
		
		if(sicaklik>=5 && sicaklik <=15) {
			System.out.println("Bu havada sinemaya gidebilirsiniz.");
		}
		
		if(sicaklik>=15 && sicaklik<=25) {
			System.out.println("Bu havada pikniğe gidebilirsiniz.");
		}
		if(sicaklik>25) {
			System.out.println("Bu havada yüzmeye gidebilirsiniz.");
		}
		
		
	}

}
