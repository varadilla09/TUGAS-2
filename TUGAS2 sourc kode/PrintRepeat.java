// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/08:40

import java.util.Scanner;

	public class PrintRepeat {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		/* kamus */
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		/* program */

		System.out.print ("Nilai N >0 = ");
		/* Inisialisasi */
		N = masukan.nextInt();

		i = 1;
		/* First Elmt */
		System.out.print ("Print i dengan REPEAT \n");
		do{
			System.out.print (i+"\n"); /* proses */
			i++; /*Next Elmt */
		}
		
		while (i <= N) ; /* Kondisi pengulangan */
	}
}
