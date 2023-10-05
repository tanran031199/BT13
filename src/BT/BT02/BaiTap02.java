package BT.BT02;

import java.util.Arrays;

public class BaiTap02 {
    public static void main(String[] args) {
        int[] arr = getArr();
        int min = arr[0];

        for (int e: arr) {
            if(min > e) {
                min = e;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
