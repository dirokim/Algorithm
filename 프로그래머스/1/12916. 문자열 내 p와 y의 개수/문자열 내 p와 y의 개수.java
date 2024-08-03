class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        String sum = "";
        for(int i=0;i<s.length();i++){
            sum = ""+s.charAt(i);
            if(sum.equalsIgnoreCase("p")){
                pNum++;
            }else if(sum.equalsIgnoreCase("y")){
                yNum++;
            }
        }
        answer = pNum == yNum ? true : false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);
        return answer;
    }
}