import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num  = Integer.parseInt(br.readLine());
        double val  = num - (num * 0.22);
        double val2 = num - ((num * 0.2) * 0.22);
        bw.write(""+(int)val +" "+(int)val2);
        br.close();
        bw.flush();
        bw.close();
	} 
}