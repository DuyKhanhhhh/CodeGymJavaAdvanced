package TH_ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap vao mot so bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co tri so 5" + x + " la " + arr[x]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han mang");
        }
    }
}
