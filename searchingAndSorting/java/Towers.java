import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Towers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];

        String[] nums = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }


        List<Integer> towerTops = new ArrayList<>();
        // towerTops.add(arr[0]);
        // for(int x=1;x<n;x++) {
        //     boolean foundGreater = false;
        //     for(int j=0;j<towerTops.size();j++) {
        //         if(towerTops.get(j) > arr[x]) {
        //             towerTops.set(j, arr[x]);
        //             foundGreater = true;
        //             break;
        //         }
        //     }

        //     if(!foundGreater) 
        //         towerTops.add(arr[x]);

            
        // }

        for(int x=0;x<n;x++) {
            int idx = Collections.binarySearch(towerTops, arr[x] + 1);
            if(idx < 0) idx = -idx - 1;
            if(idx < towerTops.size()) {
                towerTops.set(idx, arr[x]);
            }else {
                towerTops.add(arr[x]);
            }
        }

        System.out.println(towerTops.size());

    }
}
