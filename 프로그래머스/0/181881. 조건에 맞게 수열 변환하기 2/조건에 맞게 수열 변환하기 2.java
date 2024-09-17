class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int sum = 0;
        boolean check = true;
        while(check){
            sum = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] >= 50){
                    if(arr[i] % 2 ==0){
                        arr[i] = arr[i]/2;
                        sum++;
                    }
                }else if(arr[i] < 50){
                    if(arr[i]% 2 ==1){
                        arr[i] = arr[i]*2+1;
                        sum++;
                    }
                }
            }
            if(sum < 1){
                break;
            }
            answer++;
        }
        return answer;
    }
}