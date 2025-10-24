import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st2.nextToken());
        int answer = 0;
        answer = val - num;
        bw.write(""+answer);
        val = Integer.parseInt(st2.nextToken());
        answer = val - num;
        bw.write(" "+answer);
        val = Integer.parseInt(st2.nextToken());
        answer = val - num;
        bw.write(" "+answer);
        val = Integer.parseInt(st2.nextToken());
        answer = val - num;
        bw.write(" "+answer);
        val = Integer.parseInt(st2.nextToken());
        answer = val - num;
        bw.write(" "+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}