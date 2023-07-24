import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
            hs.add(100);        
            hs.add(200);
            hs.add(300);
            hs.add(400);
            hs.add(500);

            //It will not print in the order of insertion
            System.out.println(hs);

            //it follows hash table(hashing)
            //very fast algorithm , performs only one search

            //later on , LinkHashSet was intoduced in java1.4, along with hash table it also follows linked list
            //it is a subclass of hashset, and it also preserves the order of insertion

            LinkedHashSet lhs = new LinkedHashSet();
            lhs.add(100);        
            lhs.add(200);
            lhs.add(300);
            lhs.add(400);
            lhs.add(500);

            System.out.println(lhs);


    }
}
