package Hashing;

import java.util.HashMap;

public class StudentHash {
    public static void main(String[] args) {
        HashMap<Integer,String> students= new HashMap<>();
        students.put(101,"Ram");
        students.put(102,"Shyam");
        students.put(103,"Jadu");
        students.put(104,"Madhu");
        System.out.println(students);
    }
}
