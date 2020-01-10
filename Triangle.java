package project6;


import java.text.DecimalFormat;

public class Triangle extends GeometricObject{
	
	public static void main(String[] args) {
		Triangle triangle=new Triangle(1,1.5,1);
		triangle.setColor("yellow");
		triangle.setFilled(true);
		System.out.println(triangle.toString()+"\n");
		DecimalFormat it=new DecimalFormat("0.00");
		System.out.println("The area is "+it.format( triangle.getArea())+"\n");
		System.out.println("The perimeter is "+triangle.getPerimeter()+",the color is "+triangle.getColor());
		if(triangle.isFilled()==true) {
			System.out.println("and it is filled");
		}
		else {
			System.out.println("and it is not filled");
		}
		
	}
	
	
	private double side1,side2,side3;
	Triangle(){//默认构造
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}
	Triangle(double a,double b,double c){//利用边长来作为构造
		this.side1=a;
		this.side2=b;
		this.side3=c;
	}
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	public double getSide3() {
		return this.side3;
	}

	@Override
	public double getArea() {
		double halfPer=(side1+side2+side3)/2;//利用海伦公式计算面积大小
		halfPer=halfPer*(halfPer-side1)*(halfPer-side2)*(halfPer-side3);
		double result=Math.sqrt(halfPer);
		DecimalFormat it=new DecimalFormat("0.00");
		
		
		return result;
	}

	@Override
	public double getPerimeter() {//获得周长
		
		return side1+side2+side3;
	}
	
	public String toString() {//获得三个边长的显示
		return "Triangle:side="+side1+"side2="+side2+"side3="+side3;
		
		
	}
	

}
