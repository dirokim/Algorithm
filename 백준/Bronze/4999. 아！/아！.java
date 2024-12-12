import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String sum  = br.readLine();
        String sum2 = br.readLine();
        String answer = (sum.length() >= sum2.length())? "go" : "no";
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}