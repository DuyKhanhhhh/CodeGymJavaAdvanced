package Bai4;

import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int []array = {1, 2, 3 ,4 ,5 ,6 };
        int index = 3;
        deleteArray(array,index);
        System.out.println(Arrays.toString(array));
    }
    public static void deleteArray(int []array, int index){
        int [] newArray = new int[array.length -1];
        for (int i = 0; i < newArray.length; i++) {
            if (i >= index){
                newArray[i] = array[i+1];//true
            }else {
                newArray[i] = array[i];//flase
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
