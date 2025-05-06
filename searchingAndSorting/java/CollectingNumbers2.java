import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CollectingNumbers2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read n and m
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        // Read the permutation and store positions
        int[] a = new int[n + 2]; // pos[x] = position of number x
        a[0] = 0; // Sentinel for number 0
        a[n + 1] = n + 1; // Sentinel for number n+1
        int[] ind = new int[n+1];
        String[] arr = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(arr[i - 1]);
            a[x] = i;
            ind[i] = x;
        }
        
        // Calculate initial number of rounds
        int l = 1;
        int c = 1;
        for(int i=1;i<=n;i++) {
            if(l > a[i]) {
                c++;
            }
            l = a[i];
        }
        
        // Process m queries
        StringBuilder output = new StringBuilder();
        for (int t = 0; t < m; t++) {
            String[] query = br.readLine().split(" ");
            int x = Integer.parseInt(query[0]);
            int y = Integer.parseInt(query[1]);
            
            int r = ind[x];
            int s = ind[y];

            int temp = ind[x];
            ind[x] = ind[y];
            ind[y] = temp;

            if (a[r-1] <= a[r] && a[r-1] > y) c++;
            if (a[r-1] > a[r] && a[r-1] <= y) c--;
            if (a[r] <= a[r+1] && y > a[r+1]) c++;
            if (a[r] > a[r+1] && y <= a[r+1]) c--;		
            a[r] = y;
            if (a[s-1] <= a[s] && a[s-1] > x) c++;
            if (a[s-1] > a[s] && a[s-1] <= x) c--;
            if (a[s] <= a[s+1] && x > a[s+1]) c++;
            if (a[s] > a[s+1] && x <= a[s+1]) c--;	
            a[s] = x;
            
            // Append result
            output.append(c).append("\n");
        }
        
        // Print all results
        System.out.print(output);
    }
}