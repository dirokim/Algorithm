import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine()) * 8;
        int b = Integer.parseInt(br.readLine()) * 3;
        a = (a+b)-28;
        if(a < 0) a = 0;
        bw.write(""+a);
        br.close();
        bw.flush();
        bw.close();
	} 
}