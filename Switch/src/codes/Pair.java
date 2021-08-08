package codes;

import java.util.Arrays;

public class Pair {

	public static void printPair(int arr[], int sum) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		int count = 0;
		int[] arr1 = new int[arr.length];

		while (low <= high)
		{
			if(arr[low] + arr[high] == sum) {
			arr1[count++] = arr[low];
			arr1[count++] = arr[high];
		}
		if (arr[low] + arr[high] > sum)
			high--;
		else
			low++;
		}System.out.println(Arrays.toString(arr1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 10, 3, 6, 2, 0, 8, 7, 4, 9 };
		printPair(arr, 10);
	}

}
