package GradleTest.src.main.java.gradleSrc.Chapter19;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        list.add("Diana");
        list.add("Elmo");

        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
