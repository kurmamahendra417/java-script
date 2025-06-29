public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1}; 

        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements might be the same).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
