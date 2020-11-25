package com.matrix;

import java.util.Scanner;

public class UpperTriangle extends Rounding{
	public void hitung() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Input orde : ");
		int x = scanner.nextInt();
		System.out.print("Input accuracy : ");
		coma = scanner.nextInt();
		
		double[][] mat = new double[x][x];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("How many times do you swapping the rows?");
		int swap = scanner.nextInt();
		
		int counter = 1;
		
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j) {
					continue;
				}
				if(mat[j][i] != 0) {
					double opr = rounding(mat[j][i]/mat[i][i]);
					for(int k=0; k<x; k++) {
						mat[j][k] = mat[j][k] - (rounding(opr*mat[i][k]));
					}
					System.out.println(counter);
					print(mat, x);
					counter++;
					System.out.println();
					continue;
					
				}
			}
		}
		double res = 1;
		for(int i=0; i<x; i++) {
			res *= mat[i][i];
		}
		
		if(swap%2 != 0) {
			res *= -1;
		}
		System.out.println("Determinant : " + res);
	}
	
	private void print(double[][] mat, int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
