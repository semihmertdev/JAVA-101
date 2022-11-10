package KosulluIfadeler;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders;
import javax.swing.undo.CannotUndoException;

public class SinifGecmeDurumu {
	public static void main(String[] args) {
		
		int mat,fizik,turkce,kimya,muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();
		if (mat<0 || mat>100) {
			System.out.println("Yanlış ders notu girdiniz.");
			mat=0;
		}
		
		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();
		if (fizik<0 || fizik>100) {
			System.out.println("Yanlış ders notu girdiniz.");
			fizik=0;
		}
		
		System.out.print("Türkçe notunuz: ");
		turkce = input.nextInt();
		if (turkce<0 || turkce>100) {
			System.out.println("Yanlış ders notu girdiniz.");
			turkce=0;
		}
		
		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();
		if (kimya<0 || kimya>100) {
			System.out.println("Yanlış ders notu girdiniz.");
			kimya=0;
		}

		System.out.print("Müzik notunuz: ");
		muzik = input.nextInt();
		if (muzik<0 || muzik>100) {
			System.out.println("Yanlış ders notu girdiniz.");
			muzik=0;
		}
		
		double ortalama= (mat+fizik+turkce+kimya+muzik)/5;
		System.out.println("Ortalamanız:" +ortalama);
		
		if (ortalama<55){
			System.out.println("Sınıfta Kaldınız!");
			}
		else {
			System.out.println("Sınıfı Geçtiniz!");
		}
		
		
	}

}
