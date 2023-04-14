package Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_ArrayList_basic {


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(39);
        al.add((34));
        al.add(135);
        System.out.println(al);
        //Getting the element at certain index
        System.out.println(al.get(1));

        System.out.println(al.size());
        System.out.println(al.remove(0));
        System.out.println(al.size());
        System.out.println(al.remove(1));
        System.out.println(al.add(3));
    }
}
