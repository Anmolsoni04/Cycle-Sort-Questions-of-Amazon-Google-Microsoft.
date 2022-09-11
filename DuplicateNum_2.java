import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Ques 4 , Amazon & Microsoft

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

class DuplicateNum_2 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(sort(nums));


    }
    static List<Integer> sort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int way = nums[i]-1;
            if(nums[i]!=nums[way]){
                swap(nums,i,way);
            }else{
                i++;
            }
        }
        //let's find all the duplicates numbers in an array
        
        List<Integer> result = new ArrayList<>();

        for(int ind = 0; ind < nums.length; ind++){
            if(nums[ind]!=ind+1){
                result.add(nums[ind]);
            }
        }
        return result;
        
        

    }
    //Let's swap it

    static void swap(int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        
    }


}
