import java.util.ArrayList;
import java.util.Scanner;

public class Baj2635 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mLen = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = n / 2; i <= n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(n);
            temp.add(i);

            int idx = 1;
            while (true) {
                int next = temp.get(idx - 1) - temp.get(idx);
                if(next < 0) break;
                temp.add(next);
                idx++;
            }

            if(mLen < temp.size()){
                mLen = temp.size();
                ans = temp;
            }
        }

        System.out.println(mLen);
        for(int i = 0; i < mLen; i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
