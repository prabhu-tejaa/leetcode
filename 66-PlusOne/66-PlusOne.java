// Last updated: 7/22/2025, 10:59:44 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLength = digits.length;

        for(int i = digitsLength - 1; i >= 0; i--){

            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digitsLength + 1];
        result[0] = 1;
        return result;
    }
}