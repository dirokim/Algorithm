import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        String highpon = "";
        while((input = br.readLine()) != null){
            num = Integer.parseInt(input);
            highpon = "";
            for(int i=0;i<num;i++){
                highpon += "=";
            }
            bw.write(highpon+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}