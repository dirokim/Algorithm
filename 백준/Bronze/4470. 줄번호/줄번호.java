import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 1;
        while((input = br.readLine()) != null){
            bw.write(""+num+". "+input+"\n");
            num++;
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}