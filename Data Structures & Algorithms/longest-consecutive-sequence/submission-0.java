class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        // brute force
        int res=0;
        // for(int num : nums){
        //     int streak=0,curr=num;
        //     while(set.contains(curr)){
        //         streak++;
        //         curr++;
        //     }
        //     res=Math.max(res,streak);
        // }
        // return res;

        for(int num : nums){
            if(!set.contains(num-1)){
               int length=1;
               while(set.contains(num+length)){
                length++;
               }
               res=Math.max(res,length);
            }
        }
        return res;
    }
}
