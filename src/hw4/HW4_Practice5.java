package hw4;

import java.util.Scanner;

public class HW4_Practice5 {
	public static void main(String[] args) {
		//題目五：請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天。
		
		Scanner sc=new Scanner(System.in);
        boolean check;
        do {
            check=false;
            System.out.println("請輸入年份");
            int year=sc.nextInt();
            if (year<=0) {
                check=true;
                System.out.println("年份輸入錯誤，沒有"+year+"年");
                continue;
            }
            
            System.out.println("請輸入月份");
            int month=sc.nextInt();
            if(month<1 || month>12){
                check=true;
                System.out.println("月份輸入錯誤，沒有"+month+"月");
                continue;
            }
            int[] yearDate= {31,28,31,30,31,30,31,31,30,31,30,31};
            boolean flag=(year%4==0 && year%100!=0)||(year%400==0);
            if(flag){
                yearDate[1]=29;
            }

            System.out.println("請輸入日期");
            int date=sc.nextInt();
            if (date<1 || date>yearDate[month-1]){
                check=true;
                System.out.println("日期輸入錯誤，該月沒有第"+date+"天");
                continue;
            }
            int result=0;
                for(int i=0;i<month-1;i++) {
                    result+=yearDate[i];
                }
                System.out.println("輸入的日期為該年的第"+(result+date)+"天");
        } while (check);	
	}
}
