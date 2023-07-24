import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //It will store array of objects and it is dynamic in nature.
        //we can store hetrogeneous as well as homogeneous data
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add("Vaishnavi");
        al.add(67.6);
        al.add("c");

        System.out.println(al);

        //We can also store duplicates
        al.add(200);
        System.out.println(al);

        //adding one collection to another
        ArrayList al1 = new ArrayList();
        al1.add(al);
        System.out.println(al1);

        //Index based operation
        al.add(2, "Hello");
        System.out.println(al);

        
    }
}


