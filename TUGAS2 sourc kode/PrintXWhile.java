// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/08:55

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahlkan nilai yang dibaca dengan WHILE */

public class PrintXWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* kamus : */
		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);
		/* program */
		Sum = 0;		/* Inisialisasi */

		System.out.print ("Masukan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();	/* First Elmt */
		while (x != 999)		/* kondisi berhenti */ {
			Sum = Sum + x;	/* Proses */
			System.out.print("Masukan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();	/* First Elmt */
			}
			System.out.println ("hasil penjumlahan = "+ Sum);
			/* Terminasi */
		}
	}