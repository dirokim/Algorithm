import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        String sum = "";
        for(int i=0;i<input.length();i++){
            sum = ""+input.charAt(i);
            if(Character.isUpperCase(input.charAt(i))){
                answer += sum.toLowerCase();
            }else if(Character.isLowerCase(input.charAt(i))){
                answer += sum.toUpperCase();
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}