// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/07:20

import java.util.Scanner;

/* contoh pemakaian IF tiga kasus */ /* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */
/* 'Nilai Nol , nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

	public class If3 {
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/* kamus */
			int a;
			Scanner masukan=new Scanner(System.in);
			/* program */
			System.out.print ("Contoh IF tiga kasus \n");
			System.out.print ("Ketikkan sesuatu nilai integer :");
			a=masukan.nextInt();
			if (a > 0) {
				System.out.println ("Nilai a positif "+ a);
			}else if (a == 0){
				System.out.println ("Nilai nol "+ a);
			}else /* a > 0 */ {
				System.out.println ("Nilai a negatif "+ a);
			}
		}
	}
