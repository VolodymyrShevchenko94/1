package Ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);
        myNumbers.add(50);
        myNumbers.add(60);
        myNumbers.add(70);
        myNumbers.add(80);
        myNumbers.add(90);

        ListIterator listIterator = myNumbers.listIterator();
        while(listIterator.hasNext()) {
            myNumbers.set(0,11);
            myNumbers.set(1,21);
            myNumbers.set(2,31);
            myNumbers.set(3,41);
            myNumbers.set(4,51);
            myNumbers.set(5,61);
            myNumbers.set(6,71);
            myNumbers.set(7,81);
            myNumbers.set(8,91);


            System.out.println(listIterator.next());



        }



        }
    }
