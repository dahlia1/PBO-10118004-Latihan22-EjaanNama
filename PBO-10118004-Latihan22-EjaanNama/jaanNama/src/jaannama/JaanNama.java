/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaannama;

import java.util.Scanner;

/**
 *
 * @author ASUS A411UF
 */
public class JaanNama {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        System.out.print("Masukkan nama depan anda untuk di eja : ");
		Scanner scanner = new Scanner(System.in);
		String namaLengkap = scanner.next();
		System.out.println("Ejaan untuk \"" + namaLengkap + "\" adalah : ");
		for(int i = 0; i < namaLengkap.length(); i ++)
			System.out.println("Huruf ke-" + (i+1) + " : " + namaLengkap.charAt(i));
    }
}

