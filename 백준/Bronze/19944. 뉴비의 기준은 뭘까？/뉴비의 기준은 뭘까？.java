import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        int num  = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        if(num2 == 1 || num2 == 2){
            bw.write("NEWBIE!");
        }else if(num >= num2 && num2 > 2){
            bw.write("OLDBIE!");
        }else{
            bw.write("TLE!");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}