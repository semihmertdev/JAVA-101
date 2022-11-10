package KosulluIfadeler;

import java.util.Scanner;

public class CinZodyagi {
public static void main(String[] args) {
	Scanner inp= new Scanner(System.in);
	
	int sayi1, sayi2, sonuc;
	
	System.out.print("Doğum Yılınızı Giriniz: ");
	sayi1=inp.nextInt();
	sayi2=12;
	sonuc=sayi1%sayi2;
	
	if (sonuc==0){
		System.out.println("Çin Zodyağı Burcunuz : Maymun");
	}
	else if(sonuc==1) {
		System.out.println("Çin Zodyağı Burcunuz : Horoz");
	}
	else if(sonuc==2) {
		System.out.println("Çin Zodyağı Burcunuz : Köpek");
	}
	else if(sonuc==3) {
		System.out.println("Çin Zodyağı Burcunuz : Domuz");
	}
	else if(sonuc==4) {
		System.out.println("Çin Zodyağı Burcunuz : Fare");
	}
	else if(sonuc==5) {
		System.out.println("Çin Zodyağı Burcunuz : Öküz");
	}
	else if(sonuc==6) {
		System.out.println("Çin Zodyağı Burcunuz : Kaplan");
	}
	else if(sonuc==7) {
		System.out.println("Çin Zodyağı Burcunuz : Tavşan");
	}
	else if(sonuc==8) {
		System.out.println("Çin Zodyağı Burcunuz : Ejderha");
	}
	else if(sonuc==9) {
		System.out.println("Çin Zodyağı Burcunuz : Yılan");
	}
	else if(sonuc==10) {
		System.out.println("Çin Zodyağı Burcunuz : At");
	}
	else if(sonuc==11){
		System.out.println("Çin Zodyağı Burcunuz : Koyun");
	}
	
	}
}
