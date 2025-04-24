// Last updated: 4/24/2025, 7:31:11 AM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry = (a&b)<<1;
            a=a^b;
            b=carry;
        }
        return a;
    }
}
