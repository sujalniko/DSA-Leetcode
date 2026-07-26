class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;
        for(int n : nums){
            set.add(n);
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int count = 0;
                int cn = n;
            while(set.contains(cn+1)){
                count++;
                cn++;
            }
            maxCount = Math.max(count, maxCount);
            }
            
        }
        return maxCount+1;
    }
}