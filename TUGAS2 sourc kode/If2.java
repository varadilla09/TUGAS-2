// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Minggu/19-03-2023/15:25

import java.util.Scanner;

/* contoh pemakaian IF dua kasus komplementer */
/* Memebaca sebuah nilai, */
/* menuliskan nilai a positif, nilai a, jika a>= 0*/
/*	'Nilai a negatif, nilai a', jika a <0	*/

public class If2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto_generated method stub
		/* kamus */
		int a;
		Scanner masukan=new Scanner(System.in);
		/* program */

		System.out.print ("Contoh IF dua kasus \n");

		System.out.print ("Ketikkan suatu nilai integer :");
		a=masukan.nextInt ();

		if (a >= 0) {
			System.out.println ("nilai a positif "+ a);
		} else /* a< 0 */ {
			System.out.println ("Nilai a negatif "+ a);
			}
	

	}
}