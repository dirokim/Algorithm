import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;
        for(int i=0;i<input.length();i++){
            sum += Integer.parseInt(""+input.charAt(i));
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}