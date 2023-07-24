import java.util.TreeSet;

public class treequeue {
    public static void main(String[] args) {

        //It gives in sorted order(ascending order)
        //it uses binary search tree
        
        TreeSet ts = new TreeSet();
        ts.add(700);
        ts.add(200);
        ts.add(452);
        ts.add(652);
        ts.add(82);
        ts.add(463);
        ts.add(34);

        //we cannot add duplicate values
        System.out.println(ts);

        //will give value higher than 50
        System.out.println(ts.higher(50));

        //will give value lower than 50
        System.out.println(ts.lower(50));

        //in ceiling it is not necesaary that the value should be present in collection 
        //but it is necessary in floor

        System.out.println(ts.ceiling(100));
        System.out.println(ts.floor(200));


    }
}
