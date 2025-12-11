class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is on the increasing slope
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } 
            // If mid is on the decreasing slope or at the peak
            else {
                right = mid;
            }
        }

        return left; // or return right; both are same
    }
}
