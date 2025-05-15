import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        input = input % 14;
        if(input == 0) input = 14;
        String smupc = "WelcomeToSMUPC";
        String answer = ""+smupc.charAt(input-1);
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}