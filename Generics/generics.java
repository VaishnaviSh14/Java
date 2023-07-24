package Generics;

import java.util.ArrayList;

public class generics {

    public static void main(String[] args) {
        
    
    //We use generics to specify that we want to store only this type of value
    ArrayList <Integer> al = new ArrayList<Integer>();
            al.add(876);
            al.add(100);
            al.add(6500);
            al.add(4500);
            al.add(3400);

            System.out.println(al);




    }
    
}
