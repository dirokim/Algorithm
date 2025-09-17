import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken())*56;
        num += Integer.parseInt(st.nextToken())*24;
        num += Integer.parseInt(st.nextToken())*14;
        num += Integer.parseInt(st.nextToken())*6;
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}