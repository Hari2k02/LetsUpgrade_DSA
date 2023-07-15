public class rotation {
    public static void rotateArray(int[] arr, int rotationCount) {
        int length = arr.length;
        rotationCount = rotationCount % length;
        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, rotationCount - 1);
        reverseArray(arr, rotationCount, length - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        rotateArray(arr, rotationCount);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
