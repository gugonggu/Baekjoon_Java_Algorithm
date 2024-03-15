import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Medal implements Comparable<Medal> {

    int num;
    int gold;
    int silver;
    int bronze;
    int rank;

    public Medal(int num, int gold, int silver, int bronze) {
        this.num = num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.rank = 1;
    }

    @Override
    public int compareTo(Medal o) {
        if (this.gold == o.gold) {
            if (this.silver == o.silver) {
                return o.bronze - this.bronze;
            } else {
                return o.silver - this.silver;
            }
        } else {
            return o.gold - this.gold;

        }
    }
}

public class Baj8979 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);

        ArrayList<Medal> medals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strings = sc.nextLine().split(" ");
            int num = Integer.parseInt(strings[0]);
            int gold = Integer.parseInt(strings[1]);
            int silver = Integer.parseInt(strings[2]);
            int bronze = Integer.parseInt(strings[3]);
            medals.add(new Medal(num, gold, silver, bronze));
        }
        Collections.sort(medals);

        for(int i = 1; i < n; i++){
            Medal prev = medals.get(i - 1);
            Medal cur = medals.get(i);
            if(prev.gold == cur.gold && prev.silver == cur.silver && prev.bronze == cur.bronze){
                cur.rank = prev.rank;
            } else {
                cur.rank = i + 1;
            }
        }

        for(Medal m: medals){
            if(m.num == k){
                System.out.println(m.rank);
                break;
            }
        }
    }
}
