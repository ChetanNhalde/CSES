import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class TrafficLights {
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        long x = in.nextInt();
        int n = in.nextInt();

        TreeSet<Long> lightsPos = new TreeSet<>();
        TreeMap<Long, Integer> segments = new TreeMap<>();


        lightsPos.add((long)0);
        lightsPos.add(x);
        segments.put(x, 1);

        StringBuilder sb = new StringBuilder();


        for(int i=0;i<n;i++) {
            long pos = in.nextInt();
            long right = lightsPos.higher(pos);
            long left = lightsPos.lower(pos);

            long oldLen = right - left;
            segments.put(oldLen, segments.getOrDefault(oldLen, 0) - 1);
            if(segments.get(oldLen) == 0)
            segments.remove(oldLen);

            long leftLen = pos - left;
            long rightLen = right - pos;

            segments.put(leftLen, segments.getOrDefault(leftLen, 0) + 1);
            segments.put(rightLen, segments.getOrDefault(rightLen, 0) + 1);

            

            lightsPos.add(pos);

            sb.append(segments.lastKey()).append(" ");
        }


        out.println(sb.toString().trim());
        out.flush();

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