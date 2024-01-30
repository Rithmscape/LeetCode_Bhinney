class Solution {
    public String[] solution(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? arr[i].toLowerCase() : arr[i].toUpperCase();
        }
        
        return arr;
    }
}