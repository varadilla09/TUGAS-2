// NAMA		: VARA DILLA
// NIM		: 13020210130
// HARI/TGL/WAKTU : Sabtu/18-03-2023/08:00



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* kamus */
		String str;

		BufferedReader datAIn = new BufferedReader (new InputStreamReader (System.in));
		/* program */

		System.out.print ("\nBaca string dan integer: \n");

		System.out.print ("masukkan sebuah string: ");

		str= datAIn.readLine();

		System.out.print ("String yang dibaca : "+ str);

	}
}
