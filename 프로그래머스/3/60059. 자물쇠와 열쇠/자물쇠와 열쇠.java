class Solution {
    public boolean solution(int[][] key, int[][] lock) {
		int len = key.length - 1;

		for (int i = 0; i < lock.length + len; i++) {
			for (int j = 0; j < lock.length + len; j++) {
				for (int k = 0; k < 4; k++) {
					int[][] map = new int[lock.length + key.length * 2][lock.length + key.length * 2];

					for (int r = 0; r < lock.length; r++) {
						for (int c = 0; c < lock.length; c++) {
							map[r + len][c + len] = lock[r][c];
						}
					}

					match(map, key, k, i, j);
					if (check(map, len, lock.length)) return true;
				}
			}
		}

		return false;
	}

	private void match(int[][] map, int[][] key, int rot, int x, int y) {
		int len = key.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				switch (rot) {
					case 0 -> map[x + i][y + j] += key[i][j];
					case 1 -> map[x + i][y + j] += key[j][len - i - 1];
					case 2 -> map[x + i][y + j] += key[len - i - 1][len - j - 1];
					case 3 -> map[x + i][y + j] += key[len - j - 1][i];
				}
			}
		}
	}

	private boolean check(int[][] map, int len, int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if (map[len + i][len + j] != 1) return false;
			}
		}

		return true;
	}
}