/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_1;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */
public class Soal_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (n>=1): ");
        int n = input.nextInt();

        if (n >= 1) {
            System.out.println("Bilangan dari 1 sampai " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Masukkan nilai n yang valid (n>=1).");
        }
        
        input.close();
    }
}
