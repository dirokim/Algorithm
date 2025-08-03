import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int answer = 0;
        int num = 0;
        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());
            answer += (num / 2)+ (num % 2 );
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}