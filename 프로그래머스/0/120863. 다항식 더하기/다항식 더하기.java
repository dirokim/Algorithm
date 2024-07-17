class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int num = 0;
        int num2 = 0;
        String val = "";
        String [] sum = polynomial.split(" ");
        for(int i=0;i<sum.length;i++){
            if(sum[i].equals("+")){
            }else{
                 if(sum[i].contains("x")){
                    val = sum[i].replace("x","");
                    if(val==""){
                        num++;
                    }else{
                        num+= Integer.parseInt(val);   
                    }
                }else{
                    num2 += Integer.parseInt(sum[i]);
                } 
            }
        }
        
        if(num>0 && num2>0){
            if(num==1){
            answer = "x + "+num2;    
            }else{
            answer = ""+num+"x + "+num2;   
            }
        }else if(num2==0){
            if(num==1){
            answer = "x";    
            }else{
            answer = ""+num+"x";   
            }
        }else if(num==0){
            answer = ""+num2;
        }
        return answer;
    }
}