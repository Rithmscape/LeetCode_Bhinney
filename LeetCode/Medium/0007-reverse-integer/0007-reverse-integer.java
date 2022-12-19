import java.lang.StringBuilder;

class Solution {
    public int reverse(int x) {
        try {
            String str;
            StringBuilder sb;
        
            if (x < 0) {
                x = Math.abs(x);
                str = Integer.toString(x);
                sb = new StringBuilder(str);
            
                return -Integer.parseInt(sb.reverse().toString());
            }
            str = Integer.toString(x);
            sb = new StringBuilder(str);
        
            return Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}