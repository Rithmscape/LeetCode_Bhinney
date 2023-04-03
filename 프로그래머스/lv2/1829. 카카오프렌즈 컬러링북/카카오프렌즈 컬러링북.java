class Solution {
    static int[] mx = {-1, 1, 0, 0};
    static int[] my = {0, 0, -1, 1};
    static boolean[][] visited;
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int cnt;
    public static int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        visited = new boolean[m][n];

        int[] answer = new int[2];

         for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(picture[i][j] != 0 && !visited[i][j]){
                    numberOfArea++;
                    dfs(i, j, picture);
                }
                if(cnt > maxSizeOfOneArea) {
                    maxSizeOfOneArea = cnt;
                }
                cnt = 0;
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private static void dfs(int a, int b, int[][] picture) {
        if(visited[a][b]) {
            return;
        }

        visited[a][b] = true;
        
        cnt++;
        
        for(int i = 0; i < 4; i++) {
            int nx = a + mx[i];
            int ny = b + my[i];
            
            if(nx<0 || nx>=picture.length || ny<0 || ny>=picture[0].length) {
                continue;
            }

            if(picture[a][b] == picture[nx][ny] && !visited[nx][ny]){                
                dfs(nx,ny,picture);
            }  
        }
        
    }
}