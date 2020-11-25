package com.vektor;

public class Vector {
	private double x;
	private double y;
	private double dot;
	private double angle;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector() {
		x = 0;
		y = 0;
	}
	
	public void Translate(double x, double y) {
		this.x = this.x - x;
		this.y = this.y - y;
	}
	
	public double Norma() {
		double res = Math.sqrt((x*x)+(y*y));
		System.out.printf("Norma : %.2f\n\n",res);
		return res;
	}
	
	public void Range(Vector vector2, Vector vector1) {
		x = vector1.getX() - vector2.getX();
		y = vector1.getY() - vector2.getY();
		System.out.printf("Range : (%.2f, %.2f)\n\n",x,y);
	}
	
	public double JarakVector(Vector vector1, Vector vector2) {
		Range(vector1, vector2);
		double res = Math.sqrt((x*x)+(y*y));
		System.out.printf("Panjang Jarak : %.2f\n",res);
		return res;
	}
	
	public void Dot(Vector vector1, Vector vector2) {
		dot = (vector1.getX() * vector2.getX()) + (vector1.getY() * vector2.getY());
		double norm1 = vector1.Norma();
		double norm2 = vector2.Norma();
		double res2 = norm1*norm2;
		angle = Math.acos(dot/res2);
		System.out.printf("Dot Result : %.2f\nSudut : %.2f radian (%.2f degree)\n\n",dot, angle, angle*57.296);
	}
	
	public void ProyeksiSejajar(Vector u, Vector a) {
		Dot(u, a);
		double normA = a.Norma() * a.Norma();
		double proy = dot/normA;
		x = a.getX() * proy;
		y = a.getY() * proy;
		System.out.printf("Hasil Proyeksi Sejajar : (%.2f, %.2f)\n\n",x,y);
	}
	
	public void ProyeksiOrthogonal(Vector u, Vector a) {
		ProyeksiSejajar(u, a);
		x = u.getX() - x;
		y = u.getY() - y;
		System.out.printf("Hasil Proyeksi Ortogonal : (%.2f, %.2f)\n\n",x,y);
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getDot() {
		return this.dot;
	}
	
	public double getAngle() {
		return this.angle;
	}
}
