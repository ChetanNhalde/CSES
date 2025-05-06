import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PlayList {



    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        // int[] count = new int[1000000007];

        String[] arr = br.readLine().split(" ");
        for(int i=0;i<n;i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        int i=0;
        int maxCount = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for(int j=0;j<n;j++){
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            while(count.get(nums[j]) > 1) {
                count.put(nums[i], count.get(nums[i]) - 1);
                i++;
            }

            maxCount = Math.max(maxCount, j - i + 1);

        }
        System.out.println(maxCount);
    }
}
