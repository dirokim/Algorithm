import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        long sum = Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken());
        long num = Long.parseLong(br.readLine());
        num *= 2;
        if(sum-num >= 0){
            sum -= num;
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}