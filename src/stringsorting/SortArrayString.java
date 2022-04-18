package stringsorting;


import java.util.Arrays;

public class SortArrayString {

    public static void main(String[] args) {
        String arr[]={"ajith","billa","chiru","balayya"};
        System.out.println("Before Sorting");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        Arrays.sort(arr);

        System.out.println();
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}