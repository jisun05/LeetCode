import java.util.*;

class Solution {
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int m = maze.length, n = maze[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[start[0]][start[1]] = 0;

        // min-heap: {distance, r, c}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, start[0], start[1]});

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0], r = cur[1], c = cur[2];

            // 이미 더 짧은 경로가 있으면 스킵
            if (d > dist[r][c]) continue;

            for (int[] dir : dirs) {
                int nr = r, nc = c, steps = 0;

                // 벽을 만나기 전까지 굴리기
                while (in(nr + dir[0], nc + dir[1], m, n) && maze[nr + dir[0]][nc + dir[1]] == 0) {
                    nr += dir[0];
                    nc += dir[1];
                    steps++;
                }

                int nd = d + steps; // 새 거리(굴린 칸 수만큼 증가)

                if (nd < dist[nr][nc]) {
                    dist[nr][nc] = nd;
                    pq.offer(new int[]{nd, nr, nc});
                }
            }
        }

        int ans = dist[destination[0]][destination[1]];
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private boolean in(int r, int c, int m, int n) {
        return r >= 0 && r < m && c >= 0 && c < n;
    }
}
