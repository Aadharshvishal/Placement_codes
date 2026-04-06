import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name:");
        String a=s.nextLine();
        System.out.println("Enter Email:");
        String b=s.nextLine();
        System.out.println("Enter Age:");
        int c=s.nextInt();
        System.out.println("Enter Password:");
        int d=s.nextInt();
        System.out.println("Registration Form\n 1.Enter Name\n 2.Enter Email\n 3.Enter Age\n 4.Enter Password");
        int i=s.nextInt();
        if (a.isEmpty()){
            System.out.println("Name not provided.");
        }
        else if(!b.contains("@")){
            System.out.println("This Email doesn't Exist");
        }
        else if(c<18){
            System.out.println("Not Eligible to register");
        }
        else{
            System.out.println("Passward cannot be given since details are not proper");
        }
        switch(i){
            case 1:
                System.out.println("Enter Name:"+a);
                System.out.println("Enter Email:"+b);
                System.out.println("Enter Password:"+c);
                System.out.println("Enter Age:"+d);
        }
    }
}