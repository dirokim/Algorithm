import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        Long [] sum = new Long[Integer.parseInt(input)];
        int num = 0;
        while((input = br.readLine()) != null){
            sum[num] = Long.parseLong(input);
            num++;
        }
        Arrays.sort(sum);
        for(int i=sum.length-1;i>=0;i--){
            bw.write(""+sum[i]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}