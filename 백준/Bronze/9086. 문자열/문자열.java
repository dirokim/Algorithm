import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = input = br.readLine();
        String sum = "";
        while((input = br.readLine()) != null){ 
            sum = ""+input.charAt(0)+input.charAt(input.length()-1);
            bw.write(sum+"\n"); 
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}