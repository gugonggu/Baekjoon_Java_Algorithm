import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baj24483 {
    public static ArrayList<Integer>[] graph;
    public static int[] visited;
    public static int[] order;
    public static int count = 1;
    public static int N, M, start;
    public static long sum = 0;

    public static void dfs(int node, int depth) {
        visited[node] = depth;
        order[node] = count++;
        sum += (long)order[node] * depth;

        for(int i : graph[node]){
            if(visited[i] != -1){
                continue;
            }
            dfs(i, depth + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        start = sc.nextInt();

        visited = new int[N + 1];
        order = new int[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        Arrays.fill(visited, -1);

        dfs(start, 0);

        System.out.println(sum);
    }
}
