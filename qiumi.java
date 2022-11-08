package src;
import java.util.Scanner;
/**
 * &#064;program: qiumi
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -11-08 13:10
 */
public class qiumi {
    public static void main(String[] args) {
        System.out.print("输入 n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("factorial:"+recursion(n));
        System.out.println("factorial:"+iteration(n));
    }
    public static long recursion(long n){
        if(n == 0){
            return 1;
        }
        return n*recursion(n-1);
    }
    public  static long iteration(long n){
        int res = 1;
        for(int i = 1;i<=n;i++){
            res *= i;
        }
        return  res;
    }
}
