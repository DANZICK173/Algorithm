public class BinarySearch {
    public static void main(String[] args) throws Exception {
        // This is an example of array, you can modify the values
        int array[] = { 1, 4, 5, 6, 7 };
        // array, min value of length, length of array, number to be searched.
        int result = binarySearch(array, 0, array.length, 10);
        // When the result value is -1 the given number was not found
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found on index " + result);
        }

    }

    /**
     * This function searches for the given number
     * 
     * @param array
     * @param number
     * @return -1 then the algorithm has not found the number and the index (mid) when the number was found
     */

    public static int binarySearch(int array[], int min, int max, int number) {
        int mid = (min + max) / 2;

        if (mid < array.length) {

            if (array[mid] == number) {
                return mid;
            }

            if (array[mid] > number) {
                return binarySearch(array, min, mid - 1, number);
            }
            if (array[mid] < number) {
                return binarySearch(array, mid + 1, max, number);
            }

        }

        return -1;

    }
}
