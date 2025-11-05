package Constructor;
//Write a Java program to create a class called Rectangle with instance
//        variables length and width. Implement a parameterized constructor
//and a copy constructor that initializes a new object using the values of
//an existing object. Print the values of the variables.


public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
//    copy constructor
    public Rectangle(Rectangle rectangle){
        this.length= rectangle.length;
        this.width= rectangle.width;
    }

    public static void main(String[] args){
        Rectangle rect1=new Rectangle(14.0,11.5);
        System.out.println("Length of rect1 :" +rect1.length);
        System.out.println("Width of rect1 :" +rect1.width);

        Rectangle rectCopy=new Rectangle(rect1);
        System.out.println("Length of rectCopy :" +rectCopy.length);
        System.out.println("Width of rectCopy :" +rectCopy.width);
    }
}
