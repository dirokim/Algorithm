import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        double input = Double.parseDouble(br.readLine());
        int answer  = (int)Math.floor(input);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}