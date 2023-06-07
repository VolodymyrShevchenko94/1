package Ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Friends {
    ArrayList<String> friends = new ArrayList<>();

    public void addFriends(int index , String element) {
        friends.add(index,element);
    }

    public void showInfo() {
        for (String i: friends) {
            System.out.println(i);

        }
    }
    public ArrayList<String> sortFriends() {
        Collections.sort(friends);
        return friends;

    }
}
