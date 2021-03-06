package Sort;

import java.util.Scanner;

public class Heap_Sort {
	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr[l] > arr[largest])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr, n, largest);
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
		 Heap_Sort ob = new Heap_Sort(); 
	        ob.sort(array); 
	  
	        System.out.println("Sorted array is"); 
	        printArray(array); 
	}

}
