import java.util.stream.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] ans = new int[arr1.length][arr1[0].length];
        
        IntStream.range(0, arr1.length).forEach(
            i -> IntStream.range(0, arr1[0].length).forEach(
                j -> ans[i][j] = arr1[i][j] + arr2[i][j]
            )
        );
        
        return ans;
    }
}