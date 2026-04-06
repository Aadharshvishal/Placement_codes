import java.util.*;
interface PriceRule {
    double apply(double price);
}
public class furniture{
    public static void main(String[] args) {
        Map<String, Double> catalog = new HashMap<>();
        catalog.put("Chair",  15000.0);
        catalog.put("Table",  40000.0);
        catalog.put("Shelf",  22000.0);
        List<String> order = Arrays.asList("Chair", "Table", "Shelf");
        double t = 0;
        for (String item : order) {
            t += catalog.getOrDefault(item, 0.0);
        }
        PriceRule addGST      = price -> price + (price * 0.18);
        PriceRule addDiscount = price -> price - (price * 0.10);
        PriceRule addDelivery = price -> (price < 10000) ? price + 500 : price;
        PriceRule addService  = price -> price + (price * 0.02);
        double a = addGST.apply(t);
        double b = addDiscount.apply(a);
        double c = addDelivery.apply(b);
        double d = addService.apply(c);
        System.out.println("===== FURNITURE BILL =====");
        System.out.println("Items Ordered  : " + order);
        System.out.println("Base Total     : " + t);
        System.out.println("After GST(18%) : " + a);
        System.out.println("After Discount : " + b);
        System.out.println("After Delivery : " + c);
        System.out.println("Final Amount   : " + d);
        System.out.println("==========================");
    }
}