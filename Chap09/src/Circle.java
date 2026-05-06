public class Circle {                     //circle이라는 설계도
    public int radius;                    //외부에서도 볼 수 있는 반지름
    public String name;

    public Circle() {                     //생성자 - 객체 초기화
        radius = 1;                       //기본 반지름은 10이다.
        name = "";
    }

    public Circle(int r) {                //생성자 - 위의 circle과 같지만 값으로 구분. 여기 circle은 값이 없음.
        radius = r;                       //반지름을 r로 초기화
        name = "";
    }

    public Circle(int radius) {                //생성자 - 위의 circle과 같지만 값으로 구분. 여기 circle은 값이 없음.
        this.radius = radius;                  //radius가 메소드 변수 이름인지 객체 멤버 변수인지 모르기 떄문에 this로 표시.
        name = "";
    }

    public double getArea() {
        /*double area = 0.0;
        area = 3.14 * radius * radius;

        return area;*/
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {        //void는 return을 하지 않음
        Circle circle1 = new Circle();              //[기본 원의 생성자]circle이라는 설계도를 이용해서 원을 만들어줘.
        Circle circle2 = new Circle(100);           //circle이라는 설계도를 이용해서 또 하나 원을 만들어줘.

        circle1.name = "pizza";
        // circle1.radius = 30;                     //생성자 기본 값 지정 후에 주석 처리

        circle2.name = "donut";
        //circle2.radius = 10;                      //값이 없는 생성자 지정 후에 주석 처리

        circle1.getArea();
        System.out.println("첫번째 원의 면적 : " + circle1.getArea());

        circle2.getArea();
        System.out.print("두번째 원의 면적 : " + circle2.getArea());
    }
}