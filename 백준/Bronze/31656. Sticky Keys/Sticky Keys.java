import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = ""+input.charAt(0);
        char sum = input.charAt(0);
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!= sum){
                answer += ""+input.charAt(i);
            }
            sum = input.charAt(i);
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}