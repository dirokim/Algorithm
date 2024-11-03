import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine(); 
        String answer = "0";
        int num = Integer.parseInt(input);
        if(num%4==0){
            if(num % 100 != 0 || num % 400 == 0){
                answer = "1";   
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}