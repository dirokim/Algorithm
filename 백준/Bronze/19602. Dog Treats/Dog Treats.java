import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int sum = (1 * num) + (2 * num2) + (3 * num3);
        String answer = "sad";
        if(sum >= 10){
            answer = "happy";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}