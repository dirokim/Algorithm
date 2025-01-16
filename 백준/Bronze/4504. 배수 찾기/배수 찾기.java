import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = Integer.parseInt(br.readLine()); 
        int sum = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            sum = Integer.parseInt(input);
            answer = "";
            if(sum % num == 0){
                answer = ""+sum+" is a multiple of "+num+".";
            }else if(sum % num != 0){
                answer = ""+sum+" is NOT a multiple of "+num+".";
            }
            if(sum == 0){
                
            }else{
                bw.write(answer+"\n");    
            }
        } 
        br.close();
        bw.flush();
        bw.close();
	} 
}