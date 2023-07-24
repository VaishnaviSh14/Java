//double ended queue , it extends queue interface
import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(100);
        ad.add(200);
        ad.add("Vaishnavi");

        System.out.println(ad);

        //duplicate value are allowed
        ad.add(200);

        //we can perform insertion and deletion either from front or rear end , we cannot add in middle
        ad.addFirst(400);
        ad.addLast(56.89);

        //add and offer work same but offer may get rejected
        ad.offer(1);

        System.out.println(ad);
        
    }
}
