import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String sum = input.substring(num-1,num);
        String answer = "";
        if(sum.equals("G")){
           answer = input.substring(0,num-1);
        }else{
            answer = input + "G";
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}