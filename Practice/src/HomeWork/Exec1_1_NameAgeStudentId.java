package HomeWork;

import java.util.Scanner;

public class Exec1_1_NameAgeStudentId{
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("정보를 입력하세요.");
		
		String name;
		int age, studentId;
		
		System.out.print("이름 : ");
		name = scn.next();
		
		System.out.print("나이 : ");
		age = scn.nextInt();
		
		System.out.print("학번 : ");
		studentId = scn.nextInt();
		
		System.out.println("당신의 이름은 " + name +"입니다.");
		System.out.println("나이 " + age +"세 입니다.");
		System.out.println("학번 " + studentId +"입니다.");
	}

}
