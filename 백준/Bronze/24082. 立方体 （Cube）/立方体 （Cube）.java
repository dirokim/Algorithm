import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        Long num = Long.parseLong(br.readLine());
        num = num * num * num;
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}