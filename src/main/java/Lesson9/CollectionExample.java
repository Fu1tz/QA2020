package Lesson9;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

/*
        int[]arr = new int [10];
        String [] strings = new String[10];

        for (String string : strings) {
            //System.out.print(string.charAt(0) + " "); //null.charAt(1) = NullPointerException
            System.out.println(string + " ");
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }




        //==============Collections===========
        //list


        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(21);
        linkedList.remove(0);
        linkedList.add(0,100);


        for (Integer integer : linkedList){
            System.out.println("Linked " + integer);
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.remove("one");
        //arrayList.remove(0);
        for (String s : arrayList) {
            System.out.println("ArrayList " +s);
        }



        Set<String> set = new HashSet<>(); // set - хранит уникальное значение
        set.add("X");
        set.add("Y");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("C");
        set.add("D");
        set.add("Z");
        set.add("J");
        set.add("J");
        for (String s : set){
            System.out.println("Set = " +s);
        }



        Iterator<String>iterator = set.iterator();
        while (iterator.hasNext());{
            String next = iterator.next();
            System.out.println("Set iterator = " + next);
        }

        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        Integer a = 12;
        System.out.println(a.hashCode());
        Integer b = 13;
        System.out.println(b.hashCode());

*/
        Set<Student>students = new HashSet<>();
        students.add(new Student("Vasiliy","12345"));
        students.add(new Student("Fedor","23145"));
        students.add(new Student("Fedor","23145"));
        students.add(new Student("Fedor","23145"));
        students.add(new Student("Fedor","23145"));
        students.add(new Student("Afanasiy","24211"));
        students.add(new Student("Evkakiy","24211"));
        for (Student student : students){
            System.out.println("student = " + student);
        }









    }
}
