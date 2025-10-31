import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());
        int answer = 0;
        if((a+d) <= (b+c)){
            answer  = a+d;
        }else{
            answer  = b+c;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}