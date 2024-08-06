class Solution {
    public long solution(long n) {
        long answer = 0;
        String sum = ""+n;
        String [] arr = new String[sum.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]= ""+sum.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(Integer.parseInt(arr[j])>Integer.parseInt(arr[i])){
                    sum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sum;
                }
            }
        }
        sum="";
        for(int k=0;k<arr.length;k++){
            sum += arr[k];
        }
        answer = Long.parseLong(sum);
        return answer;
    }
}