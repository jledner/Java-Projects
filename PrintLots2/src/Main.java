import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        l.add("g");

        p.add(0);
        p.add(1);
        p.add(3);
        p.add(4);
        p.add(6);
        printLots(l, p);
    }
    public static <T> void printLots(List<T> l, List<Integer> p){
        Iterator<T> iteratorForL = l.iterator();
        Iterator<Integer> iteratorForP = p.iterator();
        int printIndex = 0;
        int i = 0;
        T val = null;
        while(iteratorForP.hasNext()){
            // index of what to print from first list
            printIndex = iteratorForP.next();

            // move iterator for L forward until it catches up to printIndex
            while(i <= printIndex) {
                val = iteratorForL.next();
                i++;
            }

            if(val!=null)
                System.out.println(val.toString());
        }


    }

}