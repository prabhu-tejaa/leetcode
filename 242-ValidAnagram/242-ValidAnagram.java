// Last updated: 4/3/2025, 11:25:19 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int sSize = s.length();
        int tSize = t.length();
        int initial = 1;

        if(sSize != tSize){
            return false;
        }

        for(int i = 0; i<sSize;i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i = 0;i<tSize;i++){
            char ch= t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
    return true;
    }
}