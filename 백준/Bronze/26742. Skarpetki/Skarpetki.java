import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int black = 0;
        int white = 0;
        int answer = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='C'){
                white++;
            }else if(input.charAt(i)=='B'){
                black++;
            }
        }
        answer = (black / 2) + (white / 2);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}