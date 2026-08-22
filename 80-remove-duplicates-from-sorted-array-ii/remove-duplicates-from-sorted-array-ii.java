class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n-1){
            if(nums[i] == nums[i+1]){
                int j = i+2;

                while(j<n && nums[i] == nums[j]){
                    j++;
                }
                int extra = j-(i+2);

                for(int m = i+2; m < n - extra; m++){
                    nums[m] = nums[m+extra];
                }
                n -= extra;
                i++;
            }else{
                i++;
            }
        }
        return n;
    }
}