import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//Map is an interface that represents a collection of key-value pairs , value need not to be unique but key shoul be unique
public class map {
    public static void main(String[] args) {
        //we have
        //Hashtable
        //HashMap
        //LinkedHashMap
        //TreeMap

        Map hm = new HashMap();
        hm.put(0, "Vaishnavi");
        hm.put(1, "Rohan");
        hm.put(2, "Manoj");

        System.out.println(hm);

System.out.println("Using Hashtable");
        Hashtable ht = new Hashtable();

        ht.put(0, "Vaishnavi");
        ht.put(1, "Rohan");
        ht.put(2, "Manoj");

        //It will put if not present
        //we cannot add null values
        //duplicates are not allowed
        ht.putIfAbsent(3, "Sanskriti");
        System.out.println(ht);



    }
    
}
