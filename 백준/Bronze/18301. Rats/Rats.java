import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken())+1;
        int num2 = Integer.parseInt(st.nextToken())+1;
        int num3 = Integer.parseInt(st.nextToken())+1;
        int answer = num * num2 / num3 -1;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}