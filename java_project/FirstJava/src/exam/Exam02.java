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

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {10, 11, 12}};
		
		// 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 행의 쉬프트
		
		// 임시 배열 선언
		int[] temp = arr1[arr1.length-1];
		
		for(int i = arr1.length-1; i > 0; i--) {
			arr1[i] = arr1[i-1];
		}
		
		arr1[0] = temp;
		
		System.out.println("-----------------------------------------------------------");
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[] arr = { 1, 23, 42, 2, 45, 97 };

		System.out.println("arr 배열의 최소값: " + miniValue(arr));
		System.out.println("arr 배열의 최대값: " + maxValue(arr));

		System.out.println("-----------------------------------------------------------");

		// 2차원 배열의 선언
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 } };

		System.out.println("2차원 배열의 출력");
		addOneDArr(arr2, 100);

		System.out.println("-----------------------------------------------------------");
		
		// for-each
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		
		for(int num : arr) {
			System.out.print(num + "\t");
		}
		
	}

	public static void addOneDArr(int[][] arr, int add) {
		// 2차원 배열 출력
		// 행
		for (int i = 0; i < arr.length; i++) {
			// 열
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// 매개변수로 전달받은 숫자를 각 요소에 더해준다.
		for (int i = 0; i < arr.length; i++) {
			// 열
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += add;
			}
		}

		System.out.println("각 요소에 숫자를 더하기================");
		// 2차원 배열 출력
		// 행
		for (int i = 0; i < arr.length; i++) {
			// 열
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
