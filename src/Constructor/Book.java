package Constructor;
//Write a Java program to create a class called "Book"
//with instance variables title, author, and price. Implement
//a default constructor and two parameterized constructors:
//-One constructor takes title and author as parameters.
//-The other constructor takes title, author, and price as parameters.
//-Print the values of the variables for each constructor.

//solution:
public class Book {
//    instance variables
    private String title;
    private String author;
    private double price;

    //default constuctor
    public Book(){
        this.title="BookName";
        this.author="Author";
        this.price=0;
    }
    //constructor 1
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.price=0.0;
    }
//    constructor 2
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public static void main(String[] args){
        Book book1=new Book();
        System.out.println("Book1 name " + book1.title);
        System.out.println("author:" + book1.author);
        System.out.println("price " + book1.price);

        Book book2=new Book("Head First Java","Kathy Sierra & Bert Bates");
        System.out.println("Book2 name " + book2.title);
        System.out.println("author:" + book2.author);
        System.out.println("price" + book2.price);

        Book book3 =new Book("Effective Java","Joshua Bloch",700);
        System.out.println("Book3 name " + book3.title);
        System.out.println("author:" + book3.author);
        System.out.println("price" + book3.price);
    }
}