package HomeWork;

import java.util.Scanner;

public class Exec1_2_ExchangeRate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("환율 : ");
		int dollar = scanner.nextInt();
	
		System.out.println("환전할 금액 : ");
		int won = scanner.nextInt();
		
		int first = won / dollar; //달러
		int second = won % dollar; //
		
		System.out.println("환전할 금액은 " + first + "달러 " + second + "센트입니다.");
		
	}

}
