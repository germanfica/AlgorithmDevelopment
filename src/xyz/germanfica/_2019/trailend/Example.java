package xyz.germanfica._2019.trailend;

public class Example {

	public static void algoFor(int[] arr, int n) {
		for (int i = 0; i <= n - 1; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void algo2(int[] arr, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(arr[i - 1]);
		}
	}

	public static void algo3(int[] arr, int n) {
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 5, 6, 8 };
		algo2(arr, arr.length);
		System.out.println("-------------------------------");
		algo2(arr, arr.length);
		System.out.println("-------------------------------");
	}
}
