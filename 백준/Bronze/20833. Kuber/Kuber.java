import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=1;i<=num;i++){
            answer += (i*i*i);
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}