import java.util.Scanner;

public class Chapter2_3_for {

	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
		
		int sum = 0;
		
		int input;
		System.out.println("더할 값을 입력하세요.");
		
		for (;;) { //조건문을 넣어주지 않으면 무한 반
			input = scn.nextInt();
			if(input < 0)
				break; //반복을 하다가 특정한 순간에 빠져나가
			sum = sum + input;
		}
		
		System.out.println(sum);
		
		
//--------------------------------------------------------------------
		
		/*int sum = 0;
		
		for (int j = 1; j <= 9; j++) {
			if(j % 3 == 0)
				continue;
			sum = sum + j;
		}
		System.out.println(sum);
		
//--------------------------------------------------------------------
		
		//구구단...현재 시각 9시 13분...교수님 저희 집에 언제갈까요?아니 그냥..그냥 단지 궁금할 뿐이에요...
		
		/*for (int dan = 1; dan <=9; dan++) {
			for (int j = 1; j <=9; j++) {
				System.out.print(j + "x" + dan + "=" + dan * j + "		" );
			}
			System.out.println();
		}*/
		
//--------------------------------------------------------------------
		
		/*int count;
		int sum = 0;
		
		System.out.print("입력할 숫자의 개수는?");
		int n = scn.nextInt();

		System.out.println("합산을 구할 숫자를 " + n + "개를 입력하세요.");
		
		int i = 1;
		while ( i <= n) {
			count = scn.nextInt();
			sum = sum + count;
			i++;
		}
		System.out.println("입력한 값들의 합 : " + sum);
		System.out.println("입력한 값들의 평균 : " + (double)sum/n);*/
		
//--------------------------------------------------------------------
		
		/*System.out.println("합산을 구할 숫자를 5개를 입력하세요.");
		int count;
		int sum = 0;
		int i = 1;
		while ( i <= 5) {
			count = scn.nextInt();
			sum = sum + count;
			i++;
		}
		System.out.println("입력한 값들의 합 : " + sum);
		System.out.println("입력한 값들의 평균 : " + sum/5);*/
		
//--------------------------------------------------------------------

		/*System.out.println("합산을 구할 숫자를 입력하세요.");
		int count = scn.nextInt();
		int sum = 0; 
		
		for(int i = 1;i<= count; i++) {  
			sum = sum + i;  //sum += i;
		}
		
		//위의 for문과 while문은 같음.
		
		int i = 1;
		while(i <= count) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);*/
		
//--------------------------------------------------------------------		
		
		/*System.out.println("합산을 구할 숫자를 입력하세요.");
		int count = scn.nextInt();
		int sum = 0; 
		
		for(int i = 1;i<= count; i++) {  
			System.out.println(i);
			if (i < count)
				System.out.println("+");
			sum = sum + i;
		}
		System.out.println("=" + sum);*/

//--------------------------------------------------------------------		
		
		/*System.out.println("합산을 구할 숫자를 입력하세요.");
		int count = scn.nextInt();
		int sum = 0; 
		
		for(int i = 1;i<= count; i++) {  
			sum += i;
		}
		System.out.println("i부터 " + count + "까지의 합은 " +sum);*/
		
//--------------------------------------------------------------------
		
		/*System.out.println("반복 숫자를 입력하세요.");
		int count = scn.nextInt();
		
		int i; //제거하고 for문 안에서 선언과 초기화 동시에 가
		
		for(i = 0; i < count; i++) {  
			System.out.println("반복 숫자 : " + i);
		}*/
	
	}
}
