package hw5;

public class HW5_Practice3 {
	public static void main(String[] args) {
		int[][] intArray= {
				{1,6,3},
				{9,5,2}
				};
		double[][] doubleArray= {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));
		
	}
	public static int maxElement(int[][] array) {
		int max=array[0][0];
		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]>max) {
					max=array[i][j];
				}
			}
		}return max;
	}
	public static double maxElement(double[][] array) {
		double max=array[0][0];
		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]>max) {
					max=array[i][j];
				}
			}
		}return max;	
	}
	

}
