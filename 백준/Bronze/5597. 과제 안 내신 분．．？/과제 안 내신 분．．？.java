import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 인덱스가 30인 배열을 생성 -> 31인 이유는 0부터 시작하기 때문 */
        int[] student = new int[31];
        student[0] = 1;
		
        /* 들어오는 값은 28개이기 때문에 반복문으로 배열에 넣어주기 */
		for(int i=0; i < 28; i++) {
			int num = sc.nextInt();
			student[num] = 1;
		}

        /* 반복문으로 인덱스 값을 넣어서 없는 값 확인 */
        for(int i=1; i < student.length; i++) {
			if(student[i]!=1){
                System.out.println(i);
            }
		}
		
		sc.close();
    }
}