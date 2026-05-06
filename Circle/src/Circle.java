public class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public void show() {
        System.out.println("반지름 : " + radius + ", 면적 : " + getArea());
    }

    public static void main(String[] args) {
        Circle s = new Circle(10);

        Circle[] c = new Circle[5];

        for (int i = 0; i < 5; i++)
            c[i] = new Circle(i + 1);

        for (int i = 0; i < 5; i++) {
            c[i].show();
        }

        //------------------------------------------------------------------------------------------------------------
    /*String name;        //속성 : 원의 이름
    int radius;         //속성 : 원의 반지름
    String color;       //속성 : 원의 색상
    //지금까지는 속성잉 없음. 반지름의 길이, 이름이 달라짐.

    //면적을 구하는 (기본적인)메서드(동작)
    public double getArear(){               //public=제품의 버튼 / 실수 자료형
        double area;
        area = radius * radius * 3.14;      //area에 int타입일 경우 빨간줄, 타입이 안 맞기 때문에
        //면적을 구한 다음에 주기.
        return area;                        //실수 자료형 리턴
    }*/
    }
}
//원이라고 불려지는 곳에는 이름, 반지름, 색상도 있어야 함.
//이걸로 면적을 구해달라는 동작이 있음.

//설계도는 필드와 메서드로 나뉘어짐. 즉 속성과 속성을 위한 동작으로 나뉘어짐. 이것이 설계도.
//객체가 만들어진 것은 아님.