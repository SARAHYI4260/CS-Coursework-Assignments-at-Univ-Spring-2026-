public class Circle2 {
    public int radius;

    public Circle2(int radius){
        this.radius = radius;
    }
    public int Add(int i, int j) {return i+j;}
    public int Add(int i, int j, int k) {return i+j+k;}

    public static void main(String[] args) {
        Circle2 c = new Circle2(10);

        System.out.println(c.Add(1,2));

        System.out.println(c.Add(1,2,3));
    }

}

