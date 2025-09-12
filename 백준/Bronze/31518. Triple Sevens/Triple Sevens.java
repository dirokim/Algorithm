import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int chk = 0;
        input = br.readLine();
        if(input.contains("7")){
            chk++;
        }
        input = br.readLine();
        if(input.contains("7")){
            chk++;
        }
        input = br.readLine();
        if(input.contains("7")){
            chk++;
        }
        if(chk == 3){
            bw.write("777");
        }else{
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}