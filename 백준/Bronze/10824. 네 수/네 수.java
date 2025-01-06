import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String sum = st.nextToken()+st.nextToken();
        String sum2 = st.nextToken()+st.nextToken();
        long num = Long.parseLong(sum)+Long.parseLong(sum2);
        String answer = ""+num;
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}