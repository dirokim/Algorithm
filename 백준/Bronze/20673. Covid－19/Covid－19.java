import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        String answer = "Yellow";
        if(num <= 50 && num2 <= 10){
            answer = "White";
        }else if(num2 > 30){
            answer = "Red";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}