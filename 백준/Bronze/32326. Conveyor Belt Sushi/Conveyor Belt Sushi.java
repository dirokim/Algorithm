import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine()) * 3;
        int num2 = Integer.parseInt(br.readLine()) * 4;
        int num3 = Integer.parseInt(br.readLine()) * 5;
        int answer = num + num2 + num3;
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}