// Last updated: 4/4/2025, 9:18:00 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // can be slove using Set cause we need unique elements since problem states without repeating character
        Set<Character> longestSubstringWithoutRepeatingCharacter = new HashSet<>();
        int left = 0;
        int max = 0;
        int givenStringLength = s.length();

        for(int right = 0;right<givenStringLength;right++){
            char currentCharacter = s.charAt(right);
            while(longestSubstringWithoutRepeatingCharacter.contains(currentCharacter)){
                longestSubstringWithoutRepeatingCharacter.remove(s.charAt(left));
                left++;
            }
            longestSubstringWithoutRepeatingCharacter.add(currentCharacter);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}