public class Book {
    String title;
    String author;
    double price;

    public Book(){
        title = "";
        author = "";
        price = 0.0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void showDetails(){
        System.out.println(title+" "+author+" "+price);
    }

    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Java 101", "James Gosling", 150.0);

        b1.showDetails();
        b2.showDetails();
    }
}
