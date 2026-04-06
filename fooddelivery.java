import java.util.*;
interface PriceRule {
    double apply(double price);
}
public class fooddelivery {
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();
        menu.put("Cola",  450.0);
        menu.put("Pepsi", 500.0);
        menu.put("Coke",  450.0);
        List<String> order = Arrays.asList("Cola", "Pepsi", "Coke","Coke");
        double t = 0;
        for (String item : order) {
            t += menu.getOrDefault(item, 0.0);
        }
        PriceRule GST= price -> price + (price * 0.05);
        PriceRule Discount = price -> price - (price * 0.10);
        PriceRule Delivery = price -> (price < 500) ? price + 50 : price;
        PriceRule Service  = price -> price + (price * 0.02);
        double a = GST.apply(t);
        double b = Discount.apply(a);
        double c = Delivery.apply(b);
        double d = Service.apply(c);
        System.out.println("======= FOOD BILL =======");
        System.out.println("Items Ordered  : " + order);
        System.out.println("Base Total     : " + t);
        System.out.println("After GST      : " + a);
        System.out.println("After Discount : " + b);
        System.out.println("After Delivery : " + c);
        System.out.println("Final Amount   : " + d);
        System.out.println("=========================");
    }
}