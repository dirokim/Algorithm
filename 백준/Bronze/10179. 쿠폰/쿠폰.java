import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        double value = 0d;
        String answer = "";
        for(int i=0;i<num;i++){
            value = Double.parseDouble(br.readLine());
            answer = String.format("%.2f", value * 0.8);
            bw.write("$"+answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}