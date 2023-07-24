import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {

        //it uses minimum heap data structure
        PriorityQueue pq = new PriorityQueue();
            pq.add(100);
            pq.add(200);
            pq.add(300);
            pq.add(400);
            pq.add(500);

            //there is no index based operation, it can only be added at rear end
            //we cannot add mixed values
            //it implements queue interface
            
            //we can add duplicate values
            pq.add(600);
        System.out.println(pq);


    }
}
