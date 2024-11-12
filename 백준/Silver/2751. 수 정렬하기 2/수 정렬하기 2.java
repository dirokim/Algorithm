import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        long num = 0;
        int length = 0;
        long [] sum = new long[Integer.parseInt(input)];
        String answer = "";
        while((input = br.readLine()) != null){ 
            num = Long.parseLong(input);
            sum[length] = num;
            length++;
        }
        Arrays.sort(sum);
        for(int i=0;i<sum.length;i++){
            num = sum[i];
            bw.write(""+num+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}