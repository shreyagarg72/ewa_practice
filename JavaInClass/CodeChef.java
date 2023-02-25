package JavaInClass;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			for (int z = 1; z <= t; z++) {
			    int n = sc.nextInt();
			    int x = sc.nextInt();
			    int p = sc.nextInt();
			    int k = sc.nextInt();
			    int arr[] = new int[n + 1];
			    for (int i = 1; i <= n; i++) {
			        arr[i] = sc.nextInt();
			    }

			    Arrays.sort(arr);
			    if (k == p) {
			        if (arr[k] == x) {
			            System.out.println(0);
			        } else if (x <= arr[k - 1]) {
			            int leftind = findleft(arr, k - 1, x, n);
			            System.out.println(k - leftind);
			        } else {
			            if (k == n) {
			                System.out.println(1);
			            } else {
			                int rightind = findright(arr, k + 1, x, n);
			                System.out.println(rightind - k);
			            }

			        }
			    } else if (p < k) {
			        if (arr[p] == x) {
			            System.out.println(0);
			        } else if (x < arr[p]) {
			            int leftind = findleft(arr, p - 1, x, n);
			            System.out.println(p - leftind);
			        } else {
			            System.out.println(-1);
			        }
			    } else {
			        if (arr[p] == x) {
			            System.out.println(0);
			        } else if (x > arr[p]) {
			            int rightind = findright(arr, p + 1, x, n);
			            System.out.println(rightind - p);
			        } else {
			            System.out.println(-1);
			        }
			    }
			}
		}
    }

    static int findleft(int arr[], int curr, int x, int n) {
        while (curr >= 0 && arr[curr] > x) {
            curr--;
        }
        return curr;
    }

    static int findright(int arr[], int curr, int x, int n) {
        while (curr <= n && arr[curr] < x) {
            curr++;
        }
        return curr;
    }
}