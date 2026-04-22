
public class Hello {
	
	/* 프로젝트명  : Hello 
	 * 만든 사람 : 나 
	 * 만든 날짜 :2026/03/11 */

	public static int sum(int n, int m) {
		return n + m;
	}
	
	//main() 메소드에서 실행 시
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.out.println("Hello! java");
		 * System.out.print("Hello! java2" + " ");
		 * System.out.println("Hello! java3");
		 */
		
		int i = 20;
		int s;
		char a; 
		
		s = sum(i, 10);					//sum() 메소드 호
		a = '?';
		System.out.println(a);			//문자 '?'화면 호
		System.out.println("Hello");	//"Hello" 문자열 화출
		System.out.println(s);			// 정수 s 값 화면 출력
		
	}
}