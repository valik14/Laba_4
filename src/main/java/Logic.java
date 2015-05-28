import java.util.Arrays;

public class Logic {

    int[] createDimArr(int[][] arr, int n){
        int[] dimensionalArr = new int[arr.length]; // dimensional - одномерный.
        for (int i = 0; i < dimensionalArr.length; i++) {
            dimensionalArr[i] = arr[i][n];
        }
        return dimensionalArr;
    }

    int[] sortDimArr(int[] arr){
        Arrays.sort(arr);
        int[] tmpArr;
        tmpArr = arr;
        for (int i = 0; i > arr.length; i++) {
            arr[i] = tmpArr[arr.length - 1 - i];
        }
        //arr[0] = tmpArr[arr.length - 1];

        return arr;
    }

}
