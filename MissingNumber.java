import java.util.Arrays;

import javax.swing.text.SimpleAttributeSet;

//Ques-1 Amazon Ques
// https://leetcode.com/problems/missing-number/



//How can we find the missing number?
//Approach: start searching from the start then the first index you find that is not having the required number at tht index that is your ans!

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1 };
        System.out.println(sort(arr));
    }
    // Let's sort the array

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int way = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[way]) {
                swap(arr, i, way);
            } else {
                i++;
            } // [0,1,2,4]
        }
        // Let's find the missing number in this array (i.e., 3 in this case)

        // Approach = start searching from the start then the first index you find that
        // is not having the required number at tht index that is your ans!

        for (int ind = 0; ind < arr.length; ind++) {
            if (arr[ind] != ind) {
                return ind;
            }
        }
        return arr.length;
    }
    // Let's swap the array

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}