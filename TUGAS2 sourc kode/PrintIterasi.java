// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/08:30

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */

public class PrintIterasi {
	/**
	 * @param args
	 */

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		/* kamus : */
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		/* program */
		System.out.print ("Nilai N >0 = "); /* inisialisasi */
		N = masukan.nextInt();

		i = 1; 	/* First Elmt */
		System.out.print ("Print i dengan ITERATE : \n");
		for (;;) {
			System.out.println(i); /* proses */
			if (i == N)
				/* Kondisi berhenti */ break;
			else {
				i++; /* Next Elmt */
			}
		} /* (i == N) */

	}
}