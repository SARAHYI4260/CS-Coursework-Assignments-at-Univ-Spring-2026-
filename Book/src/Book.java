public class Book {
    String title;
    String author;

    public Book() {
        this("", "");
        /*title = "";   //위 this와 같음.
        author = "";*/
    }

    public Book(String title) {
        this(title, "작자미상");
        /*this.title = title;
        author = "작자미상";*/
    }

    public Book(String title, String author) {
        this. title = title;
        this.author = author;
    }

    public void show() {
        System.out.println("제목 : " + title + ", 저자 : " + author);
    }
    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생택쥐베리");
        Book lobeStory = new Book("춘향전" );
        Book emptyBook = new Book();

        littlePrince.show();
        lobeStory.show();
        emptyBook.show();
    }
}