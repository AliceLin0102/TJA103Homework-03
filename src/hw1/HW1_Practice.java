package hw1;

public class HW1_Practice {
	public static void main(String[] args) {
		//題目1：請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1=12,num2=6;
		int sum=num1+num2;
		int product=num1*num2;
		System.out.println("和為"+sum);
		System.out.println("積為"+product);
			
		//題目二：請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs=200;
		int dozen=eggs/12;
		int num=eggs%12;
		System.out.println("總共為"+dozen+"打"+num+"顆");
		
		//題目三：請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSeconds=256559;
		int days=totalSeconds/(60*60*24);
		int lessSeconds=totalSeconds%(60*60*24);
		int hours=lessSeconds/(60*60);
		lessSeconds=lessSeconds%(60*60);
		int minutes=lessSeconds/60;
		int seconds=lessSeconds%60;
		System.out.println("總共為"+days+"天"+hours+"時"+minutes+"分"+seconds+"秒");
		
		//題目四：請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI=3.1415;
		double radius=5;
		double area=Math.pow(radius, 2)*PI;
		double perimeter=2*radius*PI;
		System.out.printf("圓面積為%.2f",area);
		System.out.println();
		System.out.printf("圓周長為%.2f",perimeter);
		System.out.println();
		
		//題目五：某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		double originalMoney=1500000;
		double interestRate=0.02; //2%
		int years=10;
		double totalBankMoney=originalMoney*Math.pow((1+interestRate), years);
		System.out.println("第十年的本金加利息為"+Math.round(totalBankMoney));
		
		//題目六：請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		//5+5:兩個5皆為整數(int型態)，因此列印出來的結果一樣是為int型態的10
		System.out.println(5+5);
		
		//5+'5':5為整數(int型態)，'5'為字元型態，'5'透過unicode查詢後為\u0035(16進位)，需再轉為十進位則為53，因此5+53為58
		System.out.println(5+'5');
		
		//5+"5":5為整數(int型態)，"5"為字串，因結果為拼接後的字串55
		System.out.println(5+"5");
		
	}

}
