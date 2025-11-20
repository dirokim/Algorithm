import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        double num = Double.parseDouble(br.readLine());
        String answer = "";
        num = num / 100d + 25d;
        if(num < 100d) num = 100d;
        if(num > 2000d) num = 2000d;
        answer = String.format("%.2f", num);
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}