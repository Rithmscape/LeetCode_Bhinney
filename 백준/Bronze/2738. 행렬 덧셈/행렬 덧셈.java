import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* 이차원 배열의 크기 */
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
 
        int[][] A = new int[N][M];
	    int[][] B = new int[N][M];

        /* 첫 번째 배열 */
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
	    		A[i][j] = Integer.parseInt(st.nextToken());
	    	}
        }

        /* 두 번째 배열 */
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
	    		B[i][j] = Integer.parseInt(st.nextToken());
	    	}
        }

        StringBuilder sb = new StringBuilder();
         for(int i =0 ; i < N; i++) {
	    	for(int j = 0; j < M; j++) {
	    		sb.append((A[i][j] + B[i][j]) + " ");
	    	}
	    	sb.append("\n");
	    }
	    
	    System.out.println(sb.toString());
    }
}