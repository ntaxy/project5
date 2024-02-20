/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Nmedia_Comp
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan bulan");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.matches("[0-9]+")) {
            int angkaBulan = Integer.parseInt(input);
            if (angkaBulan >= 1 && angkaBulan <= 12) {
                String namaBulan = "";
                if (angkaBulan == 1) {
                    System.err.println("januari");
                } else if (angkaBulan == 2) {
                    System.err.println ("februari");
                } else if (angkaBulan == 3) {
                    System.err.println("maret");
                } else if (angkaBulan == 4) {
                    System.err.println ("april"); 
                } else if (angkaBulan == 5) {
                    System.err.println("mei");  
                } else if (angkaBulan == 6) {
                    System.err.println("juni");   
                } else if (angkaBulan == 7) {
                    System.err.println("juli");
                } else if (angkaBulan == 8) {
                    System.err.println("agustus");
                } else if (angkaBulan == 9) {
                    System.err.println("september");   
                } else if (angkaBulan == 10) {
                    System.err.println ("oktober");   
                } else if (angkaBulan == 11) {
                    System.err.println ("november");   
                } else if (angkaBulan == 12) {
                    System.err.println ("desember");   
                }
            } else {
                System.out.println("Masukkan bulan");
            }
        } else {
            String namaBulan = input.toLowerCase();
            int angkaBulan = 0;
            if (namaBulan.equals("januari")) {
                angkaBulan = 1;
            } else if (namaBulan.equals("februari")) {
                angkaBulan = 2;
            } else if (namaBulan.equals("maret")) {
                angkaBulan = 3;
            } else if (namaBulan.equals("april")) {
                angkaBulan = 4;
            } else if (namaBulan.equals("mei")) {
                angkaBulan = 5;
            } else if (namaBulan.equals("juni")) {
                angkaBulan = 6;
            } else if (namaBulan.equals("juli")) {
                angkaBulan = 7;
            } else if (namaBulan.equals("agustus")) {
                angkaBulan = 8;
            } else if (namaBulan.equals("september")) {
                angkaBulan = 9;
            } else if (namaBulan.equals("oktober")) {
                angkaBulan = 10;
            } else if (namaBulan.equals("november")) {
                angkaBulan = 11;
            } else if (namaBulan.equals("desember")) {
                System.err.println("12");
          
            } else {
            } 
            if (angkaBulan != 0) {
                System.err.println(angkaBulan);
            } else {
                System.out.println("Input tidak valid");
            }
        }
    }
}

