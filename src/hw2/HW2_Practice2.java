package hw2;

public class HW2_Practice2 {
	public static void main(String[] args) {
		//題目二：請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int number1=1;
		for(int i=1;i<=10;i++){
			number1=number1*i;
		}System.out.println("1~10的連乘積:"+number1);
	}

}
