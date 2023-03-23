// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Sabtu/18-03-2023/10:25

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {
	/**
	 * @paam args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* kamus */
		Scanner masukan=new Scanner(System.in);
		int a;
		/* Program */

		System.out.print ("Contoh IF satu kasus \n");
		System.out.print ("Ketikkan sesuatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0)
		System.out.print ("\nNilai a positif "+ a);

	}
}