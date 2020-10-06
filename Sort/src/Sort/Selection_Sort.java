package Sort;

import java.util.Scanner;

public class Selection_Sort {
	
	public static void selectionSort(int[] array){  
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[index]){  
                    index = j;       //take the lowest index  
                }   
            }  
            int smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        }  
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
		System.out.println("\nAfter Quick Sort: ");
		selectionSort(array);
		printArray(array);
	}

}
