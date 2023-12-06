class Solution {
   public int solution(String ineq, String eq, int n, int m) {
      int ans = -1;

      switch (ineq + eq) {
         case ">=" -> ans = n >= m ? 1 : 0;
         case ">!" -> ans = n > m ? 1 : 0;
         case "<=" -> ans = n <= m ? 1 : 0;
         case "<!" -> ans = n < m ? 1 : 0;
      }

      return ans;
   }
}