package Constructor;
//Write a Java program to create a class called Dog with
//        instance variables name and color. Implement a parameterized constructor
//that takes name and color
//as parameters and initializes the instance
//variables. Print the values of the variables.
public class Dog {
    private String name;
    private String color;

    //constructor taking name and color
    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    //getter for name
    public String getName(){
        return name;
    }
    //getter for color
    public String getColor(){
        return color;
    }

    public static void main(String[] args){
        Dog dog=new Dog("Tommy","Black");
        System.out.println("Dog's name :" +dog.name);
        System.out.println("Dog's color :" +dog.color);
    }
}
