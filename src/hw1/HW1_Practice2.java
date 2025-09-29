package hw1;

public class HW1_Practice2 {
	public static void main(String[] args) {
		//題目二：請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		
		int eggs=200;
		int dozen=eggs/12;
		int num=eggs%12;
		System.out.println("200顆蛋總共為"+dozen+"打"+num+"顆");
		
	}

}
