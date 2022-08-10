public class App {
    public static void main(String[] args) throws Exception {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        int result = BinarySearch(array, 7);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found ");
    }

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

    public static int BinarySearch(int array[], int number) {
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
                return BinarySearch(arrayA, number);
            }
            if (array[pivot] < number) {
                return BinarySearch(arrayB, number);
            } else
                return -1;
        }

        return -1;

    }
}
