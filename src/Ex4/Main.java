package Ex4;

public class Main {
    public static void main(String[] args) {
        Friends myFriends = new Friends();
        myFriends.addFriends(0,"Vova");
        myFriends.addFriends(1,"Dima");
        myFriends.addFriends(2,"Oleh");
        myFriends.addFriends(3,"Nazar");
        myFriends.addFriends(4,"Ivan");
        myFriends.addFriends(5,"Denis");
        myFriends.showInfo();
        System.out.println(myFriends.sortFriends());

    }
}
