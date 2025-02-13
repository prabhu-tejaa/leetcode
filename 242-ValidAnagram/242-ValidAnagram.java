class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        if(sLength != tLength){
            return false;
        };
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            freqMap.put(ch1, freqMap.getOrDefault(ch1, 0) + 1);
            freqMap.put(ch2, freqMap.getOrDefault(ch2, 0) - 1);
        }

        for (int value : freqMap.values()) {
            if (value != 0) return false;
        }

        return true;
        }
}