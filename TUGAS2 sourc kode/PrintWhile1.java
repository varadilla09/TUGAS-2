// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/09:10

import java.util.Scanner;

/* Baca N, */
/* Print i= 1 s/d N dengan while (ringkas) */

	public class PrintWhile1 {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/* kamus : */
			int N;
			int i = 1;
			Scanner masukan=new Scanner(System.in);
			/* program */

			System.out.print ("nilai N >00 = ");
			N = masukan.nextInt();
			System.out.print ("print i dengan WHILE (ringkas): \n");
			while (i <= N) {
				System.out.println (i++);
			} /* (i > N) */
		}
	}