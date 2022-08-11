public class MergeSort {

    public static void main(String[] args) {
        int array[] = { 48, 24, 1, 5, 3 };
        int[] finalArray = mergeSort(array);
        printArray(finalArray);
    }

    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }

    public static int[] merge(int[] leftarray, int[] rightarray) {
        int i = 0;
        int j = 0;
        int maxleft = leftarray.length;
        int maxright = rightarray.length;
        int[] tempArray = new int[maxleft + maxright];
        while (i < maxleft || j < maxright) {
            if (j == maxright || (i!=maxleft && leftarray[i] <= rightarray[j])) {
                tempArray[i+j] = leftarray[i];
                i++;
            } else {
                tempArray[i+j] = rightarray[j];
                j++;
            }
        }
        return tempArray;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
