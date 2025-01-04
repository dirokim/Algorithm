import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        int chk = 0;
        int sum = 0;
        int num2 = 0;
        while((input = br.readLine()) != null){  
            num = Integer.parseInt(input);
            if(num % 2 == 1){
                if(chk == 0){
                    num2 = num;
                }
                chk++;
                sum += num;
                if(num2 > num){
                    num2 = num;
                }
            }
        }
        if(chk == 0){
            bw.write("-1");
        }else{
            bw.write(""+sum+"\n");
            bw.write(""+num2);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}