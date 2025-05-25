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
        int [] sum = new int[3];
        sum[0] = a;
        sum[1] = b;
        sum[2] = c;
        Arrays.sort(sum);
        int answer = sum[1] + sum[2];
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}