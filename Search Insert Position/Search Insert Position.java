public class Solution {
    public int searchInsert(int[] A, int target) {
        int start = 0, end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == target)
                return mid;
            else if (A[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
