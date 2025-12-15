import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int chk = 0;
        while((input = br.readLine()) != null){
            if(input.equals("anj")) chk++;
        }
        if(chk > 0){
            bw.write("뭐야;");
        }else{
            bw.write("뭐야?");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}