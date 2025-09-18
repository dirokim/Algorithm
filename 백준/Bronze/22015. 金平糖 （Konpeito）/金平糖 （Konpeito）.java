import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int answer = 0;
        if(num <= num3){
            answer += num3 - num;
        }
        if(num2 <= num3){
            answer += num3 - num2;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}