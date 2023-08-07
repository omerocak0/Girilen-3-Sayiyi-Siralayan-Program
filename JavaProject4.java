package javaProject;
import java.util.Scanner;
public class JavaProject4 {
	
	/* Methot ile üç sayıyı kıyaslama */

	public static void main(String[] args) {
		sayiKiyaslama();
	}
	
	public static void sayiKiyaslama()  {
		
		
		int sayi1, sayi2, sayi3;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("1. Sayiyi girin: ");
		sayi1 = scan.nextInt();
		
		System.out.println("2.sayiyi girin: ");
		sayi2 = scan.nextInt();
		
		System.out.println("3. Sayiyi girin: ");
		sayi3 = scan.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			if(sayi2>sayi3) {
				System.out.println("Siralama: " + sayi1 + ">" + sayi2 + ">" +  sayi3);
			}
			
			else if(sayi2<sayi3) {
				System.out.println("Siralama: " + sayi1 + ">" + sayi3 + ">" +  sayi2);
			}
			
			else if(sayi2 == sayi3) {
				System.out.println("Siralama: " + sayi1 + ">" + sayi3 + "=" +  sayi2);
			}
			
		}
		
		
		
		else if (sayi2>sayi1 && sayi2>sayi3) {
			if (sayi1>sayi3) {
				System.out.println("Siralama: " + sayi2 + ">" + sayi1 + ">" +  sayi3);
			}
			else if (sayi1<sayi3) {
					System.out.println("Siralama: " + sayi2 + ">" + sayi3 + ">" +  sayi1);
			}
				
			else if (sayi1 == sayi3) {
					System.out.println("Siralama: " + sayi2 + ">" + sayi3 + "=" +  sayi1);
			}
		}
		
		
		else if (sayi3>sayi1 && sayi3>sayi2) {
			if (sayi1>sayi2) {
				System.out.println("Siralama: " + sayi3 + ">" + sayi1 + ">" +  sayi2);
			}
			else if (sayi1<sayi2) {
				System.out.println("Siralama: " + sayi3 + ">" + sayi2 + ">" +  sayi1);
			}
			else if (sayi1 == sayi2) {
				System.out.println("Siralama: " + sayi3 + ">" + sayi2 + "=" +  sayi1);
			}
		}
		
		
		
		else {
			System.out.println("Siralama: " + sayi1 + "=" + sayi2 + "=" +  sayi3);
		}
	}
	
}
