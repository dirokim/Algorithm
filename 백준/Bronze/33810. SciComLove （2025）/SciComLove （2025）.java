import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = "SciComLove";
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==sum.charAt(i)){
            }else{
                count++;
            }
        }
        bw.write(""+count);
        br.close();
        bw.flush();
        bw.close();
	} 
}