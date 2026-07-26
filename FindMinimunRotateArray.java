public class FindMinimunRotateArray {
    public int findMin(int[] nums) {
        int l = 0;
        int r =nums.length -1;
        int ans = nums[0];
        if(nums.length == 1){
            return nums[0];
        }
        while(l<=r){
            if(nums[l]<nums[r]){
                ans = Math.min(ans, nums[l]);
            }
            int mid = (l+r)/2;
            ans = Math.min(ans,nums[mid]);
            if(nums[l] <= nums[mid]){
                l = mid + 1;
            }
            else{
                r= mid - 1;
            }

        }
        return ans;
    }


public static void main(String[] args){
    FindMinimunRotateArray solver = new FindMinimunRotateArray();
    int[] nums1 = {3,4,5,1,2};
    System.out.println("Mininum:" + solver.findMin(nums1));

}
}