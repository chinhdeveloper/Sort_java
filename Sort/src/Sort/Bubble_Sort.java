package Sort;

import java.util.Scanner;

public class Bubble_Sort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Số phần tử của mảng là: ");
			n = scanner.nextInt();
		} while (n < 0);
		int[] array = new int[n];
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập các phần tử thứ" + i + ": ");
			array[i] = scanner.nextInt();

		}
		System.out.println("mảng của bạn là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		}
		 bubbleSort(array);
		 System.out.println("bubble Sort: ");
		printArray(array);
	}

}
