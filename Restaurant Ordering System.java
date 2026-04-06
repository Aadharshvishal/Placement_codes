import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int total=0;
        System.out.println("              Dominos              "   );
        System.out.println("---------------Menu----------------"   );
        System.out.println("1.Peri Peri Cheesy Pizza    - Rs799"   );
        System.out.println("2.cheese Burst Cheesy Pizza - Rs999"   );
        System.out.println("3.Peri Peri Cheesy Burger   - Rs499"   );
        System.out.println("4.Peprorani GarlicBread     - Rs599"   );
        System.out.println("5.coke with small Pizza     - Rs799"   );
        System.out.println("6.Exit");
        System.out.println("Enter your choice: ");
        int choice=s.nextInt();
        
        switch(choice){
            case 1:
                total=total+799;
                System.out.println("Peri Peri Cheesy Pizza added to the order");
                break;
            case 2:
                total=total+999;
                System.out.println("cheese Burst Cheesy Pizza added to the order");
                break;
            case 3:
                total=total+499;
                System.out.println("Peri Peri Cheesy Burger added to the order");
                break;
             case 4:
                total=total+599;
                System.out.println("Peprorani GarlicBread added to the order");
                break;
            case 5:
                total=total+799;
                System.out.println("coke with small Pizza added to the order");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}