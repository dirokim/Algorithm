import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        char sum = '0';
        for(int i=65;i<=90;i++){
            sum = (char)i;
            if(input.contains(""+sum)){
                
            }else{
                break;
            }    
        }
        bw.write(""+sum);
        br.close();
        bw.flush();
        bw.close();
	} 
}