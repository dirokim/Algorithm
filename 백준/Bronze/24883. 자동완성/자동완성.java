import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        if(input.equals("N")){
            answer = "Naver D2";        
        }else if(input.equals("n")){
            answer = "Naver D2";
        }else{
            answer = "Naver Whale";
        }
        br.close();
        bw.write(answer);
        bw.flush();
        bw.close();
	} 
}