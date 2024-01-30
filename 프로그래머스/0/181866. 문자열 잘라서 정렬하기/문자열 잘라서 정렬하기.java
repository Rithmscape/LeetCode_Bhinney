import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().collect(Collectors.toList()).toArray(new String[0]);
    }
}