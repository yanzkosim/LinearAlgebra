package com.matrix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Matrix Calculator (square type matrices)");
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1. Find Determinant using OBE");
			System.out.println("2. Find value of variables using OBE");
			System.out.println("3. Determinant using upper triangle (change the row by urserf if necessary, add minus mark after calculate)");
			System.out.println("0. Exit");
			
			int pick = scanner.nextInt();
			if(pick == 0) break;
			else if(pick == 1) {
				InverseOBE dOBE = new InverseOBE();
				dOBE.hitung();
			}
			else if(pick == 2) {
				LinearCalculation lc = new LinearCalculation();
				lc.hitung();
			}
			else if(pick == 3) {
				UpperTriangle ut = new UpperTriangle();
				ut.hitung();
			}
		}
	}
}
