import java.util.Scanner;

public class Baj10709 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);

        int[][] cloud = new int[h][w];
        for (int i = 0; i < h; i++){
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < w; j++){
                if (line[j].equals("c")){
                    int minute = 0;
                    for (int k = j; k < w; k++){
                        cloud[i][k] = minute;
                        minute++;
                    }
                } else if(cloud[i][j] == 0) {
                    cloud[i][j] = -1;
                }

            }
        }

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                System.out.print(cloud[i][j] + " ");
            }
            System.out.println();
        }
    }
}
