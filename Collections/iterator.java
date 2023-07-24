import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//it can be used to loop through collections

public class iterator {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add("Hello");
        al.add(20.67);
          

        //using for
        System.out.println("Using for loop");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        System.out.println("**************************");
        System.out.println("using foreach loop");
        //using foreach
        for(Object o :al){
            System.out.println(o);
        }

        System.out.println("**************************");

        //using Iterator
        System.out.println("using Iterator");
        Iterator i = al.iterator();

        while(i.hasNext()){
            Object obj = i.next();
            System.out.println(obj);
        }

        System.out.println("**************************");
        //ListIterator - present in list based classes only 


        System.out.println("using ListIterator");
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("**************************");
        //we can also print in reverse
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
    
}
