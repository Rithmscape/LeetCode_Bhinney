import java.util.*;

class Solution {
    public int solution(String dir) {
        Set<String> set = new HashSet<>();
        Location l = new Location(0,0);
        
        for (char c : dir.toCharArray()) {
            StringBuilder sb = new StringBuilder();
            if (c == 'U' && l.y < 5) {
                l.y++;
                sb.append(l.x).append(",").append(l.y - 0.5);
            } else if (c == 'D' && l.y > -5) {
                l.y--;
                sb.append(l.x).append(",").append(l.y + 0.5);
            } else if (c == 'R' && l.x < 5) {
                l.x++;
                sb.append(l.x - 0.5).append(",").append(l.y);
            }else if (c == 'L' && l.x > -5) {
                l.x--;
                sb.append(l.x + 0.5).append(",").append(l.y);
            } 
            set.add(sb.toString());
        }
        
        set.remove("");
        return set.size();
    }
    
    class Location {
        int x;
        int y;
        
        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}