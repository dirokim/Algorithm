import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int sum = 0;
        int val = 0;
        int num = 0;
        while((input = br.readLine()) != null){
            num++;
            val = Integer.parseInt(input);
            if(val < 40){
                val = 40;
            }
            sum += val;
        }
        double avg = sum/num;
        bw.write(""+(int)avg);
        br.close();
        bw.flush();
        bw.close();
	} 
}