package project;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProject {
	static ArrayOperations ob = new ArrayOperations();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " element");
			a[i] = sc.nextInt();
		}
		boolean check=true;
		while (check) {
			System.out.println(
					"\n 1.Insert \n 2.Delete \n 3.Update \n 4.Sort \n 5.FirstOccurance \n 6.LastOccurance \n 7.Reverse "
							+ "\n 8.Display \n 9.Max \n 10.Min \n 11.isEmpty \n 12.Merge \n 13.Size \n 14.Clear \n 15.Exit \n");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the new element to insert");
				int ele = sc.nextInt();
				System.out.println("Enter the position to insert new element");
				int pos = sc.nextInt();
				a = ob.insert(a, ele, pos);
				ob.display(a);
				break;
			}
			case 2: {
				System.out.println("Enter the element to delete");
				int del = sc.nextInt();
				a = ob.delete(a, del);
				ob.display(a);
				break;
			}
			case 3: {
				System.out.println("Enter the old element to update");
				int ele = sc.nextInt();
				System.out.println("Enter the new element to update");
				int ele1 = sc.nextInt();
				ob.update(a, ele, ele1);
				break;
			}
			case 4: {
				ob.sort(a);
				ob.display(a);
				break;
			}

			case 5: {
				System.out.println("Enter the Search element");
				int ele = sc.nextInt();
				int n = ob.firstOccurance(a, ele);
				if (n == -1) {
					System.out.println("Element is not present in array");
				} else {
					System.out.println("Element is present in position : "+(n+1));
				}
				break;
			}

			case 6: {
				System.out.println("Enter the search element");
				int ele = sc.nextInt();
				int n = ob.lastOccurance(a, ele);
				if (n == -1) {
					System.out.println("Element is not present in array");
				} else {
					System.out.println("Element is present in position : "+(n+1));
				}
				break;
			}

			case 7: {
				a=ob.reverse(a);
				ob.display(a);
				break;
			}

			case 8: {
				ob.display(a);
				break;
			}

			case 9: {
				System.out.println(ob.max(a));
				break;
			}

			case 10: {
				System.out.println(ob.min(a));
				break;
			}

			case 11: {
				if(ob.isEmpty(a)) {
					System.out.println("Array is Empty");
				}
				else {
					System.out.println("Array is not Empty");
				}
				break;
			}

			case 12: {
				System.out.println("Enter the new Array sixe");
				int s = sc.nextInt();
				int b[] = new int[s];
				for (int i = 0; i < s; i++) {
					System.out.println("Enter " + (i + 1) + " element");
					b[i] = sc.nextInt();
				}
				a=ob.merge(a, b);
				ob.display(a);
				break;
			}

			case 13: {
				System.out.println(ob.size(a));
				break;
			}

			case 14: {
				a = ob.clear(a);
				System.out.println(Arrays.toString(a));
				break;
			}

			case 15: {
				check=false;
				break;
			//	return;
			// System.exit(0);
			}

			default:
				System.out.println("Choose the Correct option");
				break;
			}
		}
	}

}
