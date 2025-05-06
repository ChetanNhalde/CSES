import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class JosephusProblem1 {
    public static void main(String[] args) {
        FastReader in = new FastReader();

        long n = in.nextInt();

        Queue<Integer> children = new LinkedList<>();

        for(int i=1;i<=n;i++)
            children.add(i);
        
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        int curr = 0;
        while(children.size() > 0) {
            int ele = children.peek();
            children.poll();
            if(flag) {
                sb.append(ele).append(" ");
            }else {
                children.add(ele);
            }
            flag = !flag;
        }

        System.out.println(sb.toString().trim());
        
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}