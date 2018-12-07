package examples;

public class Number_Analyzer_Array {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Enter the number of items: ");
		int n = input.nextInt();
		
		
		// Build the array and find the sum
		double[] numbers = new double[n];
		double sum = 0;
		
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// Calculate the average of the numbers
		double average = sum / numbers.length;
		
		
		// Calculate how many numbers are above or below the average
		int lower = 0;
		int higher = 0;
		for (double element: numbers) {
			if (element < average) {
				lower ++;
			}
			else {
				higher++;
			}
		}
		
		// Calculate the minimum and maximum of the data types
		double min = numbers[0];
		double max = numbers[0];
		for (double element: numbers) {
			if (min < element) {
				
			}
			if (max > element) {
			}
		}
		
		// Calculate the median
		double median = numbers.length / 2;
		if (numbers.length%2 == 1) {
			double a = numbers[(int) median];
		}
		else {
			double a = (numbers[(int) (median-1)] + numbers[(int) median]) / 2.0;
			System.out.println("The median of your numbers is: " +a);
		}
		
		
		// Calculate the mean
		double mean[];
			double sum1 = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum1 += numbers[i];
				double b = sum1 / numbers.length;
				System.out.println("The mean of your numbers is: " + b);
			}
		
		
		// Calculate the mode
		int maxValue = 0;
		int maxCount = 0;
		
		double mode[];
		for (int i = 0; i < numbers.length; ++i) {
			int count = 0;
			for (int j = 0; j < numbers.length; ++j) {
				if (numbers[j] == numbers[i]) {
					++count;
				}
			if (count > maxCount) {
				maxCount = count;
				maxValue = (int) numbers[i];
			}
			}
			double c = maxValue;
			System.out.println("The mode of your numbers is: " +c);
		}
		
		

	}

}
