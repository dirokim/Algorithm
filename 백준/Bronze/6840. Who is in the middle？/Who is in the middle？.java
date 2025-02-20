import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int [] sum = new int[3];
        sum[0] = Integer.parseInt(br.readLine());
        sum[1] = Integer.parseInt(br.readLine());
        sum[2] = Integer.parseInt(br.readLine());
        Arrays.sort(sum);
        bw.write(""+sum[1]);
        br.close();
        bw.flush();
        bw.close();
	} 
}