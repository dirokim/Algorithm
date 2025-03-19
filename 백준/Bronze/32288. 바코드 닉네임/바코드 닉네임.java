import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String answer = "";
        for(int i=0;i<num;i++){
            if(input.charAt(i)=='I'){
                answer += "i";
            }else if(input.charAt(i)=='l'){
                answer += "L";
            }
        }
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}