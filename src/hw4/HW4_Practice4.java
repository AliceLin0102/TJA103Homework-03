package hw4;

import java.util.Scanner;

public class HW4_Practice4 {
	public static void main(String[] args) {
		//題目四：阿文上班時忘了帶錢包,想要向同事借錢
		//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數
		//例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
		
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入要借的金額");
		int number=sc.nextInt();
		String result="";
		int count=0;
		int[][] array= {{25,32,8,19,27},{2500,800,500,1000,1200}};
		for(int i =0;i<array[0].length;i++) {
			if(array[1][i]>=number) {
				result+=array[0][i]+"\t";			
				count++;
			}
		}
		if(count>0) {
			System.out.print("有錢可借的員工編號："+result);
			System.out.println("共"+count+"人!");
		}else {
			System.out.println("沒有員工有足夠的錢可以借錢");
		}	
	}
}
