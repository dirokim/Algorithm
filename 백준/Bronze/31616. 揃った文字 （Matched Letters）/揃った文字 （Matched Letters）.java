import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        char sum = input.charAt(0);
        String answer = "Yes";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)== sum){
                
            }else{
                answer = "No";
                break;
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}