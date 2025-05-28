import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int answer = 3;
        while((input = br.readLine()) != null){
            answer += Integer.parseInt(input);
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}