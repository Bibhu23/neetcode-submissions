class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute force
        int res=0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //        res=Math.max(res,set.size());
        //     }
        // }
        // return res;

        //optimal
        Set<Character> set=new HashSet<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
