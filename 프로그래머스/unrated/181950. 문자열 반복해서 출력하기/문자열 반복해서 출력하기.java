import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(str).repeat(Math.max(0, n)));
        
        System.out.println(sb.toString());
    }
}