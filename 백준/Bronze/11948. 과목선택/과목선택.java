import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int [] sum  = new int[4];
        int [] sum2 = new int[2];
        int num = 0;
        int num2 = 0;
        sum[0] = Integer.parseInt(br.readLine());
        sum[1] = Integer.parseInt(br.readLine());
        sum[2] = Integer.parseInt(br.readLine());
        sum[3] = Integer.parseInt(br.readLine());
        sum2[0] = Integer.parseInt(br.readLine());
        sum2[1] = Integer.parseInt(br.readLine());
        Arrays.sort(sum);
        Arrays.sort(sum2);
        num = sum[1]+sum[2]+sum[3]+sum2[1];
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}