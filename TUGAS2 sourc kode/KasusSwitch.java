// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/07:45


import java.util.Scanner;

public class KasusSwitch {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* kamus */
		char CC;
		Scanner masukan=new Scanner(System.in);
		/* program */
		System.out.print ("ketikkan sebuah huruf, akhiri dengan RETURN \n");
		CC=masukan.next().charAt(0);
		switch (CC) {
			case 'a': {System.out.print ("yang anda ketikkan adalah a \n"); 	break;}
			case 'u': {System.out.print ("yang anda ketikkan adalah u \n");	break;}
			case 'e': {System.out.print ("yang anda ketikkan adalah e \n"); 	break;}	
			case 'i': {System.out.print ("yang anda ketikkan adalah i \n");
	break;}
			case 'o': {System.out.print ("yang anda ketikkan adalah o \n");
	break;}
			default:
				System.out.print ("yang anda ketikkan adalah huruf mati	\n");
		}
	}
}