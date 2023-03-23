// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/07:55

import java.util.Scanner;

/* membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */

	public class Konstant {
	
	/**
	 * @param args
	 */

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		/* kamus */
			final float PHI = 3.1415f;
			float r;
			Scanner masukan=new Scanner(System.in);
		/* program */ /* baca data */

			System.out.print ("Jari-jari lingkaran =");
			r = masukan.nextFloat();
		/* Hitung dan tulis hasil */
			System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
			System.out.print ("Akhiri program \n");
		}
	}