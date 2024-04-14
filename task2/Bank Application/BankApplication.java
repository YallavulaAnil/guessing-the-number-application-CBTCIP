import java.util.Scanner;

public class BankApplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount bank1 = new BankAccount("Anil","343586187");
        bank1.showMenu();
        
        
        
    }
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerNumber;
    
    BankAccount(String cname, String cnumber){
        customerName = cname;
        customerNumber = cnumber;
	System.out.println("create account Successfully");
    }
    
   
    
    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    
    void withdraw (int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getpreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Deposited: "+previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("withdrawn: "+Math.abs(previousTransaction));
        }
        else{
            System.out.println("no transaction is occured!");
        }
    }
    
    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name: "+customerName);
        System.out.println("Account Number: "+customerNumber);
        System.out.println("----------------------------");
        System.out.println("1.cheeck Balance");
        System.out.println("2.deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.previous transaction");
        System.out.println("5.Exit");
        
        
        do{
            System.out.println("---------------------------");
            System.out.println("Enter the option: ");
            System.out.println("---------------------------");
            option = sc.next().charAt(0);
            
            
            
            switch(option){
                case '1':
                    System.out.println("---------------------------");
                    System.out.println("balance is: "+balance);
                    System.out.println("---------------------------");
                    System.out.println();
                    break;
                case '2':
                    System.out.println("--------------------------");
                    System.out.println("Enter amount to deposit");
                    System.out.println("--------------------------");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case '3':
                    System.out.println("--------------------------");
                    System.out.println("Enter the amount of withdraw");
                    System.out.println("--------------------------");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                    
                case '4':
                    System.out.println("--------------------------");
                    getpreviousTransaction();
                    System.out.println("--------------------------");
                    System.out.println();
                    break;
                    
                
                case '5':
                    System.out.println("--------------------------");
                    break;
                    
                default:
                    System.out.println("invaild optionn! enter try again");
                    break;
            }
        }
        while(option != '5');
        
        
    }
}
