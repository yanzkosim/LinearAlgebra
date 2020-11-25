package com.matrix;

import java.util.Scanner;

public class LinearCalculation extends Rounding{

	public void hitung() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Number of variables : ");
		int x = scanner.nextInt();
		System.out.print("Input accuracy : ");
		coma = scanner.nextInt();
		
		double[][] mat = new double[x][x];
		double[] eq = new double [x];
		System.out.println("Input only the constant consecutively from a,b,c,d,....,z");
		System.out.println("For example : x+y+z = 3\nInput : 1 1 1 3");
		
		for(int i=0; i<x; i++) {
			System.out.print("Equation ");
			System.out.print(i+1);
			System.out.print(" : ");
			for(int j=0; j<x; j++) {
				mat[i][j] = scanner.nextDouble();
			}
			eq[i] = scanner.nextDouble();
		}
		
		int counter = 1;
		
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j && mat[j][i] != 1) {
					double opr = mat[j][i];
					for(int k=0; k<x; k++) {
						if(mat[j][k] != 0)
							mat[j][k] = rounding(mat[j][k]/opr);
					}
					eq[j] = rounding(eq[j]/opr);
					System.out.println(counter);
					print(mat,eq, x);
					counter++;
					System.out.println();
					continue;
				}
				if(mat[j][i] != 0 && i!=j) {
					double opr = rounding(mat[i][i]*mat[j][i]);
					for(int k=0; k<x; k++) {
						mat[j][k] = mat[j][k] - (rounding(opr*mat[i][k]));
					}
					eq[j] = eq[j] - (rounding(opr * eq[i]));
					System.out.println(counter);
					print(mat, eq, x);
					counter++;
					System.out.println();
					continue;
					
				}
			}
		}
		
		for(int i = x-1; i>0; i--) {
			for(int j=i-1; j<i && j>=0; j--) {
				if(mat[j][i] != 0 && i!=j) {
					double opr = rounding(mat[i][i]*mat[j][i]);
					for(int k=0; k<x; k++) {
						mat[j][k] = mat[j][k] - (rounding(opr*mat[i][k]));
					}
					eq[j] = eq[j] - (rounding(opr*eq[i]));
					System.out.println(counter);
					print(mat, eq, x);
					counter++;
					System.out.println();
					continue;
				}
			}
		}
		
	}
	
	private void print(double[][] mat, double[] eq, int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "   ");
			}
			System.out.print("|");
			System.out.println(eq[i]);
		}
	}
}
