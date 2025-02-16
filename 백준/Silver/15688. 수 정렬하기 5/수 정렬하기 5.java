import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num  = Integer.parseInt(br.readLine());
        long [] sum = new long[num];
        int num2 = 0;
        while((input = br.readLine()) != null){
            sum[num2] = Long.parseLong(input);
            num2++;
        }
        Arrays.sort(sum);
        for(long a : sum){
            bw.write(""+a+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}