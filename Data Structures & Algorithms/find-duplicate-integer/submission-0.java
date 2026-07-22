class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > 1){
                return key;
            }
        }
        return -1;
    }
}
