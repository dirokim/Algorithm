import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int val  = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        int answer = 0;
        if(val > val2){
            answer += 500;
        }
        answer += (val * 50) - (val2 * 10);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}