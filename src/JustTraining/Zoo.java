package JustTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Zoo {
    //Використовуючи Intelij IDEA, створити проект, пакет. Використовуючи клас Zoo Завдання 2,
    // видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.

   ArrayList<String> zoo = new ArrayList<>();

   public ArrayList<String> addZoo() {
       return zoo;
   }

   public void removeAnimal(int index) {
       zoo.remove(index);
   }

   public void showInfo() {
       for (String i: zoo) {
           System.out.println(i);

       }

   }
}
