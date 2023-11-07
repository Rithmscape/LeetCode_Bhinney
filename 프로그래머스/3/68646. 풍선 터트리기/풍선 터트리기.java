class Solution {
    public int solution(int[] a) {
        if (a.length <= 1) return a.length;

		int[] left = new int[a.length]; // 해당 인덱스 원소 좌측에 최소값 저장
		int[] right = new int[a.length]; // 해당 인덱스 원소 우측에 최소값 저장

		int l = a[0]; // 좌측 최소값 비교
		for (int i = 1; i < a.length; i++) {
			left[i] = l;
			l = Math.min(l, a[i]);
		}

		int r = a[a.length - 1]; // 우측 최소값 비교
		for (int i = a.length - 2; i >= 0; i--) {
			right[i] = r;
			r = Math.min(r, a[i]);
		}

		int ans = 2;
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > left[i] && a[i] > right[i]) continue;
			ans++;
		}

		return ans;
    }
}