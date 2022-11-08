import java.util.Arrays;
import java.util.Scanner;
public class qiumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input n:");
        int n = scanner.nextInt();
        System.out.println("factorial:"+recursion(n));
        System.out.println("factorial:"+iteration(n));
        System.out.println("input array:");
        int[] a =new int[13];
        for(int i=0;i<13;i++) {
            a[i] = scanner.nextInt();
        }
       System.out.println("sort array:"+ Arrays.toString(sort(a)));
        System.out.print("search:");
       int value = scanner.nextInt();
      System.out.println("找到"+value+"下标为："+binarySearch(a,value));
    }
    public static long recursion(long n){
        if(n == 0){
            return 1;
        }
        return n*recursion(n-1);
    }
    public static long iteration(long n){
        int res = 1;
        for(int i = 1;i<=n;i++){
            res *= i;
        }
        return  res;
    }

    public static int[] sort(int[] a){
        System.out.println("array: "+ Arrays.toString(a));
        int temp;
        for(int i = 0 ;i< a.length -1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("i= "+i+", "+ Arrays.toString(a));
        }
        return a;
        }
    public static int binarySearch(int[] arr,int value) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int middle = (low + high) / 2;
            if (value == arr[middle]) {
                return middle;
            }
            if (value > arr[middle]) {
                low = middle + 1;
            }
            if (value < arr[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
}