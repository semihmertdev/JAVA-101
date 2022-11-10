package KosulluIfadeler;
import java.util.Scanner;

public class UcakBileti {
	public static void main(String[] args) {

        int yaşı, yolculuktipi;
        double normaltutar, mesafe, gencfiyatı, cocukfiyatı, yaşlıfiyatı, km = 0.10, küçükindirimi, gençindirimi, yaşlıindirimi;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafenizi giriniz: ");
        mesafe = input.nextDouble();
        normaltutar = mesafe * km;
        System.out.println("normal tuatarınız: " + normaltutar);
        System.out.print("gidiş-dönüş ise 1'e tek yön ise 2'ye basınız: ");
        yolculuktipi = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yaşı = input.nextInt();

        if ((0 < yaşı && yaşı < 12) && (yolculuktipi == 1)) {
            küçükindirimi = normaltutar * 0.5;
            cocukfiyatı = normaltutar - küçükindirimi;
            double gidişdönüş = cocukfiyatı * 0.20;
            double gidişdönüşfiyatı = cocukfiyatı - gidişdönüş;
            System.out.print("Çocuk gidiş dönüş ücreti: " + gidişdönüşfiyatı);
        }
        else if ((0 < yaşı && yaşı < 12) && (yolculuktipi == 2)) {
            küçükindirimi = normaltutar * 0.5;
            cocukfiyatı = normaltutar - küçükindirimi;
            System.out.print("cocuk tek yön ücreti:" + cocukfiyatı);
        }
        else if ((12 < yaşı && yaşı < 65) && (yolculuktipi == 1)) {
            gençindirimi = normaltutar * 0.10;
            gencfiyatı = normaltutar - gençindirimi;
            double gidişdönüşgenç = gencfiyatı * 0.20;
            double gidişdönüşgençfiyatı = gencfiyatı - gidişdönüşgenç;
            System.out.print("Genç gidiş dönüş ücreti: " + gidişdönüşgençfiyatı);
        }
        else if ((12 < yaşı && yaşı < 65) && (yolculuktipi == 1)) {
            gençindirimi = normaltutar * 0.10;
            gencfiyatı = normaltutar - gençindirimi;
            System.out.print("Genç tek yön ücreti:" + gencfiyatı);
        }
        else if (yaşı > 65 && yolculuktipi == 1) {
            yaşlıindirimi = normaltutar * 0.10;
            yaşlıfiyatı = normaltutar - yaşlıindirimi;
            double gidişdönüşyaşlı = yaşlıfiyatı * 0.20;
            double gidişdönüşyaşlıfiyatı = yaşlıfiyatı - gidişdönüşyaşlı;
            System.out.print("Yaşlı gidiş dönüş ücreti: " + gidişdönüşyaşlıfiyatı);
        }
        else if (yaşı > 65 && yolculuktipi == 2) {
            yaşlıindirimi = normaltutar * 0.10;
            yaşlıfiyatı = normaltutar - yaşlıindirimi;
            System.out.print("yaşlı tek yön ücreti:" + yaşlıfiyatı);
        }


    }
}
