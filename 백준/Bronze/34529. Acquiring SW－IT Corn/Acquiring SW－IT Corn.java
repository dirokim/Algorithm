import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int d = Integer.parseInt(st2.nextToken()) / 100;
        int e = Integer.parseInt(st2.nextToken()) / 50;
        int f = Integer.parseInt(st2.nextToken()) / 20;
        int answer = (a * d) + (b * e) + (c * f);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}