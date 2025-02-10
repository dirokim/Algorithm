import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        if(num >= 2024){
            answer = num - 2024;
        }else if(num < 2024){
            answer = 2024 - num;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}