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


            ListIterator<Integer> iterator = myNumbers.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next() + 1);

                }



                }



        }



