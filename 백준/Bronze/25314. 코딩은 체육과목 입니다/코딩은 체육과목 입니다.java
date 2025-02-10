import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        num = num / 4;
        String answer = "";
        for(int i=0;i<num;i++){
            answer += "long ";
        }
        answer += "int";
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}