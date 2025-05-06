import java.util.Arrays;
import java.util.Scanner;

public class Appartments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int result = 0;
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         if(Math.abs(a[i] - b[j]) <= k) {
        //             result++;
        //         }
        //     }
        // }

        int i = 0, j = 0;
        while(i< n && j < m) {
            if(Math.abs(a[i] - b[j]) <= k) {
                result++;
                i++;
                j++;
            }else if(a[i] < b[j]) {
                i++;
            }else {
                j++;
            }
        }
        System.out.println(result);

    }
    
}
