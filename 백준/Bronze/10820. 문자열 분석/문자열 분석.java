import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num  = 0;
        int num2 = 0; 
        int num3 = 0; 
        int num4 = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            num  = 0;
            num2 = 0;
            num3 = 0;
            num4 = 0;
            for(int i=0;i<input.length();i++){
                if(Character.isLowerCase(input.charAt(i))){
                    num++;
                }else if(Character.isUpperCase(input.charAt(i))){
                    num2++;
                }else if(Character.isDigit(input.charAt(i))){
                    num3++;
                }else if(input.charAt(i)==' '){
                    num4++;
                }
            }
            answer = ""+num+" "+num2+" "+num3+" "+num4+"\n";
            bw.write(answer);
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}