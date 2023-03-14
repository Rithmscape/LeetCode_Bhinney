import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited;
    char[] arr;
    public int solution(String numbers) {
        arr = numbers.toCharArray();
        visited = new boolean[numbers.length()];
        dfs("", 0);
        return set.size();
    }

    public void dfs(String str, int idx) {
        int num;
        if(!str.equals("")) {
            num = Integer.parseInt(str);
            if(isPrime(num)) set.add(num);
        }

        if(idx==arr.length) return;
        
        for(int i = 0; i < arr.length; i++){
            if(visited[i]) continue; 
            visited[i] = true; 
            dfs(str + arr[i], idx + 1);
            visited[i] = false;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
        }
        
        return true;
    }
}