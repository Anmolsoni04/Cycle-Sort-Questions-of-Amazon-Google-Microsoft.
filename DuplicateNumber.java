//Ques-3, Amazon & Microsoft
//https://leetcode.com/problems/find-the-duplicate-number/
//(Medium level)

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int way = arr[i] - 1;
                if (arr[i] != arr[way]) {
                    swap(arr, i, way);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
