// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/08:15

import java.util.Scanner;

/* baca N, Print 1 s/d N dengan FOR */

	public class PriFor {

	/**
	 * @param args
	 */

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		/* kamus */
		int i,N;
		Scanner masukan=new Scanner(System.in);
		/* program */
		/* program */

		System.out.print ("Baca N, print 1 s/d N ");
		System.out.print ("N = ");

		N=masukan.nextInt();

		for (i = 1; i <= N; i++) {
		System.out.println (i); };
		System.out.println ("Akhiri program \n");
	}
}