class Solution {
    public String reverseWords(String s) {
        String result = "";
String word = "";

// Step 2: Traverse the string and collect words
for (int i = 0; i < s.length(); i++) {
    char currentChar = s.charAt(i);

    // If the current character is not a space, build the word
    if (currentChar != ' ') {
        word += currentChar;
    } 
    // When a space is encountered, check if a word has been built and add it
    else {
        if (word.length() > 0) {  // Only add the word if it's not empty
            result = word + " " + result;
            word = ""; // Reset the word
        }
    }
}

// Step 3: Add the last word (since there's no space after the last word)
if (word.length() > 0) {  // Add the last word if it's not empty
    result = word + " " + result;
}

// Step 4: Remove the trailing space
if (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
    result = result.substring(0, result.length() - 1);
}

return result;

    }
}