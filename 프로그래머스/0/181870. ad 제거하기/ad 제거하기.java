import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).collect(Collectors.toList()).toArray(new String[0]);
    }
}