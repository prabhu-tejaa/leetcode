class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += findDivisorsSum(n);
        }
        return sum;
    }
    public int findDivisorsSum(int n){
        int sum = 0;
        int count = 0;
        for(int i=1; i*i<=n;i++){
            if(n%i == 0){
               if(n/i == i){
                    count++;
                    sum+=i;
               } else {
                count+=2;
                sum+=(i+n/i);
                }
            }
        if(count > 4){
            return 0;
        }
    }
    return count == 4 ? sum : 0;
    }
}