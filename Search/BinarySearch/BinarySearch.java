public class BinarySearch {
    public static void main(String[] args) throws Exception {
        // (This is an example) This is the array to be verified, introduce the values you need.
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        // In the second parameter introduce the number to be searched.
        int result = binarySearch(array, 7);
        if (result == -1)
            // In case the function returns -1 and the element was not found
            System.out.println("Element not found");
        else
            // In the case the element was found
            System.out.println("Element found ");
    }

    /**
     * This function sets the values for the two splited arrays from initial array
     * 
     * @param array
     * @param arrayA
     * @param arrayB
     * @param size
     */

    public static void setArrays(int array[], int arrayA[], int arrayB[], int size) {
        int x = 0;

        for (int i = 0; i < size / 2; i++) {
            arrayA[i] = array[i];
        }

        for (int i = arrayA.length; i < array.length; i++) {
            arrayB[x] = array[i];
            x++;
        }
    }

    /**
     * This is the actual binarySearch function which finds the specified number
     * 
     * @param array
     * @param number
     * @return returns -1 or the pivot number
     */

    public static int binarySearch(int array[], int number) {
        int size = array.length;
        int pivot = size / 2;
        int arrayA[] = new int[size / 2];
        int arrayB[] = new int[size - (size / 2)];
        setArrays(array, arrayA, arrayB, size);

        if (size >= 1) {
            if (array[pivot] == number) {
                return pivot;
            }

            if (array[pivot] > number) {
                return binarySearch(arrayA, number);
            }
            if (array[pivot] < number) {
                return binarySearch(arrayB, number);
            } else
                return -1;
        }

        return -1;

    }
}
