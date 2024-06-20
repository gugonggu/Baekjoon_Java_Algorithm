import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baj24480 {

    public static ArrayList<Integer>[] graph;

    public static boolean[] visited;

    public static int[] order;

    public static int count = 1;
    public static int N, M, start;

    public static void dfs(int node) {
        visited[node] = true;
        order[node] = count++;

        for (int i = 0; i < graph[node].size(); i++) {
            if (!visited[graph[node].get(i)]) {
                dfs(graph[node].get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        start = sc.nextInt();

        visited = new boolean[N + 1];
        order = new int[N + 1];

        graph = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }

        dfs(start);

        for(int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }
    }
}
