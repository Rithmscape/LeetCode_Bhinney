class Solution {
    public int solution(int n, int[] cores) {
        int answer = 0;
        int min = 0; /* 시간의 최소 값 */
        int max = 10000 * n; /* 시간의 최대 값*/
        
        int time = 0; /* 시간 */
        int fin = 0; /* 시간까지 처리한 양 */
        
        while(min <= max) {
            int mid = (min + max) / 2;
            int cnt = func(mid, cores);
            
            if (min > max) {
                break;
            }
            
            if (cnt >= n) {
                max = mid - 1;
                time = mid;
                fin = cnt;
            } else {
                min = mid + 1;
            }
        }
        
        fin -= n;
        
        for (int i = cores.length - 1; i >= 0; i--) {
            if (time % cores[i] == 0) {
                if (fin == 0) {
                    answer = i + 1;
                    break;
                }
                fin--;
            }
        }
        
        return answer;
    }

    private int func(int time, int[] cores) {
        if (time == 0) {
            return cores.length;
        }
        
        int cnt = cores.length;
        
        for (int i = 0; i < cores.length; i++) {
            cnt += (time / cores[i]);
        }
        
        return cnt;
    }
}