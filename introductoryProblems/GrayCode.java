import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GrayCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> grayCode = new ArrayList<>();
        grayCode.add("");

        for(int i=0;i<n;i++) {
            int size = grayCode.size();
            for(int j=size-1;j>=0;j--) {
                grayCode.add(grayCode.get(j));
            }
            size *= 2;
            for(int j=0; j<size;j++) {
                if(j< grayCode.size() / 2) {
                    grayCode.set(j, grayCode.get(j) + "0");
                }else {
                    grayCode.set(j, grayCode.get(j) + "1");
                }
            }

        }


        for(int i=0;i<grayCode.size();i++) {
            System.out.println(grayCode.get(i));
        }
        

    }

}