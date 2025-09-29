package hw4;

public class HW4_Practice6 {
	public static void main(String[] args) {
        //題目六：班上有8位同學,他們進行了6次考試結果如圖（略過），請算出每位同學考最高分的次數
		
		int[][] array= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		};
		int[] stu=new int[8];
		for(int i =0;i<array.length;i++) {
			int maxScore=0;
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]>maxScore) {
					maxScore=array[i][j];
				}
			}
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]==maxScore) {
					stu[j]++;
				}
			}
		}
		for(int i=0;i<stu.length;i++) {
			System.out.println((i+1)+"號同學，共有"+stu[i]+"次最高分");
		}
	}
}
