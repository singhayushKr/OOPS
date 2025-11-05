package Constructor;
//6. Constructor with Validation
//Write a Java program to create a class called Account with instance variables
// accountNumber and balance. Implement a parameterized constructor that initializes
// these variables with validation:
//*accountNumber should be non-null and non-empty.
//balance should be non-negative.
//Print an error message if the validation fails.

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance){
        if(accountNumber==null || accountNumber.isEmpty()){
            System.err.println("Invalid Account number");
            return;
        }
        if(balance<0){
            System.err.println("Balance must be non-negative");
            return;
        }
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public static void main(String[] args){
        Account customer1=new Account("",540);
        System.out.println("account no. customer1 :" +customer1.accountNumber);
        System.out.println("balance. customer1 :" +customer1.balance);

        Account customer2 =new Account("546783",-34);
        System.out.println("account no. customer2 :" + customer2.accountNumber);
        System.out.println("balance. customer2 :" + customer2.balance);

        Account customer3 =new Account("jnb32335",5400);
        System.out.println("account no. customer3 :" + customer3.accountNumber);
        System.out.println("balance. customer3 :" + customer3.balance);
    }
}
