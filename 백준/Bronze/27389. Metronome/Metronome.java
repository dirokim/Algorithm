import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        double num = Double.parseDouble(br.readLine());
        num = num / 4;
        bw.write(String.format("%.2f",num));
        br.close();
        bw.flush();
        bw.close();
	} 
}