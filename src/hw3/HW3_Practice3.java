package hw3;

import java.util.Scanner;

public class HW3_Practice3 {
public static void main(String[] args) {

        //題目三：阿文很喜歡簽大樂透(1~49),請設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
        Scanner sc=new Scanner(System.in);
	    System.out.println("阿文 請輸入你討厭的數字1~9");
        int hateNumber = sc.nextInt();
        int count=0;
        for (int i = 1; i <= 49; i++) {
            if(i%10!=hateNumber && i/10%10!=hateNumber){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("總共有"+count+"個可選");
        
        //進階：輸入不要的數字後,直接亂數印出6個號碼且不得重複
        System.out.println("阿文 請輸入你討厭的數字1~9");
        int hateNumber1 = sc.nextInt();
        int[] check=new int[6];
        int count1=0;
        while(count1<6) {
        	int randomNumber=(int)(Math.random()*20)+1;
	        if(randomNumber %10 !=hateNumber1 && randomNumber/10%10 !=hateNumber1) {	
	        	boolean flag = false;
	            for (int i = 0; i < count1; i++) {
	                if (check[i] == randomNumber) {
	                    flag = true; //檢查有沒有重複
	                    break;
	                }
	            }
	            if (flag==false) {
	                check[count1] = randomNumber;
	                System.out.print(randomNumber + "\t");
	                count1++;
	            }
	        }
        }
        
	}


}
