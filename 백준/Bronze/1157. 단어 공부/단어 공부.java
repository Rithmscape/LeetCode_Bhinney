import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        // 알파벳 숫자만큼 배열 만들기
        int[] arr = new int[26];
        
        // 대문자로 바꾸기
        str = str.toUpperCase();
        
        // 입력 받은 문자열만큼 반복하기
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[ch - 'A'] += 1;
        }
        
        // 최대 숫자를 구하기 위해 max 변수 선언 및 초기화
        int max = -100;
        
        // 출력 값인 문자를 위해 변수 선언 및 초기화
        char ch = 'a';
        
        for(int i = 0; i < 26; i++){
            if(arr[i] > max){max = arr[i]; ch = (char)(i + 65);}
            else if(arr[i] == max){ch = '?';}
        }
        
        System.out.println(ch);
    }
}