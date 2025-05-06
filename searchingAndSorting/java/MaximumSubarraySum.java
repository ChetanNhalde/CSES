import java.util.Scanner;

public class MaximumSubarraySum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        long maxEnding = a[0];
        long res = a[0];

        for(int i=1;i<n;i++) {
            maxEnding = Math.max(maxEnding + a[i], a[i]);

            res = Math.max(maxEnding, res);
        }

        System.out.println(res);

    }
}
