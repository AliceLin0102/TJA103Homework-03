package hw3;

import java.util.Scanner;

public class HW3_Practice2 {
public static void main(String[] args) {
		//題目二：請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息
	    Scanner sc=new Scanner(System.in);
	    int randomNumber = (int) (Math.random() * 10);
	    System.out.println("開始玩猜數字吧");
	    
	    while (true) {
            System.out.println("請輸入0~9之間的整數");
            int guessNumber = sc.nextInt();
 
            if (randomNumber != guessNumber) {
                System.out.println("猜錯囉！");
            } else {
                System.out.println("答對了，答案就是" + randomNumber);
                break;
            }
        }
	
	    //進階：產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
		
		int randomNumber1 = (int) (Math.random() * 101);
		System.out.println("開始玩猜數字吧");

        while (true) {
            System.out.println("請輸入0~100之間的整數");
            int guessNumber = sc.nextInt();

            if (randomNumber1 > guessNumber) {
                System.out.println("太小了！");
            } else if (randomNumber1 < guessNumber) {
                System.out.println("太大了！");
            } else {
                System.out.println("答對了，答案就是" + randomNumber1);
                break;
            }
        }
        	
	}


}
