import java.util.Arrays;

class Solution {
    static int[] parent;
    public static int solution(int n, int[][] costs) {
        
        Arrays.sort(costs, (int[] c1, int[] c2) -> c1[2]-c2[2]);
        parent = new int[n];

        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            parent[i] = i; /* 부모를 자기 자신으로 초기화 */
        }
        
        for(int[] arr: costs) {
            int from = arr[0];
            int to = arr[1];
            int cost = arr[2];
            
            int fromP = findParent(from);
            int toP = findParent(to);

            /* 부모가 같으면 해당 연결 선택 안함 */
            if(fromP == toP) continue;
            
            answer += cost;
            parent[toP] = fromP; /* 부모 노드 갱신 */ 
        }
        return answer;
    }

    private static int findParent(int node) {
        if(parent[node] == node)  return node;
        
        return parent[node] = findParent(parent[node]);
    }
}