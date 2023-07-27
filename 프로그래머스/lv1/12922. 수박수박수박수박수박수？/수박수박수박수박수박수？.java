import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(int n) {
        String[] arr = new String[n / 2 + 1];
        Arrays.fill(arr, "수박");
        return Arrays.stream(arr).collect(Collectors.joining()).substring(0, n);
    }
}