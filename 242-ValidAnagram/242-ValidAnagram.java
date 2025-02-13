class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        if(sLength != tLength){
            return false;
        };

        for(int i = 0; i< sLength; i++){
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i< tLength;i++){
            char ch = t.charAt(i);
               if (!freqMap.containsKey(ch) || freqMap.get(ch) == 0) {
                return false;
            }
            freqMap.put(ch, freqMap.get(ch) - 1);
        }
        for (int count : freqMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;




    }
}