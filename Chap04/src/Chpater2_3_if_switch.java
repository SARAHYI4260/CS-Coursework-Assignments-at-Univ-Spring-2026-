import java.util.Scanner;

public class Chpater2_3_if_switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("메뉴를 입력하세요.");
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼");
		String menu = scanner.next();
		
		switch (menu) {
			case "에스프레소" : 
				System.out.println("3000원 입니다.");
			break;
			case "dkapflzksh" : 
				System.out.println("3500원 입니다.");
			break;
			case "카푸치노" : 
		/*		System.out.println("4000원 입니다.");
			break;    */
			case "카페라떼" : 
				System.out.println("4000원 입니다.");
			break;
			default : 
				System.out.println("잘못 선택하셨습니다.");
		}
		
//--------------------------------------------------------------------------------------
		
		/*System.out.println("성적을 입력하세요.");
		int score = scanner.nextInt();
		
		switch (score / 10 ) {
			case  9 :
				System.out.println("A입니다.");
			break;
			case 8 :
				System.out.println("B입니다.");
			break;	
			case 7 :
				System.out.println("C입니다.");
			break;
			case 6 :
				System.out.println("D입니다.");
			break;
			default :
				System.out.println("F입니다.");
		} */
		
//--------------------------------------------------------------------------------------
		
		/*System.out.println("성적을 입력하세요.");
		int score = scanner.nextInt();
		System.out.println("성적을 입력하세요.");
		int grade = scanner.nextInt();
		
		if ( score >= 70 ) {
			
			if ( grade == 4 )
				System.out.println("합격입니다.");
		    else if ( score >= 80) 
		    	System.out.println("합격입니다.");
		    else 
		    	System.out.println("불합격입니다.");
		}
		else {
			System.out.println("합격입니다.");
		}*/
		
		//--------------------------------------------------------------------------------------
		
		/*System.out.println("성적을 입력하세요.");
		int score = scanner.nextInt();
		
		if ( score >= 90 ) {
			System.out.println("성적은 A입니다.");
		} 
		  else if ( score >= 80 ) {
			System.out.println("성적은 B입니다.");
		} 
		  else if ( score >= 70 ) {
			System.out.println("성적은 C입니다.");
		} 
		  else if ( score >= 60 ) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}*/
		
		//--------------------------------------------------------------------------------------
		
		/*System.out.println("정수를 입력하세요.");
		int n = scanner.nextInt();//숫자값을 입력.
		
		if ( n % 2 == 0 ) { //n이 짝수인지 확인하는 방법 즉, 참인지 거짓인지 구별할 수 있는 식.
			System.out.println("입력한 정수는 짝수입니다.");
		} else if ( n % 2 == 1 ) {
			System.out.println("입력한 정수는 홀수입니다.");
		}*/
	}

}
