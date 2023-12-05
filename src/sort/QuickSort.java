package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        QuickSort(myArray, 0, myArray.length -1);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }

    }

    public static void QuickSort(int[] arr, int low, int high){

        if(low < high){
            int pivotIndex = partition(arr, low, high);
            QuickSort(arr, low, pivotIndex -1);
            QuickSort(arr, pivotIndex +1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        // 피봇을 가장 오른쪽 요소로 선택함
        int pivot = arr[high];
        int i = low -1;

        // 배열을 피봇을 기준으로 분할
        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot){
                // 현재 요소가 피봇보다 작거나 같으면 i를 증가시키고 현재 요소와 i 위취 요소를 교환
                i++;
                swap(arr, i, j);
            }
        }

        // 피봇의 최종 위치를 찾기 위해 i+1 위치의 요소와 피봇을 교환
        swap(arr, i +1, high);

        // 피봇 최종 위치 반환
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {

        // 배열에서 두 요소의 위치를 바꾼다.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
