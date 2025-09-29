package hw2;

public class HW2_Practice3 {
	public static void main(String[] args) {
		//題目三：請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int number2=1;
		int i=1;
		while(i<=10){
			number2=number2*i;
			i++;
		}
		System.out.println("1~10的連乘積:"+number2);
		
	}

}
