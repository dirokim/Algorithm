import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int length = Integer.parseInt(input);
        for(int i=0;i<length;i++){
            bw.write("SciComLove"+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}