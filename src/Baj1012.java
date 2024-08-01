import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baj1012 {

    static int m, n, k;
    static int map[][];
    static boolean visited[][];
    static int[][] di = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void dfs(int x, int y) {
        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + di[i][1];
            int ny = y + di[i][0];

            if (nx < 0 || ny < 0 || nx >= m || ny >= n || map[ny][nx] == 0) {
                continue;
            }
            if (!visited[ny][nx]) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t > 0) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[n][m];
            visited = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;

            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        dfs(j, i);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
            bw.flush();

            t--;
        }

        bw.close();
        br.close();
    }
}
