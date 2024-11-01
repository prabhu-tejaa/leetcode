class Solution {
    public int mostWordsFound(String[] sentences) {
        int sizeOfString = sentences.length;
        int count = 0;
        for(int i = 0;i<sizeOfString;i++){
            String singleSentence = sentences[i];
            int counter = 1;
            for(int j = 0;j<singleSentence.length();j++){
                if(singleSentence.charAt(j) == ' '){
                    counter++;
                }
                if(count < counter){
                    count = counter;
                }
            }
        }
        return count;
    }
}