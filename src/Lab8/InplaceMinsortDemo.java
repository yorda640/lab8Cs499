package Lab8;
public class InplaceMinsortDemo {

    public static void minSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // test with a small array
        int[] smallArray = {64, 25, 12, 22, 11};
        System.out.println("Original small Array:");
        printArray(smallArray);
        minSort(smallArray);
        System.out.println("Sorted small Array:");
        printArray(smallArray);

        // test with a longer array
        int[] largeArray = {64, 25, 12, 22, 11, 36, 48, 50, 7, 14, 29, 8, 18, 42, 16};
        System.out.println("\nOriginal large Array:");
        printArray(largeArray);
        minSort(largeArray);
        System.out.println("Sorted Large Array:");
        printArray(largeArray);
    }
}

