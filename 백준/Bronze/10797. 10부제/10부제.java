import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int answer = 0; 
        while(st.hasMoreTokens()){ 
            if(num == Integer.parseInt(st.nextToken()))answer++;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}