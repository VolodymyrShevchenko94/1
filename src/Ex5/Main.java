package Ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Galina Ivanovna");
        teachers.add("Andgela Petrovna");
        teachers.add("Elena Nikolaevna");
        teachers.add("Nikolay Vasilievich");
        teachers.add("Luibov Vladimirovna");
        System.out.println("Лучший учитель : " + teachers.get(2));
        System.out.println("Худший учитель : " + teachers.get(4));
        System.out.println(teachers);

    }
}
