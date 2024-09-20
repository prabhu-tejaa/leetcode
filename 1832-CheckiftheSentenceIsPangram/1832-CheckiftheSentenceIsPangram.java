class Solution {
    public boolean checkIfPangram(String sentence) {
        int sentenceSize = sentence.length();
        boolean[] sentenceEntry = new boolean[26];
        for(int i = 0; i < sentenceSize; i++){
            sentenceEntry[sentence.charAt(i)-'a'] = true;
        }
        for(int i =0; i < 26; i++){
            if(sentenceEntry[i] == false){
                return false;
            }
        }
    return true;    
    }
}