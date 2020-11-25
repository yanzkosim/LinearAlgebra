package com.matrix;

import java.util.Scanner;

public class InverseOBE extends Rounding{
	public void hitung() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Input orde : ");
		int x = scanner.nextInt();
		System.out.print("Input accuracy : ");
		coma = scanner.nextInt();
		
		double[][] mat = new double[x][x];

		double[][] matIdentity = new double[x][x];
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				if(i==j) 
					matIdentity[i][j] = 1;
				
				else 
					matIdentity[i][j] = 0;
			}
		}
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		int counter = 1;
		
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j && mat[j][i] != 1) {
					double opr = mat[j][i];
					for(int k=0; k<x; k++) {
						if(mat[j][k] != 0)
							mat[j][k] = rounding(mat[j][k]/opr);
						if(matIdentity[j][k] != 0)
						matIdentity[j][k]= rounding(matIdentity[j][k]/opr);
					}
					System.out.println(counter);
					print(mat, matIdentity, x);
					counter++;
					System.out.println();
					continue;
				}
				if(mat[j][i] != 0 && i!=j) {
					double opr = rounding(mat[i][i]*mat[j][i]);
					for(int k=0; k<x; k++) {
						mat[j][k] = mat[j][k] - (rounding(opr*mat[i][k]));
						matIdentity[j][k] = matIdentity[j][k] - (rounding(opr*matIdentity[i][k]));
					}
					System.out.println(counter);
					print(mat, matIdentity, x);
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
						matIdentity[j][k] = matIdentity[j][k] - (rounding(opr*matIdentity[i][k]));
					}
					System.out.println(counter);
					print(mat, matIdentity, x);
					counter++;
					System.out.println();
					continue;
				}
			}
		}
	}
	
	private void print(double[][] mat, double[][] matIdentity, int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "   ");
			}
			System.out.print("|");
			for(int k=0; k<x; k++) {
				System.out.printf("   " + matIdentity[i][k]);
			}
			System.out.println();
		}
	}
}
