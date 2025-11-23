import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        while((input = br.readLine()) != null){
            if(input.equals("-1"))break;
            num += Integer.parseInt(input);
        }
        bw.write(""+num);
        br.close();
        bw.flush();
        bw.close();
	} 
}