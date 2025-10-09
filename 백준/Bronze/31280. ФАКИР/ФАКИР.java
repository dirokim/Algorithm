import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [] sum = new int[4];
        int num = -1;
        while(st.hasMoreTokens()){
            num++;
            sum[num] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sum);
        int answer = sum[1]+sum[2]+sum[3]+1;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}