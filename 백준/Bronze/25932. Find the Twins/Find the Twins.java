import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int chk = 0;
        int chk2 = 0;
        String sum = "";
        while((input = br.readLine()) != null){
            chk  = 0;
            chk2 = 0;
            if(input.contains("17")){
                chk++;
            }
            if(input.contains("18")){
                chk2++;
            }
            bw.write(input+"\n");
            if(chk > 0 && chk2 > 0){
                bw.write("both\n\n");
            }else if(chk > 0 && chk2 == 0){
                bw.write("zack\n\n");
            }else if(chk == 0 && chk2 > 0){
                bw.write("mack\n\n");
            }else if(chk == 0 && chk2 == 0){
                bw.write("none\n\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}