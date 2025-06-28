import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        if(val >= val2){
            bw.write("Congratulations, you are within the speed limit!");
        }else{
            val2 = val2 - val;
            if(val2 <= 20){
                bw.write("You are speeding and your fine is $100.");
            }else if(val2 > 20 && val2 < 31){
                bw.write("You are speeding and your fine is $270.");
            }else if(val2 >= 31){
                bw.write("You are speeding and your fine is $500.");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}