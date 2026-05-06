public Box{
    private int width;                              //캡슐화 ex) 자동차 엔진
    private int height;                             //캡슐화 ex) 자동차 엔진

    public Box(int w, int h){
        width = w; height = h;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public int getWidth() {return this.width;}
    public int getHeight() {return this.height;}

    public int getArea() {
        return width * height;
    }
 }

public class Circle3 {
    public static void main(String[] args) {
        Box b = new Box(1,2);

        b.width = 10;

        System.out.println(b.width * b.height);     //private이기 때문에 직접적으로 wideth와 height에 접근 못 함.
    }
}

