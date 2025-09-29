package hw1;

public class HW1_Practice6 {
	public static void main(String[] args) {
		//題目六：請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		
		//5+5:兩個5皆為整數(int型態)，因此列印出來的結果一樣是為int型態的10
		System.out.println(5+5);
		
		//5+'5':5為整數(int型態)，'5'為字元型態，'5'透過unicode查詢後為\u0035(16進位)，需再轉為十進位則為53，因此5+53為58
		System.out.println(5+'5');
		
		//5+"5":5為整數(int型態)，"5"為字串，因結果為拼接後的字串55
		System.out.println(5+"5");
		
	}
}
