package hw4;

import java.util.Scanner;

public class HW4_Practice1 {
	public static void main(String[] args) {
		//題目一：有個一維陣列:{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		
		int[] array={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		double avg=(double)sum/array.length;
		System.out.println("陣列所有元素的平均值為"+avg);
		System.out.print("大於平均值的元素為");
		for(int i=0;i<array.length;i++) {
			if(array[i]>avg) {
				System.out.print(array[i]+"\t");
			}
		}
		System.out.println();
	}
}
