import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String input2 = "";
        String sum = "";
        String sum2 = "";
        int answer = 0;
        while((input = br.readLine()) != null){
            input2 = br.readLine();
            answer = 0;
            for(int i=0;i<input.length();i++){
                sum = ""+input.charAt(i);
                sum2 = ""+input2.charAt(i);
                if(sum.equals(sum2)){
                    
                }else{
                    answer++;
                }
            }
            bw.write("Hamming distance is "+answer+".\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}