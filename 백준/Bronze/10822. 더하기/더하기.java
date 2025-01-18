import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input,",");
        int answer = 0;
        while(st.hasMoreTokens()){
            answer += Integer.parseInt(st.nextToken());
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}