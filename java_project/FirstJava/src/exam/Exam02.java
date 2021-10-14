package exam;

public class Exam02 {

	public static int miniValue(int[] arr) {
		int mini = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < mini) {
				mini = arr[i];
			}
		}
		return mini;
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 23, 42, 2, 45, 97 };

		System.out.println("arr 배열의 최소값: " + miniValue(arr));
		System.out.println("arr 배열의 최대값: " + maxValue(arr));

	}
}
