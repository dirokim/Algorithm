import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        long answer = 0L;
        int num = 0;
        int sum = 0;
        for(int i=0;i<input.length();i++){
            num = 0;
            num = Integer.parseInt(""+input.charAt(i));
            sum = num * num * num * num * num;
            answer += (long)sum;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}