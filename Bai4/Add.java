package Bai4;

import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        int []array = {1, 2, 3 ,4 ,5 ,6 };
        int add = 10;
        int index = 6;
        addArray(array, add , index);
        addToArray(array, add);

    }
    public static void addArray(int [] array, int add, int index){
        int [] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i == index){
                newArray[i] = add;
            }else if (i > index){
                newArray[i] = array[i - 1]; //array i - 1 là để giảm số thứ tự của mảng vì mình đa thêm vào 1 phần tử vào thay thế vị trí đó làm bị chênh mảng
            }else {
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void addToArray(int [] array, int add){
        int [] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = add;
        System.out.println(Arrays.toString(newArray));
    }
}
