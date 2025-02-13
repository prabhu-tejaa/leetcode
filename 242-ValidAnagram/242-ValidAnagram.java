class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int[] freq = new int[26];
        if(sLength != tLength){
            return false;
        }

        for(int i = 0; i < sLength; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}