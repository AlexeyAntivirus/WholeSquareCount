import java.util.Scanner;

class Solution {
	public int solution(int A, int B) {
		int count = 0;

		for (int index = A; index <= B; index++) {
			double sqrt = Math.sqrt(index);

			count += sqrt == Math.floor(sqrt) && !Double.isInfinite(sqrt) ? 1 : 0;
		}

		return count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Set A");
		int a = scanner.nextInt();

		System.out.println("Set B");
		int b = scanner.nextInt();

		System.out.println(solution.solution(a, b));
	}
}