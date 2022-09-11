// //Ques-2  Google Question

// //https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=21&t=2135s

import java.util.ArrayList;
import java.util.Arrays;


class DisappearNum {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println((sort(nums)));
    }

    static ArrayList<Integer> sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int sec = nums[i] - 1;
            if (nums[i] != nums[sec]) {
                swap(nums, i, sec);
            } else {
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int ind = 0; ind < nums.length; ind++) {
            if (nums[ind] != ind + 1) {
                ans.add(ind + 1);
            }
        }
        return ans;
    }

    static void swap(int[]nums, int first, int sec){
        int temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp;
    }
}
   