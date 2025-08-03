import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        int answer = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='i'){
                answer++;
                answer++;
            }else if(input.charAt(i)=='j'){
                answer++;
                answer++;
            }else if(input.charAt(i)=='o'){
                answer++;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}