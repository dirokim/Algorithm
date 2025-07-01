import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int answer = 0;
        while((input = br.readLine()) != null){
            num  = Integer.parseInt(input);
            answer += num;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}