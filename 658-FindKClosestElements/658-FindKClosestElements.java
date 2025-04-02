// Last updated: 4/3/2025, 1:48:15 AM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int arrLength = arr.length;
        int leftPointer = 0;
        int rightPointer = arrLength-1;

        while(rightPointer-leftPointer+1>k){
            if(Math.abs(arr[leftPointer]-x) > Math.abs(arr[rightPointer]-x)){
                leftPointer++;
            } else{
                rightPointer--;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(int i = leftPointer;i<=rightPointer;i++){
            answer.add(arr[i]);
        }
        return answer;
    }
}