import java.util.Scanner;

public class Baj10813 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int index = Integer.parseInt(input[0]);
        int[] arr = new int[index];
        for(int i = 0; i < index; i++){
            arr[i] = i+1;
        }
        for (int i = 0; i < Integer.parseInt(input[1]); i++){
            String[] swap = sc.nextLine().split(" ");
            int swap1 = Integer.parseInt(swap[0]);
            int swap2 = Integer.parseInt(swap[1]);
            int temp = arr[swap1-1];
            arr[swap1-1] = arr[swap2-1];
            arr[swap2-1] = temp;
        }
        for(int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
