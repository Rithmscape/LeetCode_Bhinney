import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sum();
        System.out.println(n);
    }
}