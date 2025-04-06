public class BinarySearchGeneric2 {

    public static int binarySearch2(int[] arr, int x){
        int start = 0;
        int stop = arr.length-1;
        return searchForX(arr, x, start, stop);
    }

    public static int searchForX(int[] arr, int x, int start, int stop){
        // base case
        if(start > stop){
            return -1;
        }

        // recursive block
        int mid = (start + stop) /2;
        if(x == arr[mid]){
            return mid;
        }
        else if(x < arr[mid]){
            stop = mid - 1;
            return searchForX(arr, x, start, stop);
        }
        else{
            start = mid + 1;
            return searchForX(arr, x, start, stop);
        }
    }

    public static void main (String[] args){
        int[] a = {1,4,6,8,9};
        System.out.println(binarySearch2(a, 9));
    }
}
