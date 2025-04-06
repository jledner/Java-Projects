public class BinarySearchGeneric {
    public static int binarySearch(int[] a, int x){
        int start = 0;
        int stop = a.length - 1;

        return searchForX(a, x, start, stop);
    }

    public static int searchForX(int[] a, int x, int start, int stop){
        int midpoint = (start + stop)/2;
        if(start > stop)
            return -1;
        if(a[midpoint] == x){
            return midpoint;
        }
        else if(a[midpoint] < x){
            return searchForX(a, x, midpoint + 1, stop);
        }
        else if(a[midpoint] > x){
            return searchForX(a, x, start, midpoint - 1);
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        int numToFind = 9;
        System.out.println(binarySearch(a,numToFind));
    }
}

 