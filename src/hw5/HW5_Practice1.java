package hw5;

import java.util.Scanner;

public class HW5_Practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入寬");
		int width=sc.nextInt();
		System.out.println("請輸入高");
		int height=sc.nextInt();
		starSquare(width,height);
    }
	
	public static void starSquare(int width,int height) {
		int[][] array= new int[width][height];
		for(int i =0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
