package Ex1;

import java.util.ArrayList;


public class Zoo {
    private final
    ArrayList<String> zoo = new ArrayList<>();

    public ArrayList<String> getZoo() {

        return zoo;
    }
    public void showInfo() {
        for (String i : zoo) {
            System.out.println(i);

        }
    }






}
