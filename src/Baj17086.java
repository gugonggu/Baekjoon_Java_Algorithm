import java.util.Scanner;

public class Baj17086 {
    static int len;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String X = sc.nextLine();
        len = X.length();

        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = X.charAt(i) - '0';
        }

        int[] visited = new int[len];

    }

    public static void solve(int dep){
        if(len == dep){

        }
    }
}
