import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "True";
        while((input = br.readLine()) != null){
            if(Integer.parseInt(input) < 48){
                answer = "False";
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}