import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        num = sum / num;
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}