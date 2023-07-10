import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        List<String> set1 = new ArrayList<>();
        List<String> set2 = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);
            if (a >= 'a' && b >= 'a' && a <= 'z' && b <= 'z') {
                set1.add(a + "" + b);
            }
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);
            if (a >= 'a' && b >= 'a' && a <= 'z' && b <= 'z') {
                set2.add(a + "" + b);
            }
        }
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for (String s : set1) {
            if (set2.remove(s)) {
                list1.add(s);
            }
            
            list2.add(s);
        }
        
        list2.addAll(set2);
        
        if (list2.size() == 0) {
            return 65536;
        }
        
        double jackard = (double)list1.size() / (double)list2.size();
        jackard *= 65536;
        int ans = (int) jackard;
        
        return ans;
    }
}