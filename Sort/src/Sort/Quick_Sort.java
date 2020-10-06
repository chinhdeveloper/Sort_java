package Sort;

import java.util.Scanner;

public class Quick_Sort {
	public static void quickSort(int[] arr, int left, int right) {
		/*
		 * if (arr == null || arr.length == 0) return; if (left >= right) return;
		 */
		int middle = left + (right - left) / 2;
		int pivot = arr[middle];
		int i = left, j = right;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (left < j)
			quickSort(arr, left, j);

		if (right > i)
			quickSort(arr, i, right);
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
			System.out.print("Nhập các phần tử thứ: " + i + ": ");
			array[i] = scanner.nextInt();

		}
		System.out.println("mảng của bạn là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		}
		int left = 0;
		int right = array.length - 1;
		System.out.print("\nAfter Quick Sort: ");
		quickSort(array, left, right);
		printArray(array);
	}
}
