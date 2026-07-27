class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){
                if(target < nums[l] || target > nums[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            else{
                if(target >nums[r] || target<nums[mid]){
                    r=mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        SearchInRotatedArray solver = new SearchInRotatedArray();
        int[] nums1 = {3,4,5,0,1,2};
        int target = 0;
        System.err.println("found on index" + solver.search(nums1, target));
    }
}