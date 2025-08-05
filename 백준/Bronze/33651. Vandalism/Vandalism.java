import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        if(!input.contains("U")){
            answer += "U";
        }
        if(!input.contains("A")){
            answer += "A";
        }
        if(!input.contains("P")){
            answer += "P";
        }
        if(!input.contains("C")){
            answer += "C";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}