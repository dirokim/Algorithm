import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int answer = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        answer += Integer.parseInt(br.readLine());
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}