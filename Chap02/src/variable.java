import java.util.Scanner;


public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* boolean b = true;
		
		char c = 'A';
		
		byte b1 = 10;
		short s1 = 100;*/
		int a = 10;
		a = 20;
		/*long l = 1000;
		
		float f = 1.23f; // 끝에 f 넣어주기!
		double d = 10.12;
		
		String s2 = "Hello";
		
		var aa = 123;
		var bb;*/
		
		final double PI =3.14;
		
		double radius = 10.0;
		
		double circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 = " + circleArea);
		
		//--------------------------------------------------------
		byte b = 127;
		int i = 100;
			
		System.out.println(b + i);
		System.out.println(10 / 4);
		System.out.println(10.0 / 4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b + i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);

		//--------------------------------------------------------
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("순서에 맞추어 입력하세요.");
		
		System.out.print("이름은?" );
		String name = scanner.next();
		
		System.out.print("도시는? " );
		String city = scanner.next(); // 문자열 읽기
		
		System.out.print("나이는? " );
		int age = scanner.nextInt(); // 정수 읽기
		
		System.out.println("독신 여부? ");
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		
		System.out.println("당신의 이름은" + name + ", 고향은 " +  city + ", 나이는 " + age + "살, 독신여부는 " + single + " 입니다."); 
		
		scanner.close(); // scanner 닫기
		
	}

}
