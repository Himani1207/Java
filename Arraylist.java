import java.util.ArrayList;

public class Arraylist {

    static void reverselist(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp); // use temp instead of list.get(i)
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(10);
        li.add(43);

        System.out.println("Original list: " + li);
        reverselist(li);
        System.out.println("Reversed list: " + li);
    }
}
