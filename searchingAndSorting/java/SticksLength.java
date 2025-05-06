import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SticksLength {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] a = new long[n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        long median = a[n/2];

        long result = 0;
        for(long i : a) {
            result += Math.abs(i - median);
        }
        
        System.out.println(result);


    }
}
