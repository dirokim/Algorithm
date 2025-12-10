import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String input2 = br.readLine();
        String answer = "";
        for(int i=0;i<input.length();i++){
            if(Integer.parseInt(""+input.charAt(i)) >= Integer.parseInt(""+input2.charAt(i))){
                answer += ""+ input.charAt(i);
            }else{
                answer += ""+ input2.charAt(i);
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}