import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int [] sum = new int[num];
        int num2 = 0;
        while(st.hasMoreTokens()){
            sum[num2] = Integer.parseInt(st.nextToken());
            num2++;
        }
        Arrays.sort(sum);
        int answer  = sum[sum.length-1] - sum[0];
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}