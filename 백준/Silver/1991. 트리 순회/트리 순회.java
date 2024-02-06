import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static class Node{
		char ch;
		Node left;
		Node right;

		public Node(char ch) {
			this.ch = ch;
		}
	}

	static Node[] tree;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		tree = new Node[n + 1];

		for (int i = 0; i < n; i++) {
			char[] arr = br.readLine().replace(" ", "").toCharArray();
			char root = arr[0];
			char left = arr[1];
			char right = arr[2];

			if (tree[root - 'A'] == null) tree[root - 'A'] = new Node(root);
			if (left != '.') {
				tree[left - 'A'] = new Node(left);
				tree[root - 'A'].left = tree[left - 'A'];
			}
			if (right != '.') {
				tree[right - 'A'] = new Node(right);
				tree[root - 'A'].right = tree[right - 'A'];
			}
		}
		br.close();

		preorder(tree[0]);
		System.out.println();
		inorder(tree[0]);
		System.out.println();
		postorder(tree[0]);
	}

	/* 전위 순회 */
	private static void preorder(Node node) {
		if (node == null) return;

		System.out.print(node.ch);
		preorder(node.left);
		preorder(node.right);
	}

	/* 중위 순회 */
	private static void inorder(Node node) {
		if (node == null) return;

		inorder(node.left);
		System.out.print(node.ch);
		inorder(node.right);
	}

	/* 후위 순회 */
	private static void postorder(Node node) {
		if (node == null) return;

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.ch);
	}
}