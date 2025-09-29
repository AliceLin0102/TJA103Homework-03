package hw5;

public class HW5_Practice5 {
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為"+ genAuthCode());
	}
	public static String genAuthCode() {
		char[] c=new char[62];
		for(int i=0;i<10;i++) {
			c[i]=(char)(i+48);
		}
		for(int i=10;i<36;i++) {
			c[i]=(char)(i+55);
		}
		for(int i=36;i<62;i++) {
			c[i]=(char)(i+61);
		}
		String code="";
		for(int i=0;i<8;i++) {
			int r=(int)(Math.random()*62);
			code+=c[r];
		}return code;
	}

}
