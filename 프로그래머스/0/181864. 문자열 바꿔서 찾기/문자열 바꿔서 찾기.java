class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A", "a");
        myString = myString.replaceAll("B", "b");
        myString = myString.replaceAll("b", "A");
        myString = myString.replaceAll("a", "B");
        
        return myString.contains(pat) ? 1 : 0;
    }
}