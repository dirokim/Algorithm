import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int [] sum = new int[Integer.parseInt(input)];
        while((input = br.readLine()) != null){
            sum[num] = Integer.parseInt(input);
            num++;
        }
        Arrays.sort(sum);
        for(int i=0;i<sum.length;i++){
            bw.write(""+sum[i]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}