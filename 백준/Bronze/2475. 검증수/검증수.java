import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        long num = 0;
        long sum = 0;
        StringTokenizer st = new StringTokenizer(input," ");
        while(st.hasMoreTokens()){
            num = Long.parseLong(st.nextToken());
            if(num == 0) continue;
            sum += num*num;
        }
        sum = sum%10;
        String answer = ""+sum;
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}