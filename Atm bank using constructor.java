
import java.util.*;
class Bank{
    String name;
    int accno;
    double Bal;
    void createaccount(String name,int accno,double Bal){
        this.name =name;
        this.accno=accno;
        this.Bal=Bal;
    }
    void deposit(double amount){
        Bal +=amount;
        System.out.println("Deposited: "+amount);
    }
    void withdraw(double amount){
        if (Bal>=amount){
            Bal-=amount;
            System.out.println("Withdrawn: "+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void displaybalance(){
        System.out.println("Account Holder: "+name);
        System.out.println("Account number: "+accno);
        System.out.println("Current Balance: "+Bal);
    }
}
    public static void main(String[] args) {
        Bank myAccount=new Bank();
        myAccount.createaccount(name, accno, Bal);
        myAccount.
        myAccount.
        myAccount
        myAccount
        myAccount
        myAccount

        constructor car=new constructor(2020,"Seden");
        System.out.println("Car Year: "+car.year);
        System.out.println("Car Model: "+car.model);
    }

