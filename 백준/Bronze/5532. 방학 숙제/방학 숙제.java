import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int day = Integer.parseInt(br.readLine());
        int val = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        if(val % num == 0){
            val = val/num;
        }else{
            val = val/num + 1;
        }
        if(val2 % num2 == 0){
            val2 = val2/num2;
        }else{
            val2 = val2/num2 + 1;
        }
        if(val >= val2){
            day = day - val;
        }else{
            day = day - val2;
        }
        bw.write(""+day);
        br.close();
        bw.flush();
        bw.close();
	} 
}