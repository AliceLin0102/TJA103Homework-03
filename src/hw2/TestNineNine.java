package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		//for+while
		for(int i=1;i<=9;i++) {
			int j=1;
			while(j<=9) {
				int num=i*j;
				System.out.print(i+"*"+j+"="+num+"\t");
				j++;
			}System.out.println();
		}
		
		
		System.out.println("----------------------------------------------------------------------");
		
		//for+do...while
		for(int i=1;i<=9;i++){
			int j=1;
			do{
				int num=i*j;
				System.out.print(i+"*"+j+"="+num+"\t");
				j++;
			}while(j<=9);
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		//while+do...while
		int i=1;
		while(i<=9) {
			int j=1;
			do{
				int num=i*j;
				System.out.print(i+"*"+j+"="+num+"\t");
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}
	}

}
