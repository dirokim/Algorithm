import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out)); 
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int answer = a+b;
        String sum = ""+answer;
        br.close();
        bw.write(sum);
        bw.flush();
        bw.close();
	} 
}