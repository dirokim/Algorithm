import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        String answer = "" + num;
        num = answer.length();
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}