import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int numR = Integer.parseInt(st.nextToken());
        int avg = Integer.parseInt(st.nextToken());
        avg = avg * 2;
        int numR2 = avg - numR;
        bw.write(""+numR2);
        br.close();
        bw.flush();
        bw.close();
	} 
}