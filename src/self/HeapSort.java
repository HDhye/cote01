package self;

// 힙정렬
public class HeapSort {

    public static void main(String[] args) {
        int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        heapSort(myArray);
        System.out.println(java.util.Arrays.toString(myArray));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 힙을 구성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 힙에서 요소 하나씩 제거하여 배열을 정렬
        for (int i = n - 1; i > 0; i--) {
            // 최대 힙의 루트와 마지막 요소를 교환
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 힙 크기를 줄이고 힙을 재구성
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // 왼쪽 자식이 루트보다 크면 largest를 왼쪽 자식으로 설정
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 오른쪽 자식이 루트보다 크면 largest를 오른쪽 자식으로 설정
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // largest가 루트가 아니라면 교환 후 재귀적으로 힙을 구성
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
