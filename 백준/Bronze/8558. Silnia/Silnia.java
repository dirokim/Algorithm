import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 1;
        String answer = "";
        for(int i=1;i<=num;i++){
            sum *= i;
        }
        answer = ""+sum;
        answer = answer.substring(answer.length()-1,answer.length());
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}