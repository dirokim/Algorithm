import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = input.length();
        String answer = "";
        for(int i=num-1;i>=0;i--){
          answer += ""+input.charAt(i);  
        } 
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}