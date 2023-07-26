class Solution {
    public String solution(String phone) {
        String str = phone.substring(phone.length() - 4);
        String star = phone.substring(0, phone.length() - 4).replaceAll("[0-9]","*");
        
        return star + str;
    }
}