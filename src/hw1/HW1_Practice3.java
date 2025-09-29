package hw1;

public class HW1_Practice3 {
	public static void main(String[] args) {
		//題目三：請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int totalSeconds=256559;
		int days=totalSeconds/(60*60*24);
		int lessSeconds=totalSeconds%(60*60*24);
		int hours=lessSeconds/(60*60);
		lessSeconds=lessSeconds%(60*60);
		int minutes=lessSeconds/60;
		int seconds=lessSeconds%60;
		System.out.println("256559秒 總共為"+days+"天"+hours+"時"+minutes+"分"+seconds+"秒");
	}

}
