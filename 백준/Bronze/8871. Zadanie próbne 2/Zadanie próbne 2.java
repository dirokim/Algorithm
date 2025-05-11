import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int answer = num * 2 + 2;
        int answer2 = num * 3 + 3;
        bw.write(""+answer+" "+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}