package project;

import java.util.Arrays;

public class ArrayOperations {

	public int[] insert(int a[], int ele, int pos) {
		if (pos > a.length + 1 || pos < 1) {
			System.out.println("Insertion is not possible");
		} else {
			int res[] = new int[a.length + 1];
			for (int i = 0, j = 0; i < res.length; i++) {
				if (i == (pos - 1)) {
					res[i] = ele;
				} else {
					res[i] = a[j++];
				}
			}
			return res;
		}
		return a;
	}

	public int[] delete(int[] a, int del) {
		int ind = firstOccurance(a, del);
		if (isEmpty(a)) {
			System.out.println("Array is Empty");
		} else if (ind == -1) {
			System.out.println("Deleting element is  not present");
		} else {
			int res[] = new int[a.length - 1];
			for (int i = 0, j = 0; i < a.length; i++) {
				if (i != ind) {
					res[j++] = a[i];
				}
			}
			return res;
		}
		return a;
	}

	public int firstOccurance(int a[], int ele) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public void update(int a[], int ele, int ele1) {
		int ind = firstOccurance(a, ele);
		if (isEmpty(a)) {
			System.out.println("Array is Empty");
		} else if (ind == -1) {
			System.out.println("Replacing element is not present");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (i == ind) {
					a[i] = ele1;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	public int lastOccurance(int a[], int ele) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}

	public int[] reverse(int a[]) {
		int rev[] = new int[a.length];
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			rev[i] = a[j];
		}
		display(rev);
		return rev;
	}

	public int max(int a[]) {
		if (isEmpty(a)) {
			System.out.println("Array is Empty");
		} else {
			int max = a[0];
			for (int i : a) {
				if (i > max) {
					max = i;
				}
			}
			return max;
		}
		return 0;
	}

	public int min(int a[]) {
		if(isEmpty(a)) {
			System.out.println("Array is Empty");
		}
		else {
			int min = a[0];
			for (int i : a) {
				if (i < min) {
					min = i;
				}
			}
			return min;
		}
		return 0;
	}

	public boolean isEmpty(int a[]) {
		if (a.length == 0) {
			return true;
		}
		return false;
	}

	public void display(int a[]) {
		System.out.println(Arrays.toString(a));
	}

	public int[] clear(int a[]) {
		return new int[0];
	}

	public int[] merge(int a[], int b[]) {
		int res[] = new int[a.length + b.length];
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			res[c++] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			res[c++] = b[j];
		}
		return res;
	}
	
	public int size(int a[]) {
		return a.length;
	}

}
