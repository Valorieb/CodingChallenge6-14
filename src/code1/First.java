
import java.util.*;

class First {

	// Function for calculating median
	public static double findMedian(int x[], int n)
	{
		// sort the array
		Arrays.sort(x);

		// check for even case
		if (n % 2 != 0)
			return (double)x[n / 2];

		return (double)(x[(n - 1) / 2] + x[n / 2]) / 2.0; //this is the formula for finding the median.Add middle two numbers and divide by two.
	}

	// Driver program
	public static void main(String args[])
	{
		int x[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
		int n = x.length;
		System.out.println("Median = " + findMedian(x, n));
	}
}

