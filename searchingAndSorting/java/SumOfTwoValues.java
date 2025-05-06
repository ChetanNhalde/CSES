import java.util.Arrays;
import java.util.Scanner;

class SumOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        
        if(n == 1) {
            System.out.println("IMPOSSIBLE");
            return;
        } 
        

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(i + 1 + " " + (j + 1));
                    return;
                }
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}