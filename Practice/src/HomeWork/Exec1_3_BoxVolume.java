package HomeWork;

import java.util.Scanner;

public class Exec1_3_BoxVolume {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("상자의 가로 세로 높이를 입력하세요.");
		
		double width, length, high, boxVolume;
		
		System.out.print("가로 : ");
		width = scn.nextDouble();
		
		System.out.print("세로 : ");
		length = scn.nextDouble();
		
		System.out.print("높이 : ");
		high = scn.nextDouble();
		
		boxVolume = width * length * high;
		
		System.out.println("상자의 부피는 " + boxVolume + "입니다.");
	}
}
