// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Rabu/22-03-2023/10:10

import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
/* prosedur/fungsi */

public class SubProgram {
	/**
	 * @param args
	 */
	public static int maxab (int a, int b) {
		/* mencari maksimum dua bilangan bulat */
		return ((a >= b) ? a : b);
		}

		public static void tukar (int a, int b)
		{ /* menukar dua bilangan bulat */
			int temp;
			temp = a;
			a = b;
			b = temp;
			System.out.println ("ke dua bilangan setelah ditukar: a ="
			+ a +" b = "+ b);
			}

		/*** program utama ***/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/* membaca dua bilangan integer */
			/* menuliskan maksimum dua bilangan yang dibaca dg memanggil 			fgsi*/
			/* menukar kedua bilangan dengan 'prosedur' */
				int a, b;
				Scanner masukan=new Scanner(System.in);
				System.out.print ("Maksimum dua bilangan \n");
				System.out.print ("ketikan dua bilangan, pisahkan dg RETURN : \n");
				a = masukan.nextInt();
				b = masukan.nextInt();
				System.out.println ("ke dua bilangan : a ="+ a +"b = "+ 				b);
				System.out.println ("Maksimum = " + (maxab(a, b)));
				System.out.print ("Tukar kedua bilangan ...\n");

				tukar (a, b);
			}
		}








