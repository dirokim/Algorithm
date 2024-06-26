class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String sum = "";
        String sumeone = "";
        for(int i=0;i<array.length;i++){
            sum = "" + array[i];
            for(int j=0;j<sum.length();j++){
                sumeone = "" + sum.charAt(j);
                if(sumeone.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}