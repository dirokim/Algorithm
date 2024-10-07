import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int sum = Integer.parseInt(br.readLine());
        String answer = ""+input.charAt(sum-1);
        br.close();
        bw.write(answer);
        bw.flush();
        bw.close();
	} 
}