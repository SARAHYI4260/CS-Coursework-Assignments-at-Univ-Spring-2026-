import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		// 큰 값은 ?? 이며,작은 값은 ??입니다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 값을 입하세요.");
		
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		int max = (val1 > val2) ? val1 : val2;
		int min = (val1 < val2) ? val1 : val2;
		
		System.out.println("큰 값은 " + max + "이며, 작은 값은 " + min + "입니다.");
	}
}
