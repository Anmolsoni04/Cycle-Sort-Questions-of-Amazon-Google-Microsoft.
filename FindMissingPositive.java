//Ques-6, Amazon

public class FindMissingPositive {
    public int firstMissingPositive(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int way = arr[i] + 1;
                if (arr[i] > 0 && arr[i] <=arr.length && arr[i] != arr[way]) {
                    swap(arr, i, way);
                } else {
                    i++;
                } // [0,1,2,4]
            }
            // Let's find the missing number in this array (i.e., 3 in this case)
    
            // Approach = start searching from the start then the first index you find that
            // is not having the required number at tht index that is your ans!
    
            for (int ind = 0; ind < arr.length; ind++) {
                if (arr[ind] != ind + 1) {
                    return ind + 1;
                }
            }
            return arr.length+1;
        }
        
        // Let's swap the array
    
        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        
    }
}
