class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int i = 0;
        for(int num : nums){
            if(!st.contains(num)){
                st.add(num);
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}