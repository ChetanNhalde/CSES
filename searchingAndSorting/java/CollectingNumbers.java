import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n+1];
        for(int i=1;i<=n;i++) {
            int x = sc.nextInt();
            a[x] = i;
        }

        int l = 1;
        int count = 1;
        for(int i=1;i<=n;i++) {
            if(l > a[i]) {
                count++;
            }
            l = a[i];
        }
        
        System.out.println(count);
    }

}
