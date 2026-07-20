class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //    for(int j=i+1;j<nums.length;j++){
        //     if(nums[i] + nums[j] == target){
        //         return new int[] {i,j};
        //     }
        //    }
        // }
        // return new int[] {};

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val)){
              return new int[] {map.get(val), i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
