package com.bridgelabz;

public class SeperateZerosAndNonZeros {

	public static void main(String[] args) {

		int[] array = { 0, 5, 0, 3, 8, 0, 2 };

		int nonZerocount = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				nonZerocount++;
			}
		}
		int[] nonzeroarray = new int[nonZerocount];
		nonZerocount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				nonzeroarray[nonZerocount] = array[i];
				nonZerocount++;
			}
		}

		for (int i = 0; i < nonzeroarray.length; i++) {
			System.out.print(nonzeroarray[i] + " ");
		}
	}
}
