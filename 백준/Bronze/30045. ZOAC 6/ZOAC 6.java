import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int answer = 0;
        while((input = br.readLine()) != null){
            if(input.contains("01") || input.contains("OI")){
                answer++;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}