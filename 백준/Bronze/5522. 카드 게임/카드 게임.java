import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int a = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            a += Integer.parseInt(input);
        }
        answer += ""+a;
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}