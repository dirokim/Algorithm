import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int sum  = 0;
        int sum2 = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            sum  = A[i];
            sum2 = B[B.length-i-1];
            answer += sum * sum2;
        }
        return answer;
    }
}