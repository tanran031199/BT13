package BT.BT01;

import java.util.Arrays;

public class BaiTap01 {
    public static void main(String[] args) {
        int[] arr = getArr();
        int max = arr[0];

        for (int e: arr) {
            if(max < e) {
                max = e;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    private static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
