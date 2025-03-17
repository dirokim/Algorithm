import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int chk = 0;
        while((input = br.readLine()) != null){
            chk = 0;
            if(input.equals("Never gonna give you up")){
                
            }else if(input.equals("Never gonna let you down")){
                
            }else if(input.equals("Never gonna run around and desert you")){
                
            }else if(input.equals("Never gonna make you cry")){
                
            }else if(input.equals("Never gonna say goodbye")){
                
            }else if(input.equals("Never gonna tell a lie and hurt you")){
                
            }else if(input.equals("Never gonna stop")){
                
            }else{
                chk++;
            }
            if(chk > 0){
                bw.write("Yes");
                break;
            }
        }
        if(chk == 0) bw.write("No");
        br.close();
        bw.flush();
        bw.close();
	} 
}