package hw3;
import java.util.Scanner;

public class HW3_Practice1 {
	public static void main(String[] args) {
		
		//題目一:請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入第一個整數");
		int data1=sc.nextInt();
		System.out.println("請輸入第二個整數");
		int data2=sc.nextInt();
		System.out.println("請輸入第三個整數");
		int data3=sc.nextInt();
		
		//避免輸入0或負數
		if(data1<=0 ||data2<=0 ||data3<=0) {
			System.out.println("不是三角形");
		//三角形成立：必須任兩邊相加要大於第三邊
		}else if(data1+data2>data3 && data1+data3>data2 && data2+data3>data1){
			if(data1==data2 &&data2==data3) {
				System.out.println("正三角形");
			}else if(data1==data2 ||data1==data3 ||data2==data3) {
				System.out.println("等腰三角形");
			//直角三角形：兩邊短的平方和要等於長邊的平方
			}else if(data1*data1+data2*data2==data3*data3 || data1*data1+data3*data3==data2*data2||data2*data2+data3*data3==data1*data1) {
				System.out.println("直角三角形");
			}else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
	}

}
