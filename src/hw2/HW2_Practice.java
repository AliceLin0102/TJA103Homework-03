package hw2;

public class HW2_Practice {
	public static void main(String[] args) {
		//題目一：請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum=0;
		for(int i=1;i<=1000;i++){
			if(i%2==0) {
				sum=sum+i;
			}
		}System.out.println(sum);
		
		System.out.println("-------");
		
		//題目二：請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int number1=1;
		for(int i=1;i<=10;i++){
			number1=number1*i;
		}System.out.println(number1);
		
		System.out.println("-------");
		
		//題目三：請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int number2=1;
		int i=1;
		while(i<=10){
			number2=number2*i;
			i++;
		}
		System.out.println(number2);
		
		System.out.println("-------");
		
		//題目四：請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100

		for(int j=1;j<=10;j++){
			int number=j*j;
			System.out.print(number+"\t");
		}
		System.out.println();
		
		System.out.println("-------");
		
		//題目五：阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count=0;
		for(int j=1;j<=49;j++) {
			if(j%10==4 || j/10%10==4) {
				
			}else {
				System.out.print(j+"\t");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有"+count+"個");	
		
		System.out.println("-------");
		
		//題目六：請設計一隻Java程式,輸出結果為....(圖形略過)
		int l=10;
		for(int j=1;j<=10;j++){
			for(int k=1;k<=l;k++) {
				System.out.print(k);
			}l--;
			System.out.println();
		}
		
		System.out.println("-------");
		
		//題目七：請設計一隻Java程式,輸出結果為....(圖形略過)
		char a='A';
		for(int j=1;j<=6;j++) {
			for(int k=1;k<=j;k++) {
				System.out.print(a);
			}a++;
			System.out.println();
		}
	}

}
