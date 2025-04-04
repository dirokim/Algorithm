import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Long num  = Long.parseLong(st.nextToken());
        Long num2  = Long.parseLong(st.nextToken());
        Long answer = (num+num2) * (num-num2);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}