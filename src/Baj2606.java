import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baj2606 {

    public static ArrayList<Integer>[] graph;

    public static boolean[] visited;

    public static int count = 1;
    public static int N, M, start;

    public static void dfs(int node) {
        visited[node] = true;

        for (int i = 0; i < graph[node].size(); i++) {
            if (!visited[graph[node].get(i)]) {
                dfs(graph[node].get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        M = Integer.parseInt(st.nextToken());
        start = 1;

        visited = new boolean[N + 1];

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(start);
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(visited[i]) {
                count++;
            }
        }

        System.out.println(count - 1);

        bw.flush();
        bf.close();
        bw.close();
    }
}
