import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(49);
        nums.add(104);
        nums.add(76);
        nums.add(-40);

        ListIterator<Integer> listIterator = nums.listIterator();

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());

        listIterator = nums.listIterator(0);
        
        while (listIterator.hasNext()) {
            int i = listIterator.next();
            if(i<50){
                listIterator.remove();
            }
        }



        System.out.println(nums);
    }
}