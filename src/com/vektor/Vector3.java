package com.vektor;

public class Vector3{
	private double x;
	private double y;
	private double z;
	private double dot;
	private double angle;
	
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3() {
		x = 0;
		y = 0;
		z = 0;
	}
	
	public void Translate(double x, double y, double z) {
		this.x = this.x - x;
		this.y = this.y - y;
		this.z = this.z - z;
	}
	
	public double Norma() {
		double res = Math.sqrt((x*x)+(y*y)+(z*z));
		System.out.printf("Norma : %.2f\n\n",res);
		return res;
	}
	
	public void Range(Vector3 vector2, Vector3 vector1) {
		x = vector1.getX() - vector2.getX();
		y = vector1.getY() - vector2.getY();
		z = vector1.getZ() - vector2.getZ();
		System.out.printf("Range : (%.2f, %.2f, %.2f)\n\n",x,y,z);
	}
	
	public double JarakVector(Vector3 vector1, Vector3 vector2) {
		Range(vector1, vector2);
		double res = Math.sqrt((x*x)+(y*y)+(z*z));
		System.out.printf("Jarak : %.2f\n",res);
		return res;
	}
	
	public void Cross(Vector3 vector1, Vector3 vector2) {
		Determinant(vector1, vector2);
		System.out.printf("Cross Result : (%.2f, %.2f, %.2f)\n\n",x,y,z);
	}
	
	public void Determinant(Vector3 vector1, Vector3 vector2) {
		double[][] matrix = new double[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i == 0)
					matrix[i][j] = 1;
				else if(i == 1)  {
					if(j == 0)	
						matrix[i][j] = vector1.getX();
					else if(j == 1)
						matrix[i][j] = vector1.getY();
					else
						matrix[i][j] = vector1.getZ();
				}
				else {
					if(j == 0)	
						matrix[i][j] = vector2.getX();
					else if(j == 1)
						matrix[i][j] = vector2.getY();
					else
						matrix[i][j] = vector2.getZ();
				}
			}
		}
		x = (matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]);
		y = (matrix[1][2] * matrix[2][0]) - (matrix[1][0] * matrix[2][2]);
		z = (matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]);
		
	}
	
	public void Dot(Vector3 vector1, Vector3 vector2) {
		dot = (vector1.getX() * vector2.getX()) + (vector1.getY() * vector2.getY()) + (vector1.getZ() * vector2.getZ());
		double norm1 = vector1.Norma();
		double norm2 = vector2.Norma();
		double res2 = norm1*norm2;
		angle = Math.acos(dot/res2);
		System.out.printf("Dot Result : %.2f\nSudut : %.2f radian (%.2f degree)\n\n",dot, angle, angle*57.296);
	}
	
	public double rectangleArea(Vector3 vector1, Vector3 vector2, Vector3 vector3) {
		Vector3 P12 = new Vector3();
		Vector3 P13 = new Vector3();
		P12.Range(vector1, vector2);
		P13.Range(vector1, vector3);
		Vector3 res = new Vector3();
		res.Cross(P12, P13);
		System.out.print("Rectangle Area : ");
		return res.Norma();
	}
	
	public void triangleArea(Vector3 vector1, Vector3 vector2, Vector3 vector3) {
		double res = rectangleArea(vector1, vector2, vector3) / 2;
		System.out.printf("Triangle Area : %.2f\n\n",res);
		
	}
	
	public void ScalarTripleProduct(Vector3 u, Vector3 v, Vector3 w) {
		double res1 = u.getX() * v.getY() * w.getZ();
		double res2 = u.getY() * v.getZ() * w.getX();
		double res3 = u.getZ() * v.getX() * w.getY();
		double res4 = u.getX() * v.getZ() * w.getY();
		double res5 = u.getY() * v.getX() * w.getZ();
		double res6 = u.getZ() * v.getY() * w.getX();
		double res = (res1+res2+res3) - (res4+res5+res6);
		System.out.printf("Scalar Triple Product (U.(VxW)): %.2f\n\n",res);
	}
	
	public void ProyeksiSejajar(Vector3 u, Vector3 a) {
		Dot(u, a);
		double normA = a.Norma() * a.Norma();
		double proy = dot/normA;
		x = a.getX() * proy;
		y = a.getY() * proy;
		z = a.getZ() * proy;
		System.out.printf("Hasil Proyeksi Sejajar : (%.2f, %.2f, %.2f)\n\n",x,y,z);
	}
	
	public void ProyeksiOrthogonal(Vector3 u, Vector3 a) {
		ProyeksiSejajar(u, a);
		x = u.getX() - x;
		y = u.getY() - y;
		z = u.getZ() - z;
		System.out.printf("Hasil Proyeksi Ortogonal : (%.2f, %.2f, %.2f)\n\n",x,y,z);
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public double getDot() {
		return this.dot;
	}
	
	public double getAngle() {
		return this.angle;
	}
}
