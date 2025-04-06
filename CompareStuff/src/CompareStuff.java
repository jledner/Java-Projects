import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareStuff {
    public static void main(String[] args) {
        String a = "giraffe";
        String b = "platypus";
        String c = "cat";
        String d = "giraffe";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(d));
        System.out.println(b.compareTo(c));
        System.out.println("-----------------------");

        String[] strings = new String[4];
        strings[0] = "giraffe";
        strings[1] = "platypus";
        strings[2] = "cat";
        strings[3] = "giraffe";
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("-----------------------");

        Arrays.sort(strings);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("-----------------------");

        ArrayList<String> stuff = new ArrayList<>();
        stuff.add("giraffe");
        stuff.add("platypus");
        stuff.add("cat");
        stuff.add("giraffe");
        for (String s : stuff) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        Collections.sort(stuff);
        for (String s : stuff) {
            System.out.println(s);
        }
    }
}