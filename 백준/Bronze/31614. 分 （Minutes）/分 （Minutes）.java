import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int hour = Integer.parseInt(br.readLine());
        int minute = Integer.parseInt(br.readLine());
        int answer = hour * 60 + minute;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}