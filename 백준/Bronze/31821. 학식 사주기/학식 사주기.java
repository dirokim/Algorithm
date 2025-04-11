import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        int [] sum = new int[length];
        int answer = 0;
        for(int i=0;i<length;i++){
            sum[i] = Integer.parseInt(br.readLine());
        }
        length = Integer.parseInt(br.readLine());
        for(int j=0;j<length;j++){
            answer += sum[Integer.parseInt(br.readLine())-1];
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}