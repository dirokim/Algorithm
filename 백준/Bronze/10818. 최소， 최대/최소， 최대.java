import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        String [] sum = input.split(" ");
        String answer = "";
        int num  = Integer.parseInt(sum[sum.length-1]);
        int num2 = Integer.parseInt(sum[0]);
        for(int i=0;i<sum.length;i++){
            if(num > Integer.parseInt(sum[i])){
                num = Integer.parseInt(sum[i]);
            }
            if(num2 < Integer.parseInt(sum[i])){
                num2 = Integer.parseInt(sum[i]);
            }
        }
        answer = ""+num+" "+num2;
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}