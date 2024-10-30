/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int sol = (rand7()-1)+7*(rand7()-1);
        while(sol>=40){
            sol = (rand7()-1)+7*(rand7()-1);
        }
        return (sol%10)+1;
    }
}