import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        num = num2 - num;
        bw.write(""+num+" "+num2);
        br.close();
        bw.flush();
        bw.close();
	} 
}