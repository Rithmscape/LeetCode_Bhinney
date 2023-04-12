import java.util.*;

class Solution {
    public int solution(int n) {
        int NUM = 1000000007;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < n; i++) {
            int number = arr[i - 1] + arr[i - 2];
            arr[i] = number % NUM;
        }
        return arr[n-1];
    }
}