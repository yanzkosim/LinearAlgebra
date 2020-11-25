package com.vektor;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Linear Algebra - Vector");
		while (true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. Vector 2");
			System.out.println("2. Vector 3");
			System.out.println("0. Exit");
			int choice = scanner.nextInt(); 
			if(choice == 1) {
				System.out.println("----------------------------------------------------------------");
				Vector2Command();
			}
			else if(choice == 2) {
				System.out.println("----------------------------------------------------------------");
				Vector3Command();
			}
			else if(choice == 0) {
				break;
			}
			else {
				System.out.println("Error! Invalid Command");
			}
		}
	}
	
	public static void Vector2Command() {
		System.out.printf("1. Magnitude\n2. Norma\n3. Dot Product\n4. Projection\n"
				+ "5. Distance from a linear equation\n6. Linear equation from vector P and vector n\n");
		int choice = scanner.nextInt();
		System.out.println("----------------------------------------------------------------");
		if(choice == 1) {
			System.out.println("Input vector 1 : ");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			Vector vector1 = new Vector(x,y);
			
			System.out.println("Input vector 2 : ");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			Vector vector2 = new Vector(x,y);
			
			Vector result = new Vector();
			result.JarakVector(vector1, vector2);
		}
		else if(choice == 2) {
			System.out.println("Input Vector :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			Vector result = new Vector(x,y);
			result.Norma();
		}
		else if(choice == 3) {
			System.out.println("Input vector 1 : ");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			Vector vector1 = new Vector(x,y);
			
			System.out.println("Input vector 2 : ");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			Vector vector2 = new Vector(x,y);
			
			Vector result = new Vector();
			result.Dot(vector1, vector2);
		}
		else if(choice == 4) {
			System.out.println("Input vector u : ");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			Vector u = new Vector(x,y);
			
			System.out.println("Input vector a : ");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			Vector a = new Vector(x,y);
			
			Vector result = new Vector();
			result.ProyeksiOrthogonal(u, a);
		}
		else if(choice == 5) {
			System.out.println("Input linear equation (ax + by + c = 0):");
			System.out.print("a : ");
			double a = scanner.nextDouble();
			System.out.print("b : ");
			double b = scanner.nextDouble();
			System.out.print("c : ");
			double c = scanner.nextDouble();
			Linear linear = new Linear(a,b,c);
			
			System.out.println("Input vector : ");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			Vector vector = new Vector(x,y);
			
			linear.D2(vector);
		}
		else if(choice == 6) {
			System.out.println("Input vector P : ");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			Vector P0 = new Vector(x,y);
			
			System.out.println("Input vector n : ");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			Vector n = new Vector(x,y);
			
			Linear linear = new Linear();
			linear.Persamaan2(P0, n);
		}
		
		else {
			System.out.println("Invalid Command!");
		}
	}
	
	public static void Vector3Command() {
		System.out.printf("1. Norma\n2. Magnitude\n3. Dot Product\n4. Cross Product\n5. Triangle Area\n"
				+ "6. Scalar Triple Product [U.(VxW)]\n7. Projection\n8. Distance from a linear equation\n"
				+ "9. Linear equation from vector P and vector n\n10. Linear Equation from 3 Vector\n");
		int choice = scanner.nextInt();
		System.out.println("----------------------------------------------------------------");
		if(choice == 1) {
			System.out.println("Input Vector : ");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("z : ");
			double z = scanner.nextDouble();
			Vector3 vector = new Vector3(x,y,z);
			vector.Norma();
		}
		else if(choice == 2) {
			System.out.println("Input Vector 1 :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 vector1 = new Vector3(x,y,z);
			
			System.out.println("Input Vector 2 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 vector2 = new Vector3(x,y,z);
			
			Vector3 res = new Vector3();
			res.JarakVector(vector1, vector2);
		}
		else if(choice == 3) {
			System.out.println("Input Vector 1 :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 vector1 = new Vector3(x,y,z);
			
			System.out.println("Input Vector 2 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 vector2 = new Vector3(x,y,z);
			
			Vector3 res = new Vector3();
			res.Dot(vector1, vector2);
		}
		else if(choice == 4) {
			System.out.println("Input Vector 1 :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 vector1 = new Vector3(x,y,z);
			
			System.out.println("Input Vector 2 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 vector2 = new Vector3(x,y,z);
			
			Vector3 res = new Vector3();
			res.Cross(vector1, vector2);
		}
		else if(choice == 5) {
			System.out.println("Input Vector 1 :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 vector1 = new Vector3(x,y,z);
			
			System.out.println("Input Vector 2 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 vector2 = new Vector3(x,y,z);
			
			System.out.println("Input Vector 3 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 vector3 = new Vector3(x,y,z);
			
			Vector3 res = new Vector3();
			res.triangleArea(vector1, vector2, vector3);
		}
		else if(choice == 6) {
			System.out.println("Input Vector u :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 u = new Vector3(x,y,z);
			
			System.out.println("Input Vector v :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 v = new Vector3(x,y,z);
			
			System.out.println("Input Vector w :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 w = new Vector3(x,y,z);
			
			Vector3 res = new Vector3();
			res.ScalarTripleProduct(u, v, w);
		}
		else if(choice == 7) {
			System.out.println("Input Vector u :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 u = new Vector3(x,y,z);
			
			System.out.println("Input Vector a :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 a = new Vector3(x,y,z);
			
			Vector3 res = new Vector3();
			res.ProyeksiOrthogonal(u, a);
		}
		else if(choice == 8) {
			System.out.println("Input linear equation (ax + by + cz + d = 0):");
			System.out.print("a : ");
			double a = scanner.nextDouble();
			System.out.print("b : ");
			double b = scanner.nextDouble();
			System.out.print("c : ");
			double c = scanner.nextDouble();
			System.out.print("d : ");
			double d = scanner.nextDouble();
			Linear linear = new Linear(a,b,c,d);
			
			System.out.println("Input Vector :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 vector = new Vector3(x,y,z);
			
			linear.D3(vector);
		}
		else if(choice == 9) {
			System.out.println("Input Vector P :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 P0 = new Vector3(x,y,z);
			
			System.out.println("Input Vector n :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 n = new Vector3(x,y,z);
			
			Linear linear = new Linear();
			linear.Persamaan3(P0, n);
		}
		else if(choice == 10) {
			System.out.println("Input Vector P1 :");
			System.out.print("i : ");
			double x = scanner.nextDouble();
			System.out.print("j : ");
			double y = scanner.nextDouble();
			System.out.print("k : ");
			double z = scanner.nextDouble();
			Vector3 P1= new Vector3(x,y,z);
			
			System.out.println("Input Vector P2 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 P2 = new Vector3(x,y,z);
			
			System.out.println("Input Vector P3 :");
			System.out.print("i : ");
			x = scanner.nextDouble();
			System.out.print("j : ");
			y = scanner.nextDouble();
			System.out.print("k : ");
			z = scanner.nextDouble();
			Vector3 P3 = new Vector3(x,y,z);
			
			Linear linear = new Linear();
			linear.Persamaan3(P1, P2, P3);
		}
		else {
			System.out.println("Invalid Command!");
		}
	}

}
