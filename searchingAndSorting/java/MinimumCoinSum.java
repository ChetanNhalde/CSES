import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextLong();

        Arrays.sort(a);

        long val = 0;
        for(long i : a) {
            if( i > val + 1){
                break;
            }
            val += i;
        }
        System.out.println(val + 1);
    }
}
