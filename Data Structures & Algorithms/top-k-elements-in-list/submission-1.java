class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) +1 );
        }
        PriorityQueue<Integer> pq=new PriorityQueue((a,b)-> map.get(a)-map.get(b));
        for(int n:map.keySet()){
            pq.add(n); //1,2,3
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}
