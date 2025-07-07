import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int numA = 0;
        int numB = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='A'){
                numA++;
            }else if(input.charAt(i)=='B'){
                numB++;
            }
        }
        bw.write(""+numA+" : "+numB);
        br.close();
        bw.flush();
        bw.close();
	} 
}

