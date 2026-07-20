class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()){
           return false;
         }
         Map<Character,Integer> map=new HashMap<>();
         for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         for(char ch : s.toCharArray()){
            if(map.getOrDefault(ch,0) > 0){
                map.put(ch,map.get(ch)-1);
            }
         }
        for(int val:map.values()){
          if(val !=0) return false;
         }
         return true;
    }
}