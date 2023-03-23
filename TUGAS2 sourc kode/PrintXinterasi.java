// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/09:30

import java.util.Scanner;

/* contoh baca nilai x, */
/* jumlah nilai yang dibaca dengan ITERATE */

	public class PrintXinterasi {
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/* kamus : */
			int Sum=0;
			int x;
			Scanner masukan=new Scanner (System.in);
			/* program */
			System.out.print ("masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt(); /* First Elmt */
			if (x == 999) {
				System.out.print ("kasus kosong \n");
			}else { /* Minimal ada satu data yang dijumlahkan */
			
				Sum = x; /* Inisialisasi; invariant !! */
				for (;;) {
					System.out.print ("Masukkan nilai x (int), akhiri dg 		999 : ");
				x = masukan.nextInt(); /* Next Elmt */
				if(x==999)
					break;
				else{
					Sum = Sum + x;   /* proses */
					}
				}
			}
			System.out.println ("Hasil penjumlahan = "+ Sum);
		/* Terminasi */
		}
	}




















