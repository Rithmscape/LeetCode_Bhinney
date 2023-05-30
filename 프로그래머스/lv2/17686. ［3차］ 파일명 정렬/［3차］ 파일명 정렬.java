import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        
        File[] info = new File[files.length];
        
        for (int i = 0; i < files.length; i++) {
            String[] str = splitFile(files[i]);
            info[i] = new File(str[0], Integer.parseInt(str[1]), str[2], files[i]);
        }
        
        Arrays.sort(info, new Comparator<File>() {
            @Override
             public int compare(File o1, File o2) {
                 if ((o1.head).equals(o2.head)) {
                    return o1.number-o2.number;
                }else{
                    return (o1.head).compareTo(o2.head);
                }
             }
        });
        
        String[] result = new String[info.length];
        
        for (int i = 0; i < info.length; i++) {
            result[i] = info[i].full;
        }
        
        return result;
    }
    
    public String[] splitFile(String file) {
        String[] str = new String[3];
        str[0] = str[1] = str[2] = ""; /* 차례대로 head, number, tail*/
        
        int idx = 0;
        
        for (int i = 0; i < file.length(); i++) {
            char c = file.charAt(i);
            
            if (idx == 0 && !Character.isDigit(c)) {
                str[idx] += c;
                continue;
            }
            
            if(idx == 0 && Character.isDigit(c)){
                idx++;
            }

            if(idx == 1 && Character.isDigit(c)){
                str[idx] += c;
                continue;
            }

            if(idx == 1 && !Character.isDigit(c)){
                idx++;
            }
            str[idx] += c;
        }
        
        str[0] = str[0].toLowerCase();
        
        return str;
    }
    
    public class File {
    String head;
    int number;
    String tail;
    String full;
    
    File (String head, int number, String tail, String full) {
        this.head = head;
        this.number = number;
        this.tail = tail;
        this.full = full;
    }
}
}