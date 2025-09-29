package hw2;

public class HW2_Practice5 {
	public static void main(String[] args) {
		//題目五：阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count=0;
		for(int j=1;j<=49;j++) {
			if(j%10==4 || j/10%10==4) {
				
			}else {
				System.out.print(j+"\t");
				count++;
			}
		}System.out.println();
		System.out.println("總共有"+count+"個");	
		
	}

}
