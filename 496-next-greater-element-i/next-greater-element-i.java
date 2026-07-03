class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums2.length;
        int[] res = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();

            st.push(nums2[i]);
        }
        for(int i = 0; i<n; i++){
            map.put(nums2[i], res[i]);
        }
        for(int i = 0; i<nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1; 
    }
    
}