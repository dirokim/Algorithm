import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        if(input.equals("0")){
            answer = "YONSEI";
        }else if(input.equals("1")){
            answer = "Leading the Way to the Future";
        } 
        br.close();
        bw.write(answer);
        bw.flush();
        bw.close();
	} 
}