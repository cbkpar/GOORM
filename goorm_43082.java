import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        boolean[][] chk = new boolean[n][n];
        Queue<pos> q = new LinkedList<>();
        q.add(new pos(0, 0));
        chk[0][0] = true;
        int cnt = 1;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                pos p = q.poll();
                if (p.y == n - 1 && p.x == n - 1) {
                    System.out.println(cnt);
                    return;
                }
                for (int j = 0; j < 4; j++) {
                    int ny = p.y + dy[j];
                    int nx = p.x + dx[j];
                    if (ny < 0 || ny > n - 1 || nx < 0 || nx > n - 1) continue;
                    if (chk[ny][nx]) continue;
                    chk[ny][nx] = true;
                    if (map[ny][nx] == 1) q.add(new pos(ny, nx));
                }
            }
            cnt++;
        }
		}
}

class pos {
    int y, x;

    public pos(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
