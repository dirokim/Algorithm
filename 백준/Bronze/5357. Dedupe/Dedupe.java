import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String answer = "";
        String sum = "";
        String sum2 = "";
        while((input = br.readLine()) != null){
            for(int i=0;i<input.length();i++){
                sum = ""+input.charAt(i);
                if(i == 0){
                    answer = sum;
                }else{
                    sum2 = ""+input.charAt(i-1);
                    if(sum2.equals(sum)){
                        
                    }else{
                        answer += sum;
                    }
                } 
            }
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}