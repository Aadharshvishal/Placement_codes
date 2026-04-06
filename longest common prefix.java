import java.util.*;
public class main{
    public static void main(String[] args) {
        String[] a={"flowers","flow","flight"};
        String prefix=a[0];
        for(int i=1;i<a.length;i++){
            while (a[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}                    