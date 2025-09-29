package hw1;

public class HW1_Practice5 {
	public static void main(String[] args) {
		//題目五：某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
		double originalMoney=1500000;
		double interestRate=0.02; //2%
		int years=10;
		double totalBankMoney=originalMoney*Math.pow((1+interestRate), years);
		System.out.println("第十年的本金加利息為"+Math.round(totalBankMoney));
	}

}
