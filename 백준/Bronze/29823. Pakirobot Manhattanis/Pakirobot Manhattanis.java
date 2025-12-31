import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum  = "";
        int num  = 0;
        int num2 = 0;
        int answer = 0;
        input = br.readLine();
        for(int i=0;i<input.length();i++){
            sum = "" + input.charAt(i);
            if(sum.equals("N")){
                num++;
            }
            if(sum.equals("S")){
                num--;
            }
            if(sum.equals("W")){
                num2++;
            }
            if(sum.equals("E")){
                num2--;
            }
        }
        answer  = Math.abs(num) + Math.abs(num2);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}