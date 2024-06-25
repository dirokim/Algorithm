class Solution {
    public int[] solution(int[] arr) {
        int sum = arr.length;
        int num = 1;
        while (num <= 1000){
              num = num*2;
            if(num>=sum){
                if(sum==1){
                    num=1;
                }
                break;
            }
        }
        int [] answer = new int[num];
        for(int i=0;i<arr.length;i++){
             answer[i]=arr[i];   
        }
        return answer;
    }
}