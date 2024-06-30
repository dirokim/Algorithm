class Solution {
    public int solution(int[] numbers, int k) {
        int sum = numbers.length;
            sum = ((k-1)*2)%sum;
        return numbers[sum];
    }
}