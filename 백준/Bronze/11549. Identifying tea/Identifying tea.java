import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num    = Integer.parseInt(br.readLine());
        int answer = 0;
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken()) == num) answer++;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}