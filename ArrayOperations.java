package JavaExamples;

import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = {1,5,6,15,20,40,30,11,33,57};
        System.out.println("Index Position of 15 is " + findIndex(numbers, 15));
        int n = numbers.length;
        CountEven(numbers,n);
        
    }



    //finding index of 15
    public static int findIndex(int arr[], int number) {
        int index = Arrays.binarySearch(arr,number);
        if(index < 0) {
            return -1;
        }
        else {
            return index;
           
        }

    }

    //Counting number of even numbers in the program

    static void CountEven(int[]arr, int arr_size ) {
        int even_count = 0;

        for(int i=0;i<arr_size;i++) {
            if(arr[i] % 2 == 0) {
                even_count++;
            }
        }
        System.out.println("Count of even numbers are " + even_count);
        }
    }

    

