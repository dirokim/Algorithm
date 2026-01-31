import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int answer = 0;
        int num  = 0;
        char sum = 'a';
        for(int i=0;i<input.length();i++){
            sum = input.charAt(i);
            num = (int)sum - 64;
            answer += num;
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}