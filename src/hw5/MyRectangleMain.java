package hw5;
//HW5_Practice4;
public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle m1=new MyRectangle();
		m1.setWidth(10);
		m1.setDepth(20);
		System.out.println("m1面積為"+m1.getArea());
		
		MyRectangle m2=new MyRectangle(10,20);
		System.out.println("m2面積為"+m2.getArea());
	}
}
