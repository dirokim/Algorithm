import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = Integer.parseInt(br.readLine());
        int chk  = 0;
        int chk2 = 0;
        while((input = br.readLine()) != null){
            chk++;
            if(Integer.parseInt(input) <= num){
                chk2++;
                break;
            }
        }
        if(chk2 == 0){
            bw.write("Nothing");
        }else{
            if(chk == 1){
                bw.write("Watermelon");    
            }else if(chk == 2){
                bw.write("Pomegranates");
            }else if(chk == 3){
                bw.write("Nuts");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}