import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int val  = 0; 
        while((input = br.readLine()) != null){
            val  = 0; 
            for(int i=0;i<input.length();i++){
                if(input.charAt(i) == 'D'){
                    break;
                }else if(input.charAt(i) == 'U'){
                    val++;
                }
            }
            bw.write(""+val+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}