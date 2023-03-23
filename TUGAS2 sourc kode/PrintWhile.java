// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/09:00

import java.util.Scanner;

	/* Baca N, Print i = 1 s/d N dengan WHILE */
	public class PrintWhile {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated mehod stub
			/* kamus : */
			int N;
			int i;
			Scanner masukan=new Scanner(System.in);
			/* program */

			System.out.print ("Nilai N >0 = "); /* inisialisasi */
			N = masukan.nextInt();
			i = 1; /* First Elmt */

			System.out.print ("Print i dengan WHILE: \n");
			while (i <= N) /* kondisi pengulangan */
			{ System.out.println (i); /* proses */

			i++;  /* Next Elmt */
			};  /* (i > N) */
		}
	}