import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String sum  = "";
        String sum2 = "";
        for(int i=0;i<num;i++){
            sum  = br.readLine();
            sum2 = sum.substring(0,1);
            sum2 = sum2.toUpperCase();
            sum  = sum.substring(1,sum.length());
            sum  = sum2 + sum;
            bw.write(sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}