package hw1;

public class HW1_Practice4 {
	public static void main(String[] args) {
		//題目四：請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI=3.1415;
		double radius=5;
		double area=Math.pow(radius, 2)*PI;
		double perimeter=2*radius*PI;
		System.out.printf("圓面積為%.2f",area);
		System.out.println();
		System.out.printf("圓周長為%.2f",perimeter);
		System.out.println();
	}
}
