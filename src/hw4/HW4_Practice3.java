package hw4;

public class HW4_Practice3 {
	public static void main(String[] args) {
		//題目三：有個字串陣列如下 (八大行星):{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		
		String str="";
		String[] planet={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for(int i =0;i<planet.length;i++) {
			str=planet[i];
			for(int j=0;j<str.length();j++) {	
				char c=str.charAt(j);
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					count++;
				}
			}
		}System.out.println("共有"+count+"個母音");
	}
}
