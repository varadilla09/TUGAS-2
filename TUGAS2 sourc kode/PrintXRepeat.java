// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/09:50

import java.util.Scanner;

/* contoh baca nilai yang dibaca dengan ITERATE */
/* jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXRepeat {
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

		System.out.print ("Masukan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();  /* First Elmt */

		if (x == 999) {
			System.out.print ("Kasus kosong \n");
		}else {   /* Minimal ada satu data yang dijumlahkan */

		Sum = 0;	/* Inisialisasi; invariant !! */
		do{
			Sum = Sum + x; /* proses */
			System.out.print ("masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt(); 		/* Next Elmt */
		} while (x != 999);		/* Kondisi pengulangan */
			System.out.println ("Hasil penjumlahan = "+ Sum);
		/* Terminasi */
		}
	}
}


