class Solution {
    public int subtractProductAndSum(int n) {
        int productOfDigits=1,sumOfDigits=0;
        while(n!=0){
            int lastDigit = n%10;
            productOfDigits *= lastDigit;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return productOfDigits - sumOfDigits;
    }
}