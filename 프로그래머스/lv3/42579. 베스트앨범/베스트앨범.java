import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        /* 장르별 재생시간 */
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        /* 장르를 재생시간 내림차순으로 정렬 */
        List<String> order = new ArrayList<>(map.keySet());
        order.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        /* 장르별 가장 많이 재생된 노래 리스트에 담기 */
        List<Music> music = new ArrayList<>();
        for (String g: order) {
            ArrayList<Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++){
                if(genres[i].equals(g)){
                    list.add(new Music(g, i, plays[i]));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            music.add(list.get(0));
            if(list.size()!= 1){
                music.add(list.get(1));
            }
        }
        
        int[] answer = new int[music.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = music.get(i).number;
        }
        return answer;
    }
    
    public class Music {
        String genre;
        int number;
        int play;
        
        Music (String genre, int number, int play) {
            this.genre = genre;
            this.number = number;
            this.play = play;
        }
    }
}