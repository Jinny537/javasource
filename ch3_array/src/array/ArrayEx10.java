package array;

import java.util.Arrays;

// 알고리즘 - 정렬
// 선택정렬
public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 25, 85, 55, 65, 5, 3 };
  
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // int min = 0;
    //int j = 0;
    // for (int i = 0; i < ; i++) {
    //   for (j = i + 1; j < arr.length; j++) {
    //     if (arr[j] < arr[min]) {
    //       min = j;
    //     }
    //   }

    //   //min 최소값 위치
    //   int temp = arr[i];
    //   arr[i] = arr[min];
    //   arr[min] = temp;
    //   System.out.println((i + 1) + " : " + Arrays.toString(arr));
    }
    // 자바가 제공하는 sort 
  }
}
