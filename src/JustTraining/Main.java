package JustTraining;

import Ex2.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.getZoo().add(0,"Vova");
        zoo.getZoo().add(1,"Vovan");
        zoo.removeAnimal(0);
        zoo.showInfo();
    }
}
