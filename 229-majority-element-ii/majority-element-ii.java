class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer> lt = new ArrayList<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>(n/3) && !lt.contains(num)){
                lt.add(num);
            } 
        }
        return lt;
    }
}