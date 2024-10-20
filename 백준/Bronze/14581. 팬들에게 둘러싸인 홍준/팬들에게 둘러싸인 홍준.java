import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        answer += ":fan::fan::fan:"+"\n";
        answer += ":fan::"+input+"::fan:"+"\n";
        answer += ":fan::fan::fan:";
        br.close();
        bw.write(answer);
        bw.flush();
        bw.close();
	} 
}