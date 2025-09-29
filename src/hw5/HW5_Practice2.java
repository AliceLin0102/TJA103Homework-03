package hw5;

public class HW5_Practice2 {
	public static void main(String[] args) {
		randAvg();
	}
	public static void randAvg() {
		System.out.println("本次亂數結果：");			
		int sum=0;
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*101);
			System.out.print(r+"\t");
			sum+=r;
		}
		int avg=sum/10;
		System.out.println();
		System.out.println(avg);
	}

}
