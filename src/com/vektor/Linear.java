package com.vektor;

public class Linear {
	double x;
	double y;
	double z;
	double c;
	
	public Linear(double x, double y, double z, double c) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.c = c;
	}
	
	public Linear(double x, double y, double c) {
		this.x = x;
		this.y = y;
		this.z = 0;
		this.c = c;
	}
	
	public Linear() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.c = 0;
	}
	
	public void D3(Vector3 vector) {
		double up = Math.abs((x * vector.getX()) + (y * vector.getY()) + (z * vector.getZ()) + c);
		double down = Math.sqrt((x*x) + (y*y) + (z*z));
		double res = up/down;
		System.out.printf("D : %.2f\n\n",res);
	}
	
	public void D2(Vector vector) {
		double up = Math.abs(x * vector.getX() + (y * vector.getY()) + c);
		double down = Math.sqrt((x * x) + (y * y));
		double res = up/down;
		System.out.printf("D : %.2f\n\n",res);
	}
	
	public void Persamaan2(Vector P0, Vector n) {
		x = n.getX();
		y = n.getY();
		double cx = n.getX() * P0.getX();
		double cy = n.getY() * P0.getY();
		c = (cx + cy) * -1;
		System.out.printf("Persamaan garis : %.2fx + %.2fy + %.2f = 0\n\n", x, y, c);
	}
	
	public void Persamaan3(Vector3 P0, Vector3 n) {
		x = n.getX();
		y = n.getY();
		z = n.getZ();
		double cx = n.getX() * P0.getX();
		double cy = n.getY() * P0.getY();
		double cz = n.getZ() * P0.getZ();
		c = (cx + cy + cz) * -1;
		System.out.printf("Persamaan garis : %.2fx + %.2fy + %.2fz + %.2f = 0\n\n", x, y, z, c);
	}
	
	public void Persamaan3(Vector3 P1, Vector3 P2, Vector3 P3) {
		Vector3 P1P2 = new Vector3();
		Vector3 P1P3 = new Vector3();
		P1P2.Range(P1, P2);
		P1P3.Range(P1, P3);
		Vector3 n = new Vector3();
		n.Cross(P1P2, P1P3);
		Persamaan3(P1, n);
	}
}
