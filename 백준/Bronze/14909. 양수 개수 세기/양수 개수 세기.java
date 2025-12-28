import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = 0;
        int answer = 0;
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            if(num > 0) answer++;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}