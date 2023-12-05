package self;

// 삽입정렬
public class InsertionSort {

    public static void main(String[] args) {
        int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        insertionSort(myArray);
        System.out.println(java.util.Arrays.toString(myArray));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // key보다 큰 원소들을 오른쪽으로 이동
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // key를 적절한 위치에 삽입
            arr[j + 1] = key;
        }
    }
}
