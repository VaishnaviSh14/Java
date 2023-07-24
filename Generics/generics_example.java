package Generics;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
     int id;
     String name;

     public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee{
    int id;
    String name;
}

public class generics_example {
    public static void main(String[] args) {
        Employee e1  = new Employee();
        Student s1 = new Student(12, "Vaishnavi");

        ArrayList <Student> al = new ArrayList<>();
       // al.add(e1);//error
       al.add(s1);

       Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println("ID: " + student.id + ", Name: " + student.name);
        }
      

        
    }
    
}
