import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
            sum3 = sum3 + (i * i * i);
        };
        sum2 = sum * sum;
        bw.write(""+sum+"\n");
        bw.write(""+sum2+"\n");
        bw.write(""+sum3);
        br.close();
        bw.flush();
        bw.close();
	} 
}