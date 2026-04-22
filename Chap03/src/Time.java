import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요: ");
	
	int time = scanner.nextInt(); int second = time % 60; int minute = (time / 60) % 60; int hour = (time / 60) / 60; System.out.print(time + "초는 ");
	
	System.out.print(hour + "시간, ");
	System.out.print(minute + "분, ");
	System.out.println(second + "초입니다.");
	
	scanner.close();
	//정수를 입력하세요:5000
	//5000초는 1시간, 23분, 20초입니다.
	// 정수 입력
	// 60으로 나눈 나머지는 초
	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
	// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
	}
}