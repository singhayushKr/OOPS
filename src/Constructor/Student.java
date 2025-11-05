package Constructor;
//Write a Java program to create a class called Student with
// instance variables studentId, studentName, and grade.
//Implement a default constructor and a parameterized constructor
//that takes all three instance variables. Use constructor chaining
//to initialize the variables. Print the values of the variables.
public class Student {
    private int studentId;
    private String studentName;
    private String grade;

    public Student(){

        this(0,"Unknown","-");
//        this.studentId=0;
//        this.studentName="UNknown";
//        this.grade="-";
    }
    public Student(int studentId,String studentName,String grade){
        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
    }
    public static void main(String[] args){
        Student unknown=new Student();
        System.out.println("studentId: "+ unknown.studentId);
        System.out.println("name: "+ unknown.studentName);
        System.out.println("grade: "+ unknown.grade);
        System.out.println();
        Student Ayush =new Student(4,"Ayush Singh","A");
        System.out.println("studentId: "+ Ayush.studentId);
        System.out.println("name: "+ Ayush.studentName);
        System.out.println("grade: "+ Ayush.grade);
    }
}
