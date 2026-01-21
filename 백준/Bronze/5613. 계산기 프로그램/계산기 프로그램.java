import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        int answer = Integer.parseInt(br.readLine());
        while((input = br.readLine()) != null){
            if(input.equals("="))break;
            num = Integer.parseInt(br.readLine());
            if(input.equals("+")){
                answer += num;
            }else if(input.equals("-")){
                answer -= num;
            }else if(input.equals("*")){
                answer *= num;
            }else if(input.equals("/")){
                answer /= num;
            }
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}